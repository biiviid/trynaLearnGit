# Day 25 — Maven & Build Tools
**Phase 2 · Week 4 · Thursday**

---

## Goals
- Understand what a build tool does that IntelliJ's run button hides from you
- Read and write a basic `pom.xml`
- Add an external dependency and use it in real code

---

## Tasks
1. Create a new Maven project in IntelliJ (or convert your existing project)
2. Study the `pom.xml`: understand `groupId`, `artifactId`, `version`, and the `dependencies` block
3. Add the `Gson` dependency from Maven Central — serialize a `Book` to JSON and print it
4. Add `Jackson` as well — try the same thing and compare the two APIs
5. Run `mvn clean install` from terminal — understand what each build phase means

---

## Challenge
Replace your Library System's custom file format with JSON using Gson. Saving = serialize list to JSON file. Loading = deserialize JSON back to list. Delete all the old file format code cleanly.

---

## Resources
- [Maven in 5 Minutes (Apache)](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Gson on Maven Central](https://mvnrepository.com/artifact/com.google.code.gson/gson)

---

## Notes
> *Write anything here after your session.*
