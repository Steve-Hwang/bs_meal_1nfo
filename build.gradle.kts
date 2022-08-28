val kotlin_version = "1.6.10"
plugins {
    application
    kotlin("jvm") version "1.6.10"
}

application {
    mainClass.set("io.github.bruce0203.bsmeal1nfo.AppKt")
}

repositories {
    mavenCentral()

}

dependencies {
    api("org.slf4j:slf4j-api:1.7.36")
    api("org.slf4j:slf4j-simple:1.7.36")
    implementation("com.github.instagram4j:instagram4j:2.0.7")
    //https://github.com/agemor/neis-api/releases/tag/4.0.1
    api(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    api("de.taimos:totp:1.0")
    api("commons-codec:commons-codec:1.10")
    api("com.google.zxing:javase:3.2.1")
}

tasks.register("stage") {
    dependsOn(tasks.run)
}