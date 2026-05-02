# Day 13 — Exception Handling
**Phase 1 · Week 2 · Saturday**

---

## Goals
- Understand exceptions as a control flow mechanism, not just error messages
- Know the difference between checked and unchecked exceptions
- Write custom exceptions that actually communicate what went wrong

---

## Tasks
1. Add `InsufficientFundsException` (custom checked exception) to `BankAccount.withdraw()`
2. Handle it at the call site — print a useful message, not just a stack trace dump
3. Add a `finally` block — observe when it runs vs when it doesn't
4. Intentionally trigger `ArrayIndexOutOfBoundsException` and `NullPointerException` — read the stack traces carefully
5. Look up `throws` vs `throw` — be sure you know which is which

---

## Challenge
Create `InvalidAmountException` for zero or negative deposit/withdrawal amounts. Should it be checked or unchecked? There's a legitimate argument for both — write your reasoning in a comment before deciding.

---

## Resources
- [Exception Handling in Java (Baeldung)](https://www.baeldung.com/java-exceptions)
- [Checked vs Unchecked (Oracle)](https://docs.oracle.com/javase/tutorial/essential/exceptions/runtime.html)

---

## Notes
> *Write anything here after your session.*
