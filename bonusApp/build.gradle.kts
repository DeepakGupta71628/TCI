plugins {
	java
	id("org.springframework.boot") version "2.7.11"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.tci"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
    compile group: 'commons-collections', name: 'commons-collections', version: '3.2'
    testCompile group: 'junit', name: 'junit', version: '4.+'
    compile group: 'com.h2database', name: 'h2', version: '1.3.148'
    
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	
	implementation('com.zaxxer:HikariCP:3.4.3')
	implementation('org.springframework.data:spring-data-jdbc:1.1.2.RELEASE')
	implementation('mysql:mysql-connector-java:8.0.17')
}

tasks.withType<Test> {
	useJUnitPlatform()
}
