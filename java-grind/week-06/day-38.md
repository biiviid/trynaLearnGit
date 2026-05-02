# Day 38 — Coroutines Basics
**Phase 3 · Week 6 · Wednesday**

---

## Goals
- Understand *why* you can't do database or network work on the main (UI) thread
- Use coroutines to run async tasks without blocking the UI
- Know `viewModelScope`, `Dispatchers.IO`, and `Dispatchers.Main`

---

## Tasks
1. Add Kotlin Coroutines for Android to `build.gradle`
2. Wrap all Room DAO calls in `viewModelScope.launch { }` inside the ViewModel
3. Use `Dispatchers.IO` for database work — understand why this dispatcher exists
4. Verify the UI stays responsive: add a simulated delay (`delay(2000)`) and confirm the app doesn't freeze
5. Handle errors: wrap the coroutine body in try/catch, update a LiveData error state if something goes wrong

---

## Challenge
Show a `ProgressBar` while contacts are loading. Use `MutableLiveData<Boolean>` for loading state — true before the DB call, false after. Observe it in the Activity to show/hide the spinner.

---

## Resources
- [Coroutines on Android (developer.android.com)](https://developer.android.com/kotlin/coroutines)
- [Phillipp Lackner — Coroutines crash course (YouTube)](https://www.youtube.com/@PhilippLackner)

---

## Notes
> *Write anything here after your session.*
