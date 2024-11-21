plugins {
    id("java")
    id("io.qameta.allure") version "2.12.0" //для Аллюр- отчётов
    id("io.freefair.lombok") version "8.10.2" //для тестирования Rest Api - Lombok Model
}


group = "org.example"
version = "1.0-SNAPSHOT"



allure {
    report {
        version.set("2.19.0")
    }
    adapter { // отвечает за появление папки build/allure-results
        aspectjWeaver.set(true) //обработка аннотации @Step
        frameworks {
            junit5 { //название фреймворка
                adapterVersion.set("2.19.0") //версия интеграции фреймворка и Allure
            }
        }
    }
}


repositories {
    mavenCentral()
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.codeborne:selenide:7.5.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0") //для Аллюр- отчётов
    testImplementation("io.qameta.allure:allure-selenide:2.19.0") //для Аллюр- отчётов
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0") //для Аллюр- отчётов
    testImplementation("io.rest-assured:rest-assured:5.5.0") //для тестирования Rest Api
    compileOnly("org.projectlombok:lombok:1.18.34") //для тестирования Rest Api - Lombok Model
    testImplementation("org.assertj:assertj-core:3.24.2") //для тестирования Rest Api
    testImplementation("com.fasterxml.jackson.core:jackson-databind:2.14.2") //для тестирования Rest Api - Lombok Model
        // testImplementation("org.slf4j:slf4j-simple:slf4jVersion") // фиксит / убирает "лишние" строки / символы из терминала после запуска кода

}

tasks.test {
    useJUnitPlatform()
//    systemProperties(System.getProperties()) //для Аллюр- отчётов
}