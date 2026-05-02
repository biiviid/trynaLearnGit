# Day 26 — Unit Testing with JUnit 5
**Phase 2 · Week 4 · Friday**

---

## Goals
- Understand why tests exist: they let you change code without fear of breaking things silently
- Write tests that test behavior, not implementation details
- Think in terms of: given this input, I expect this output

---

## Tasks
1. Add JUnit 5 to your Maven `pom.xml`
2. Write tests for `BankAccount`:
   - Deposit increases balance correctly
   - Withdraw decreases balance correctly
   - Withdrawing more than balance throws your custom exception
   - Depositing a negative amount throws an exception
3. Write tests for Library `findByISBN()` — found, not found, and null input
4. Use `@BeforeEach` to set up fresh objects — understand why this matters

---

## Challenge
Write a failing test first (red), then write the minimum code to make it pass (green), then clean up (refactor). Do this for one new feature: `transferTo(BankAccount other, double amount)`. This is the TDD loop — feel it once.

---

## Resources
- [Baeldung — JUnit 5](https://www.baeldung.com/junit-5)
- [JUnit 5 User Guide (official)](https://junit.org/junit5/docs/current/user-guide/)

---

## Notes
> *Write anything here after your session.*
