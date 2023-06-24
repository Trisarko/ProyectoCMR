plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("net.serenity-bdd:serenity-cucumber:3.6.21")
    implementation ("org.seleniumhq.selenium:selenium-java:3.141.59")
    implementation ("net.serenity-bdd:serenity-junit:3.6.21")
    implementation ("net.serenity-bdd:serenity-core:3.6.21")

    implementation ("org.seleniumhq.selenium:selenium-api:3.141.59")
    implementation ("org.seleniumhq.selenium:selenium-chrome-driver:4.10.0")
    implementation ("org.seleniumhq.selenium:selenium-firefox-driver:4.10.0")
    testImplementation ("org.junit.platform:junit-platform-launcher:1.8.2")
    testImplementation ("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation ("org.junit.vintage:junit-vintage-engine:5.8.2")
    implementation ("net.serenity-bdd:serenity-screenplay:3.3.7")
    implementation ("net.serenity-bdd:serenity-screenplay-webdriver:3.3.7")

}


