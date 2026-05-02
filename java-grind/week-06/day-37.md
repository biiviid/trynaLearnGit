# Day 37 — Room Database
**Phase 3 · Week 6 · Tuesday**

---

## Goals
- Understand Room as an abstraction over SQLite — you write Java, it handles SQL
- Define entities, DAOs, and the Database class
- Replace in-memory storage with real, persistent local storage

---

## Tasks
1. Add Room dependencies to `build.gradle`
2. Annotate `Contact` as a `@Entity` — define the table and primary key
3. Create `ContactDao` with `@Insert`, `@Delete`, `@Query` methods
4. Create your `ContactDatabase` abstract class
5. Use the DAO in your ViewModel to load and modify contacts
6. Test it: add contacts, fully close the app, reopen — they're still there

---

## Challenge
Add a `@Query` that searches contacts by name using SQL `LIKE`. Wire it to your search feature. Compare this to your old in-memory Stream filtering — what are the tradeoffs of each approach?

---

## Resources
- [Room codelab](https://developer.android.com/codelabs/android-room-with-a-view)
- [Baeldung — Room Database](https://www.baeldung.com/android-room)

---

## Notes
> *Write anything here after your session.*
