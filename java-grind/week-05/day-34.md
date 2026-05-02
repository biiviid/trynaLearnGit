# Day 34 — Git for Android Projects
**Phase 3 · Week 5 · Saturday**

---

## Goals
- Set up a clean Git repo for Android — it generates a lot of files you don't want committed
- Know what to ignore and why
- Push your Android project to GitHub cleanly and confirm it looks right

---

## Tasks
1. Generate a `.gitignore` for Android using gitignore.io (Android + IntelliJ + Gradle)
2. Init a Git repo in your Android project — check `git status` before first commit, remove anything that shouldn't be tracked
3. First commit: only source code, layouts, manifests, gradle files
4. Push to GitHub — verify: no `.idea/` folders, no `build/` directories in the repo
5. On Garuda Linux: pull the repo, open in Android Studio, confirm it builds

---

## Challenge
Create a `dev` branch as your main working branch going forward. Always branch off `dev` for features, merge back to `dev`, only merge `dev` → `main` when stable. Set this up now as a habit.

---

## Resources
- [gitignore.io — Android](https://www.toptal.com/developers/gitignore/api/android,intellij,gradle)
- [Android project structure](https://developer.android.com/studio/projects)

---

## Notes
> *Write anything here after your session.*
