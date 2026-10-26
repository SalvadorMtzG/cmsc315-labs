# IntelliJ Unit Projects

This download contains separate Maven projects for `unit1` through `unit8`.

Each unit folder has this structure:

```text
unitX/
├── pom.xml
├── README.md
└── src/
    ├── main/java/
    │   └── UnitXProject.java
    └── test/java/
        └── UnitXProjectTest.java
```

## No Packages

The Java files intentionally do **not** use package declarations. This means the top of each `.java` file should not include a line such as:

```java
package unit1;
```

## Recommended IntelliJ Use

Open one unit folder at a time, such as `unit2`, because each unit folder is its own Maven project.

## Running Tests

Open the desired unit folder in IntelliJ and run the test file, or use Maven from that unit folder:

```bash
mvn test
```
