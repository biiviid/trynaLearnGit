# Day 18 — File I/O with Java NIO
**Phase 2 · Week 3 · Thursday**

---

## Goals
- Read and write files using modern Java NIO (`java.nio.file`)
- Understand `Path`, `Files`, `BufferedReader`, `BufferedWriter`
- Upgrade your old txt-file CRUD knowledge to proper Java

---

## Tasks
1. Read a `.txt` file line by line and print each line with its line number
2. Save your Library's book list to a file — define your own format, one book per line
3. Write the reader: load that file back and reconstruct your list of `Book` objects
4. Handle the case where the file doesn't exist yet (first run) — don't crash, just start fresh

---

## Challenge
Add auto-save to your Library System: every time a book is added or removed, the file updates automatically. On startup, load from the file. Where in your class hierarchy should this save logic live? Think before you code.

---

## Resources
- [Baeldung — Java NIO.2 File API](https://www.baeldung.com/java-nio-2-file-api)
- [Oracle — File I/O](https://docs.oracle.com/javase/tutorial/essential/io/fileio.html)

---

## Notes
> *Write anything here after your session.*
