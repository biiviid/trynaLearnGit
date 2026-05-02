# Day 52 — Spring Boot: Services & Validation
**Phase 4 · Week 8 · Wednesday**

---

## Goals
- Separate concerns: Controller handles HTTP, Service handles business logic, Repository handles data
- Validate incoming data and return useful error responses
- Handle exceptions globally instead of in every method

---

## Tasks
1. Create `ContactService` — move all business logic out of the controller
2. Inject Service into Controller, Repository into Service (not Controller)
3. Add Bean Validation to `Contact`: `@NotBlank` on name, `@Email` on email, `@Size` on phone
4. Add `@Valid` to your POST endpoint's `@RequestBody`
5. Write a `@ControllerAdvice` that catches `MethodArgumentNotValidException` and returns a clean JSON error

---

## Challenge
Add a business rule: no two contacts can share the same email. Enforce this in the Service layer — not the controller, not a database constraint. Write a custom exception for it, handle it in `@ControllerAdvice`.

---

## Resources
- [Spring Validation (Baeldung)](https://www.baeldung.com/spring-boot-bean-validation)
- [@ControllerAdvice (Baeldung)](https://www.baeldung.com/exception-handling-for-rest-with-spring)

---

## Notes
> *Write anything here after your session.*
