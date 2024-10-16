plugins {
    alias(libs.plugins.kotlin.jvm)
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = libs.plugins.kotlin.jvm.get().pluginId)

    dependencies {
        implementation(kotlin("stdlib"))
    }

    kotlin {
        jvmToolchain {
            languageVersion.set(JavaLanguageVersion.of(21))
        }
    }
}