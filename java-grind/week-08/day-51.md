# Day 51 — Spring Boot + JPA + H2 Database
**Phase 4 · Week 8 · Tuesday**

---

## Goals
- Persist data using Spring Data JPA instead of hardcoded lists
- Understand `@Entity`, `@Repository`, `JpaRepository`
- Use H2 as an in-memory dev database

---

## Tasks
1. Add Spring Data JPA and H2 dependencies
2. Annotate `Contact` as a JPA `@Entity`
3. Create `ContactRepository extends JpaRepository<Contact, Long>`
4. Inject it into your controller, replace hardcoded data with real DB operations
5. Visit `http://localhost:8080/h2-console` and browse your data — understand what Spring created for you

---

## Challenge
Add a `@Query` to your repository: find all contacts whose name contains a search string (case-insensitive). Expose it via `GET /contacts/search?name=jo`. Compare writing this vs writing raw SQL.

---

## Resources
- [Spring Data JPA (Baeldung)](https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa)
- [H2 console setup (Baeldung)](https://www.baeldung.com/spring-boot-h2-database)

---

## Notes
> *Write anything here after your session.*
