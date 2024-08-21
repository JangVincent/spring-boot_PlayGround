# Getting Started

## Project Setup

### Basic Setup
**JDK**
```shell
brew install openjdk@21
```

### For VsCode
**Basic Setup**

1. Add `Language Support for Java(TM) by Red Hat` extension
2. Add `Spring Initializr Java Support`


4. Add few settings in `settings.json` add the following configuration
```json
"java.configuration.runtimes": [
    {
      "name": "JavaSE-21",
      "path": "/opt/homebrew/Cellar/openjdk@21/21.0.4/libexec/openjdk.jdk/Contents/Home",
      "default": true
    }
  ],
"java.jdt.ls.java.home": "/opt/homebrew/Cellar/openjdk@21/21.0.4/libexec/openjdk.jdk/Contents/Home",
"java.import.gradle.java.home": "/opt/homebrew/Cellar/openjdk@21/21.0.4/libexec/openjdk.jdk/Contents/Home",
"java.debug.settings.hotCodeReplace": "auto"
```
**Hot Code Replace**
1. Add `Spring Boot Dashboard`
2. Add downward code in build.gradle
```gradle
dependencis {
  compleOnly 'org.springframework.boot:spring-boot-devtools'
}
```
3. Add the following code in `application.properties`
```properties

spring.devtools.livereload.enabled=true # Enable LiveReload
spring.devtools.restart.enabled=true # Enable Restart
spring.thymeleaf.cache=false # Disable Thymeleaf cache
spring.thymeleaf.prefix=classpath:/templates/ # Set Thymeleaf prefix
```
4. Add setting in `settings.json`
```json
"java.debug.settings.hotCodeReplace": "auto"
```

5. Start your project using `Spring boot dashboard` Extension


### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.2/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.2/gradle-plugin/packaging-oci-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

