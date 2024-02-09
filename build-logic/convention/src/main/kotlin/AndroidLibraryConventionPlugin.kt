import com.android.build.gradle.LibraryExtension
import org.anton.learncmp.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure


class AndroidLibraryConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(com.android.build.gradle.LibraryPlugin::class.java)
            }
            println("AndroidLibraryConventionPlugin: apply")

            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
            }

        }
    }
}