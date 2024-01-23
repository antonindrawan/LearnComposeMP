import com.android.build.api.dsl.ApplicationExtension
import org.anton.learncmp.configureKotlinAndroid
import org.anton.learncmp.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with (target) {
            with (pluginManager) {
                apply("com.android.application")
            }
            println("AndroidApplicationConventionPlugin: apply")

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                defaultConfig {
                    targetSdk = libs.findVersion("android-targetSdk").get().toString().toInt()
                    println("defaultConfig.targetSdk: $targetSdk")
                }
            }
        }
    }
}