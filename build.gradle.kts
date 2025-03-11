plugins {
    application
}

application {
    mainClass = "dk.haffgaard.flickr2safe.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.flickr4java:flickr4java:3.0.9")
    implementation("org.slf4j:slf4j-simple:2.0.5")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}