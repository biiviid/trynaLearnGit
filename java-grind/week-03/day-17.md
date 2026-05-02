# Day 17 — Generics
**Phase 2 · Week 3 · Wednesday**

---

## Goals
- Understand why generics exist: compile-time type safety, no casting at runtime
- Write your own generic class and method
- Read generic type signatures without panicking

---

## Tasks
1. Write a generic `Pair<K, V>` class that holds two values of potentially different types
2. Write a generic method `swap(T[] array, int i, int j)` that works on any array type
3. Write a generic `printAll(List<T> list)` method
4. Try a bounded type parameter: `<T extends Comparable<T>>` — write a `findMax()` that works on any comparable list

---

## Challenge
Write a generic `Stack<T>` class with `push()`, `pop()`, `peek()`, and `isEmpty()` — use `ArrayList` internally. What should happen if someone calls `pop()` on an empty stack? Handle it deliberately.

---

## Resources
- [Oracle — Generics Lesson](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
- [Baeldung — Java Generics](https://www.baeldung.com/java-generics)

---

## Notes
> *Write anything here after your session.*
