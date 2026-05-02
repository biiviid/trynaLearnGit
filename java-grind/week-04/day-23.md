# Day 23 — Streams API
**Phase 2 · Week 4 · Tuesday**

---

## Goals
- Think of Streams as a pipeline: source → intermediate operations → terminal operation
- Use `filter`, `map`, `sorted`, `collect`, `reduce`, `count`
- Understand that Streams are lazy — nothing happens until a terminal operation fires

---

## Tasks
1. Take a list of integers — filter evens, double each value, collect to a new list: one Stream chain
2. From your Book list, get titles of all available books sorted alphabetically — one chain
3. Find the average grade in a student list using `mapToInt` and `average()`
4. Group books by author using `Collectors.groupingBy()` — the result type will surprise you
5. Try `stream().findFirst()` and understand what it returns and why

---

## Challenge
You have a list of orders: customer name, item, price. In a single Stream chain:
- Filter orders over ₱500
- Group by customer name
- For each customer, calculate total spending

Figure out which collectors you need — this one requires real research.

---

## Resources
- [Baeldung — Java 8 Streams](https://www.baeldung.com/java-8-streams)
- [Oracle — Streams tutorial](https://docs.oracle.com/javase/tutorial/collections/streams/)

---

## Notes
> *Write anything here after your session.*
