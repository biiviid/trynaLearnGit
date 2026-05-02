# Day 42 — Architecture Review
**Phase 3 · Week 6 · Sunday**

---

## Goals
- See the full MVVM picture and where every piece of your code belongs
- Clean up before starting your big project
- Document your architecture while it's fresh in your head

---

## Tasks
1. Draw your architecture on paper: UI → ViewModel → Repository → Room DAO / Retrofit API. Label what each layer knows and doesn't know about the others
2. Review your code: any logic in Activity that belongs in ViewModel? Move it
3. Review your ViewModel: anything touching Android Views? Fix it
4. Write a short `ARCHITECTURE.md` in your repo explaining the structure for a newcomer
5. Clean commit — no "WIP" messages at the top of your history

---

## Challenge
Look up `StateFlow` as an alternative to `LiveData`. Understand the difference and when each is preferred. Swap one `LiveData` in your app for `StateFlow` and observe what changes.

---

## Resources
- [Guide to app architecture](https://developer.android.com/topic/architecture)
- [StateFlow vs LiveData (Baeldung)](https://www.baeldung.com/kotlin/flow-livedata)

---

## Reflection
> Week 6 was dense. ViewModel, Room, Coroutines, Navigation, Retrofit, Hilt. Which of these still feels shaky? Spend 20 minutes reviewing just that one tonight.
