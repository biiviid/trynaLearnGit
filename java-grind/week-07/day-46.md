# Day 46 — App Project: API Integration
**Phase 3 · Week 7 · Thursday**

---

## Goals
- Connect your app to a real external API
- Handle all response states in the Repository and ViewModel
- Display real data

---

## Tasks
1. Define your Retrofit API interface with the endpoints you need
2. Create response model classes matching the API's JSON
3. In the Repository, fetch from the API and optionally cache in Room
4. Handle errors — wrap responses in a result/state sealed class or wrapper
5. Display loading, success, and error states in the UI

---

## Challenge
Implement offline-first: always show cached Room data immediately, then fetch from the API in the background and update if data changed. This is real-world Android. Look up "single source of truth" in Android architecture docs.

---

## Resources
- [Offline-first (developer.android.com)](https://developer.android.com/topic/architecture/data-layer/offline-first)

---

## Notes
> *Write anything here after your session.*
