# Day 21 — Review + Persistent Library System
**Phase 2 · Week 3 · Sunday**

---

## Goals
- Combine collections + file I/O into a system that actually persists data across runs
- Practice choosing the right data structure for each job

---

## Tasks
1. Upgrade your Library System:
   - Replace ArrayList storage with `HashMap<String, Book>` (ISBN as key — why is this better for lookup?)
   - Save to file on every change
   - Load from file on startup
   - If file doesn't exist, start fresh gracefully
2. Add search by author using Streams: `stream().filter()` — sneak preview, look it up
3. Add sorting: list all books by title, and separately by author

---

## Challenge
Add a statistics feature: most-borrowed author, total books available vs borrowed, count per genre (add a genre field to `Book`). Think about which collections make each calculation most natural.

---

## Resources
- Use your Day 15–18 notes first before searching anything new.

---

## Reflection
> Are data structure choices feeling more natural, or do you still have to think hard about List vs Map vs Set every time?
