
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.sqldelight)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_17.toString()
            }
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    jvm()

    sourceSets {
        androidMain.dependencies {
            // Ktor
            implementation(libs.ktor.client.android)

            // Sqldelight
            implementation(libs.sqldelight.android.driver)

            // Decompose
            implementation(libs.decompose)
            implementation("com.arkivanov.decompose:extensions-compose-jetbrains:2.2.2-compose-experimental")

            // Koin
            implementation(libs.koin.android)
        }

        commonMain.dependencies {
            // put your Multiplatform dependencies here
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.kotlinx.coroutines.core)

            // Ktor
            implementation(libs.ktor.ktor.client.core)
            implementation(libs.ktor.client.content.negotiation)
            implementation(libs.ktor.client.logging)
            implementation(libs.ktor.serialization.kotlinx.json)

            // SQLDelight
            implementation(libs.sqldelight.runtime)

            // Moko MVVM
            implementation(libs.moko.mvvm.core)
            implementation(libs.moko.mvvm.compose)
            implementation(libs.moko.mvvm.flow)
            implementation(libs.moko.mvvm.flow.compose)

            /*// Compose Image Loader
            api(libs.image.loader)*/

            // Decompose
            implementation(libs.decompose)
            implementation("com.arkivanov.decompose:extensions-compose-jetbrains:2.2.2-compose-experimental")

            // Koin
            implementation(libs.koin.core)
            implementation(project.dependencies.platform(libs.koin.bom))
            implementation(libs.koin.compose)
        }

        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)
            implementation(libs.sqldelight.native.driver)
            api(libs.decompose)
            api(libs.essenty.lifecycle)
        }

        jvmMain.dependencies {
        }
    }
}

sqldelight {
    database("KmpECommerceDatabase") {
        packageName = "com.jvg.ecommercekmp.database"
        sourceFolders = listOf("sqldelight")
    }
}

android {
    namespace = "org.jvg.ecommercekmp.shared"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }
}
