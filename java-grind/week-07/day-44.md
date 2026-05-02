# Day 44 — App Project: Data Layer
**Phase 3 · Week 7 · Tuesday**

---

## Goals
- Build the complete data foundation before any UI exists
- Implement Room entities, DAOs, and the Repository

---

## Tasks
1. Implement all `@Entity` classes with correct types, primary keys, and foreign keys where needed
2. Write all `@Dao` interfaces — think through every query your app will ever need
3. Build your `RoomDatabase` class with all entities registered
4. Build your `Repository` class exposing clean methods for the ViewModel to call
5. Write at least 3 unit tests for your DAO using an in-memory Room database

---

## Challenge
If your entities have relationships (e.g. task belongs to category), implement a `@Relation` query that fetches a parent with its children in one call. Look up `@Transaction` and understand why it's required there.

---

## Resources
- [Room relationships (developer.android.com)](https://developer.android.com/training/data-storage/room/relationships)
- [Testing Room](https://developer.android.com/training/data-storage/room/testing-db)

---

## Notes
> *Write anything here after your session.*
