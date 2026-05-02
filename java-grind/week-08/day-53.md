# Day 53 — Connect Android to Spring Boot
**Phase 4 · Week 8 · Thursday**

---

## Goals
- Run your Spring Boot backend locally and reach it from the Android emulator
- Understand the networking quirk: why `localhost` doesn't work in the emulator
- Complete a full end-to-end flow: Android → Spring Boot → H2 database

---

## Tasks
1. Confirm Spring Boot runs at `http://localhost:8080`
2. In Android's Retrofit setup, change base URL to `http://10.0.2.2:8080/` (emulator's alias for your machine's localhost)
3. Update your Retrofit interface to match your Spring Boot endpoints
4. Test: add a contact from Android → verify in H2 console → fetch list in Android
5. Test the full CRUD cycle from the Android side

---

## Challenge
What happens in the Android app when the Spring Boot server is off? Make sure it shows a clear "Server unavailable" error instead of crashing. Where in the MVVM architecture does this error handling belong?

---

## Resources
- [Android emulator networking](https://developer.android.com/studio/run/emulator-networking)

---

## Notes
> *Write anything here after your session.*
