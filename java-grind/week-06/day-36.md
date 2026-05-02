# Day 36 — ViewModel & LiveData
**Phase 3 · Week 6 · Monday**

---

## Goals
- Understand why putting data logic in an Activity causes problems (rotation = data loss, tight coupling)
- Use ViewModel to survive configuration changes
- Use LiveData so the UI reacts to data automatically

---

## Tasks
1. Add Lifecycle ViewModel dependency to `build.gradle`
2. Create `ContactViewModel` holding your contact list
3. Move all data operations (add, remove, search) from your Activity to the ViewModel
4. Expose the contact list as `MutableLiveData<List<Contact>>`
5. Observe it in your Activity — RecyclerView updates whenever data changes
6. Test it: rotate the device. Your list should survive.

---

## Challenge
Add a "selected contact" state to the ViewModel — when a user taps a contact, store it in a LiveData. Observe in the Activity to open the detail screen. The Activity holds zero state of its own.

---

## Resources
- [ViewModel overview (developer.android.com)](https://developer.android.com/topic/libraries/architecture/viewmodel)
- [Phillipp Lackner — ViewModel & LiveData (YouTube)](https://www.youtube.com/@PhilippLackner)

---

## Notes
> *Write anything here after your session.*
