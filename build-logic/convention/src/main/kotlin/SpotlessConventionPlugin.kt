
import com.diffplug.gradle.spotless.SpotlessExtension
import org.anton.learncmp.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class SpotlessConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with (target) {
            with (pluginManager) {
                apply("com.diffplug.spotless")
            }

            val ktlinVersion = libs.findVersion("ktlint").get().toString()
            println("ANTON ktlinVersion: $ktlinVersion")
            extensions.configure<SpotlessExtension> {
                kotlin {
                    target("**/*.kt")
                    targetExclude("**/build/**/*.kt")
                    ktlint(ktlinVersion).setEditorConfigPath(rootProject.file("spotless/.editorconfig"))
                    // TODO: licenseHeaderFile(rootProject.file("spotless/copyright.kt"))
                }
                kotlinGradle {
                    target("**/*.kts")
                    targetExclude("**/build/**/*.kts")
                    ktlint(ktlinVersion).setEditorConfigPath(rootProject.file("spotless/.editorconfig"))
                }
            }
        }
    }
}