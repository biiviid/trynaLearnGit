# Day 40 — Retrofit & REST API Calls
**Phase 3 · Week 6 · Friday**

---

## Goals
- Make HTTP requests from Android using Retrofit
- Parse JSON into Java objects automatically via Gson converter
- Display real API data in your RecyclerView

---

## Tasks
1. Add Retrofit and Gson converter to `build.gradle`
2. Add `INTERNET` permission to `AndroidManifest.xml`
3. Create a Retrofit service for `https://jsonplaceholder.typicode.com/users`
4. Define a `User` model matching the JSON response
5. Make the GET request in your ViewModel inside a coroutine — update a LiveData with results
6. Display users in RecyclerView

---

## Challenge
Handle all three UI states cleanly: loading (spinner), success (list), error (retry button + error message). The error state should appear when there's no internet. Where in the architecture does network availability detection belong?

---

## Resources
- [Phillipp Lackner — Retrofit crash course (YouTube)](https://www.youtube.com/@PhilippLackner)
- [Retrofit docs](https://square.github.io/retrofit/)
- [JSONPlaceholder (free fake API)](https://jsonplaceholder.typicode.com/)

---

## Notes
> *Write anything here after your session.*
