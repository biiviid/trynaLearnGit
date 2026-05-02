# Day 32 — RecyclerView
**Phase 3 · Week 5 · Thursday**

---

## Goals
- Understand why RecyclerView exists: it recycles View objects rather than creating new ones per item
- Implement the three parts: RecyclerView in layout, Adapter class, ViewHolder pattern
- Handle item click events

---

## Tasks
1. Display a list of contact names in a RecyclerView
2. Build the Adapter: `onCreateViewHolder`, `onBindViewHolder`, `getItemCount`
3. Build the ViewHolder holding references to each item's views
4. Click listener: tapping an item shows a Toast with the contact's name
5. Delete button per item: removes from list and refreshes the display

---

## Challenge
Implement two view types in the same RecyclerView: an alphabetical section header and a contact row under each letter. Look up `getItemViewType()`. Work through it methodically — this one is genuinely tricky.

---

## Resources
- [RecyclerView codelab](https://developer.android.com/codelabs/android-training-create-recycler-view)
- [Phillipp Lackner — RecyclerView (YouTube)](https://www.youtube.com/@PhilippLackner)

---

## Notes
> *Write anything here after your session.*
