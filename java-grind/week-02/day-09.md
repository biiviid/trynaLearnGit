# Day 09 — Encapsulation & Access Modifiers
**Phase 1 · Week 2 · Tuesday**

---

## Goals
- Understand *why* we make fields private — not just that we do
- Write clean getters and setters, and know when a setter shouldn't exist at all
- See encapsulation as protecting the integrity of an object's state

---

## Tasks
1. Refactor `BankAccount` from Day 8: make all fields `private`
2. Add getters for all fields
3. Think carefully about setters — should `balance` have a public setter? Why or why not?
4. Try accessing a private field directly from `main()` — read the error, understand it
5. Add `getFormattedBalance()` that returns the balance as a clean currency string (e.g. "₱ 1,500.00")

---

## Challenge
Add a `transactionHistory` field — an `ArrayList<String>` logging every deposit and withdrawal with amount and new balance. Make it private with only a getter that returns an *unmodifiable* view of the list. Why would you want it unmodifiable rather than just returning the list directly?

---

## Resources
- [Encapsulation (Baeldung)](https://www.baeldung.com/java-oop)
- [Collections.unmodifiableList (Oracle)](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#unmodifiableList-java.util.List-)

---

## Notes
> *Write anything here after your session.*
