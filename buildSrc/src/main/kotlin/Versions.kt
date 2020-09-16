import kotlin.String
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val com_github_bumptech_glide: String = "4.11.0"

    const val org_jetbrains_kotlin: String = "1.4.10"

    const val com_google_dagger: String = "2.29.1-alpha"

    const val org_junit_jupiter: String = "5.6.2"

    const val com_android_tools_build_gradle: String = "4.0.1"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

    const val constraintlayout: String = "2.0.1"

    const val mockito_kotlin: String = "2.2.0"

    const val espresso_core: String = "3.3.0"

    const val mockito_core: String = "3.5.10"

    const val lint_gradle: String = "27.0.1"

    const val viewbinding: String = "4.0.1"

    const val appcompat: String = "1.2.0"

    const val core_ktx: String = "1.3.1"

    const val aapt2: String = "4.0.1-6197926"

    const val coil: String = "0.13.0"

    /**
     * Current version: "6.1.1"
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "6.6.1"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
            id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
