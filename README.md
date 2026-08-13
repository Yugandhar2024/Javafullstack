# Java Full Stack Learning Repository

This repository contains Java practice programs (many single-file examples) and some web frontend files. The README has been updated to reflect the current layout of the repository and provide guidance for running and organizing the code.

---

## Current repository structure (top-level)

- FILE_MIGRATION_GUIDE.md
- README.md
- src/                       (main Java packages and subfolders)
- Many standalone Java files at repository root (examples and practice programs), for example: A.java, Armstrong.java, ArrayAddition.java, AverageCalculator.java, Bitwise.java, Encapsulation.java, Loop-related files (Loops.java), Prime/Palindrome files (Prime.java, Palindrome.java), and many more.
- HTML/JS demo files at repository root (web samples): calculator.html, loginform.html, regform.html, resume.html, resmenu.html, basicjs.html, evenjs.html, arthoper.html, assignjs.html

Note: The repository currently contains many individual .java files at the root (learning/practice files). There's also a structured `src/` folder with subdirectories for `basics`, `algorithms`, and `oop` used for more organized examples.

You can review the full file list in the GitHub UI: https://github.com/Yugandhar2024/Javafullstack

---

## Recommended organization (next steps)

1. Follow FILE_MIGRATION_GUIDE.md to move root-level Java files into appropriate folders under `src/` (e.g., `src/basics/`, `src/algorithms/`, `src/oop/`, `src/patterns/`, `src/recursion/`).
2. Keep web frontend files in a `web/` directory (e.g., `web/interactive/`, `web/forms/`, `web/js-concepts/`) as described in the guide.
3. Add package declarations to Java files after moving them into folders (for example, `package basics;`), and update compilation/run instructions accordingly.
4. Add a small build script or use Maven/Gradle when the project grows beyond simple single-file examples.

---

## How to compile and run (examples)

If a Java file is in the root (single-file example):

```bash
# Compile and run a single-file example at repo root
javac Armstrong.java
java Armstrong
```

If you move files into packages under `src/` (recommended):

```bash
# From repository root
javac -d out $(find src -name "*.java")
java -cp out basics.VariableDemo     # example when using package basics
```

For web files, open them in a browser or use a live server extension in your editor:

```bash
# Open in default browser (macOS)
open calculator.html
```

---

## Notes & current status

- Many learning files exist both at root and inside `src/`. Consider consolidating duplicates (e.g., `NumberPatt.java` vs `Numberpatt.java`, `ArmStrong.java` vs `Armstrong.java`).
- FILE_MIGRATION_GUIDE.md contains step-by-step suggestions to reorganize the repository—use it before changing package names.
- This README focuses on describing the repository as it currently is and recommending pragmatic next steps for organization.

---

## Quick checklist (to finish the migration)

- [ ] Move root Java examples into `src/` subfolders following FILE_MIGRATION_GUIDE.md
- [ ] Add package declarations and fix imports
- [ ] Add a build tool (Maven/Gradle) or a small Makefile / build script
- [ ] Add unit tests for algorithm files
- [ ] Add JavaDoc comments and consistent naming conventions

---

*Last Updated: August 2026*
*Author: Yugandhar2024*
