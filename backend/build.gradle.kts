
plugins {
    alias(libs.plugins.kotlin.jvm)
}

allprojects {
    repositories {
        mavenCentral()
    }
}
group = "ru.bazzoozza"

subprojects {
    apply(plugin = rootProject.libs.plugins.kotlin.jvm.get().pluginId)

    dependencies {
        implementation(kotlin("stdlib"))
        testImplementation(rootProject.libs.kotest.runner)
        testImplementation(rootProject.libs.kotest.assertions)
        testImplementation(rootProject.libs.kotest.framework)
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    kotlin {
        jvmToolchain {
            languageVersion.set(JavaLanguageVersion.of(21))
        }
    }
}