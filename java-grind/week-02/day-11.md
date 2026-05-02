# Day 11 — Interfaces & Abstract Classes
**Phase 1 · Week 2 · Thursday**

---

## Goals
- Know the real difference between an interface and an abstract class — and when to use each
- Understand that interfaces define a *contract*, not behavior
- See how interfaces enable flexible, swappable designs

---

## Tasks
1. Create a `Transactable` interface: `deposit()`, `withdraw()`, `getBalance()`
2. Have `BankAccount` implement it
3. Create a separate `MobileWallet` class (not extending BankAccount) that also implements `Transactable`
4. Write a method that accepts a `Transactable` parameter and processes a transfer — it shouldn't care what type it actually is
5. Now create an abstract class `FinancialProduct` — think about what genuinely belongs there vs in the interface

---

## Challenge
Java classes can only extend one class but can implement multiple interfaces. Create a `Printable` interface with a `printStatement()` method. Have `BankAccount` implement both `Transactable` and `Printable`. Why is this flexibility important in real systems?

---

## Resources
- [Interface vs Abstract Class (Baeldung)](https://www.baeldung.com/java-interface-vs-abstract-class)
- [Oracle — Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)

---

## Notes
> *Write anything here after your session.*
