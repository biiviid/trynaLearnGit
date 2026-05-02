# Day 35 — Review + Polish Contact App
**Phase 3 · Week 5 · Sunday**

---

## Goals
- Reinforce Week 5 by actually improving a real app
- Practice thinking in terms of lifecycle, views, and user flow

---

## Tasks
1. Add real-time search to your RecyclerView:
   - A `SearchView` or `EditText` at the top
   - Filter the list as the user types
   - Think carefully about where the filtering logic should actually live
2. Handle the empty state: no results → show a message instead of a blank list
3. Add a detail screen: tapping a contact shows their full information
4. Test your app on rotation — make sure nothing crashes or loses state

---

## Challenge
Implement swipe-to-delete using `ItemTouchHelper`. When a contact is swiped, show a Snackbar with an "Undo" option. Tapping Undo within a few seconds restores the contact. How do you hold the deleted item temporarily between swipe and potential undo?

---

## Resources
- [ItemTouchHelper (developer.android.com)](https://developer.android.com/reference/androidx/recyclerview/widget/ItemTouchHelper)

---

## Reflection
> Android feels very different from CLI Java. What's the biggest mental shift you've had to make this week?
