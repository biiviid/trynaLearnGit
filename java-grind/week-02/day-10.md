# Day 10 — Inheritance & Polymorphism
**Phase 1 · Week 2 · Wednesday**

---

## Goals
- Understand inheritance as an "is-a" relationship — and when it makes sense vs when it doesn't
- Use `extends` and `@Override` correctly
- See polymorphism in action: one variable type, multiple behaviors

---

## Tasks
1. Create `SavingsAccount extends BankAccount` with an interest rate field
2. Override `withdraw()` so that dropping below ₱500 charges a ₱50 penalty
3. Add `applyInterest()` specific to `SavingsAccount`
4. In `main()`, create a `BankAccount` reference holding a `SavingsAccount` object — call `withdraw()` and observe which version runs
5. Try calling `applyInterest()` through the `BankAccount` reference — what happens and why?

---

## Challenge
Create a third class `CreditAccount extends BankAccount` where balance can go negative up to a credit limit. Override `withdraw()` accordingly. Put all three account types in a single `ArrayList<BankAccount>` and call `withdraw()` on each — watch polymorphism do its thing.

---

## Resources
- [Inheritance (Oracle)](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Bro Code Java (YouTube)](https://www.youtube.com/@BroCodez)

---

## Notes
> *Write anything here after your session.*
