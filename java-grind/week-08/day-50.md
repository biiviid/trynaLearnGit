# Day 50 — Spring Boot Intro & First REST API
**Phase 4 · Week 8 · Monday**

---

## Goals
- Understand what Spring Boot does and why it's the standard Java backend framework
- Build and run a REST API locally in under an hour
- Understand `@RestController`, `@GetMapping`, `@PostMapping`

---

## Tasks
1. Go to [start.spring.io](https://start.spring.io) — create a project with Maven, Java, and Spring Web
2. Import it into IntelliJ
3. Create `ContactController` with:
   - `GET /contacts` → returns a hardcoded list as JSON
   - `POST /contacts` → accepts a contact in the body and prints it to console
4. Run it and test with a browser (GET) and Postman or curl (POST)
5. Understand `@RequestBody`, `@PathVariable`, and `@RequestParam` — add one of each

---

## Challenge
Add `GET /contacts/{id}` returning a single contact by ID. If not found, return HTTP 404 — look up `ResponseEntity` to control the response status code independently of the body.

---

## Resources
- [Spring Initializr](https://start.spring.io/)
- [Amigoscode — Spring Boot (YouTube)](https://www.youtube.com/@amigoscode)
- [Spring MVC basics (Baeldung)](https://www.baeldung.com/spring-mvc-tutorial)

---

## Notes
> *Write anything here after your session.*
