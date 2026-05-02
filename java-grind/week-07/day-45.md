# Day 45 — App Project: ViewModels & UI Wiring
**Phase 3 · Week 7 · Wednesday**

---

## Goals
- Build the ViewModel layer and connect it to the UI
- Get your main list screen fully functional end-to-end

---

## Tasks
1. Create ViewModels for your main list and detail screens
2. Expose all UI state as LiveData: list of items, loading state, error state
3. Build your RecyclerView with Adapter and ViewHolder
4. Wire the ViewModel to the UI — observe all LiveData in your Fragment
5. Test the full flow: data loads from Room, displays in the list, survives rotation

---

## Challenge
Implement pagination or infinite scroll: load the first 20 items, load more when the user reaches the bottom. Look up the Paging 3 library — decide if it's worth integrating for your use case or if a simple manual approach is better. Document your reasoning.

---

## Resources
- [Paging 3 (developer.android.com)](https://developer.android.com/topic/libraries/architecture/paging/v3-overview)

---

## Notes
> *Write anything here after your session.*
