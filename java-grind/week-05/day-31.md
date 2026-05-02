# Day 31 — Activities & Intents
**Phase 3 · Week 5 · Wednesday**

---

## Goals
- Understand the Activity lifecycle — what happens when a call comes in or the screen rotates
- Navigate between screens using explicit Intents
- Pass data between Activities with `putExtra` / `getStringExtra`

---

## Tasks
1. Add log statements in every lifecycle method of `MainActivity` — rotate the emulator, watch the order in Logcat
2. Create a second Activity (profile screen)
3. Add a button that opens it via Intent
4. Pass a name string from main to profile and display it
5. Add a back button on profile that returns to main

---

## Challenge
Make a login screen the entry point. Correct credentials → navigate to main screen, pass the username. Wrong credentials → show error on the same screen without navigating. Think about what should happen when the user presses back from the main screen.

---

## Resources
- [Activity lifecycle (developer.android.com)](https://developer.android.com/guide/components/activities/activity-lifecycle)
- [Intents (developer.android.com)](https://developer.android.com/guide/components/intents-filters)

---

## Notes
> *Write anything here after your session.*
