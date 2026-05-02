# Day 39 — Navigation Component
**Phase 3 · Week 6 · Thursday**

---

## Goals
- Replace manual Intent navigation with the Navigation Component
- Understand NavHostFragment, NavController, and the navigation graph XML
- Pass data safely between destinations using Safe Args

---

## Tasks
1. Add Navigation Component dependencies to `build.gradle`
2. Create `nav_graph.xml` with your screens as destinations
3. Replace Activity-to-Activity navigation with Fragment-to-Fragment inside one host Activity
4. Add a transition animation between destinations using `NavOptions`
5. Use Safe Args to pass a contact ID to the detail screen — add the Safe Args Gradle plugin

---

## Challenge
Add a bottom navigation bar with 3 tabs: Contacts, Favorites, and Settings (Settings empty for now). Wire each to a nav graph destination. Handle the back stack so pressing back from a tab behaves correctly.

---

## Resources
- [Navigation codelab](https://developer.android.com/codelabs/basic-android-kotlin-training-navigation)
- [Safe Args (developer.android.com)](https://developer.android.com/guide/navigation/use-graph/safe-args)

---

## Notes
> *Write anything here after your session.*
