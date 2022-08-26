plugins {
    kotlin("jvm") version "1.7.10"
    `java-gradle-plugin`
}

buildscript {
    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://jitpack.io")
        google()
        mavenCentral()
    }
}

repositories {
    maven("https://maven.aliyun.com/repository/public")
    maven("https://maven.aliyun.com/repository/google")
    maven("https://jitpack.io")
    google()
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
}

gradlePlugin {
    plugins {
        create("version") {
            id = "com.cai.version_manager"
            implementationClass = "VersionPlugin"
        }
    }
}

tasks.register("updateVersion") {
    doLast {
        val versionsFile = File("${rootProject.projectDir.path}/versions.gradle")
        val outputFile = File("${rootProject.projectDir.path}/src/main/kotlin/VersionOutput.kt")

        var content = ""

        versionsFile.forEachLine {
            val line = it.trim().replace("\'", "\"")
            val str = line.split("\"")

            if (line.startsWith("//@group=")) {
                content += "\nobject ${it.split("=").last()} {\n"
            } else if (line == "}") {
                content += "}\n"
            } else if (str.size == 3) {
                val fra = str[1].split(":")
                if (fra.size == 3) {
                    var name = fra[1].replace("-", "_")
                    if (str[0].trim() == "kapt") {
                        name += "_kapt"
                    }
                    if (fra[0] == "androidx.test.ext" && fra[1] == "junit"){
                        name += "Android"
                    }
                    content += "\tconst val $name = \"${str[1]}\"\n"
                    println("add dependency item : name = $name")
                }
            } else if (line.startsWith("dependencies") && line.endsWith("{")) {
                return@forEachLine
            } else {
                if (it.isNotBlank()) {
                    content += "$it\n"
                }
            }
        }
        outputFile.writeText(content)
    }
}