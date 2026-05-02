# Day 19 — Sorting & Comparators
**Phase 2 · Week 3 · Friday**

---

## Goals
- Use `Comparable` to define natural ordering for your own objects
- Use `Comparator` for alternative orderings without touching the original class
- Get a real taste of lambdas in a practical context

---

## Tasks
1. Make `Book` implement `Comparable<Book>` — sort by title alphabetically as natural order
2. Write a separate `Comparator<Book>` that sorts by year published (descending)
3. Write another that sorts by author last name
4. Use `Collections.sort()` and `List.sort()` with both
5. Chain comparators: sort by author, then by title for same-author books — look up `thenComparing()`

---

## Challenge
You have a list of employees: name, department, salary. Sort them by department alphabetically, then within each department by salary descending. Write this as a single line using chained comparators and lambdas.

---

## Resources
- [Comparable vs Comparator (Baeldung)](https://www.baeldung.com/java-comparator-comparable)
- [Oracle — Object Ordering](https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html)

---

## Notes
> *Write anything here after your session.*
