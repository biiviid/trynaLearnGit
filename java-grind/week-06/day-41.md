# Day 41 — Dependency Injection with Hilt
**Phase 3 · Week 6 · Saturday**

---

## Goals
- Understand why DI exists: it decouples object creation from object usage
- Set up Hilt in an Android project
- Inject your Room database and Retrofit client into the ViewModel

---

## Tasks
1. Add Hilt dependencies and annotation processor to `build.gradle`
2. Annotate your Application class with `@HiltAndroidApp`
3. Create a `@Module` that provides your Room Database and Retrofit instance
4. Annotate your ViewModel with `@HiltViewModel`, inject the DAO
5. Annotate Activity/Fragment with `@AndroidEntryPoint`
6. Remove all manual instantiation — let Hilt handle it

---

## Challenge
Add a `ContactRepository` class between the ViewModel and the DAO. Inject it into the ViewModel. The ViewModel should only know about the Repository, never the DAO directly. Why does this extra layer matter?

---

## Resources
- [Hilt codelab](https://developer.android.com/codelabs/android-hilt)
- [Phillipp Lackner — Hilt (YouTube)](https://www.youtube.com/@PhilippLackner)

---

## Notes
> *Write anything here after your session.*
