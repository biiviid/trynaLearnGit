# Day 24 — Optional & Null Safety
**Phase 2 · Week 4 · Wednesday**

---

## Goals
- Understand `Optional` as a container that may or may not hold a value — better than returning null
- Use `isPresent()`, `orElse()`, `orElseThrow()`, `map()`, `filter()`
- Know when Optional is appropriate and when it's overkill

---

## Tasks
1. Refactor your Library's `findByISBN()` to return `Optional<Book>` instead of null
2. Handle it three ways at the call site: `isPresent()` check, `orElse()` default, `orElseThrow()` with custom exception
3. Chain Optional operations: find a book, map to its author, filter if name starts with "A", print result
4. Find somewhere in your existing code you return or check for null — refactor it

---

## Challenge
Write a method that takes a list of ISBNs, finds each in the library, and returns only the ones that actually exist — using Stream + Optional, no null checks, no if statements.

---

## Resources
- [Baeldung — Java Optional](https://www.baeldung.com/java-optional)
- [Oracle — Optional class](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)

---

## Notes
> *Write anything here after your session.*
