import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/5/29
 *     desc  : 如果出现红色警告可以忽略，不会影响项目的编译和运行
 * </pre>
 */
class VersionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        println("[${VersionPlugin::class.java.simpleName}] apply.[${target.name}]")
        // 在非build.gradle的的脚本中无法访问到该内容，添加到extensions
        target.extensions.add("AndroidX", AndroidX)
    }
}