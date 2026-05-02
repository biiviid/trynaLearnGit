# Day 54 — Full-Stack Polish & Error Handling
**Phase 4 · Week 8 · Friday**

---

## Goals
- Make the full-stack app feel solid: good errors on both ends, no crashes
- Add API versioning to Spring Boot
- Improve Android's resilience to backend failures

---

## Tasks
1. Prefix all Spring Boot endpoints with `/api/v1/` — update Android accordingly
2. Add retry logic in Android: failed network call → user taps "Retry" instead of relaunching the app
3. Add correct HTTP status codes throughout Spring Boot: 201 for creation, 404 for not found, 400 for bad input, 409 for conflicts
4. Handle each status code differently in Android: 404 → "Not found", 409 → "Already exists", 500 → "Server error"
5. Test every error path deliberately

---

## Challenge
Add a simple in-memory rate limit to Spring Boot: if the same IP makes more than 10 requests per minute, return 429 Too Many Requests. This is a simplified version of real API protection — think about where in the Spring layers this logic belongs.

---

## Resources
- [HTTP status codes (MDN)](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status)
- [API versioning (Baeldung)](https://www.baeldung.com/rest-versioning)

---

## Notes
> *Write anything here after your session.*
