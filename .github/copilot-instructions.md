## Purpose
This repository is a small set of standalone Java homework exercises (each file is a single-class CLI program). This file tells AI coding assistants how to be immediately productive: how to build/run, what patterns to follow, and where the autograder expects exact outputs.

## Big picture
- Top-level Java source files (for example `Bill3.java`, `FVCalc.java`, `NumWords.java`, `TimeFormat.java`) are independent programs. Each contains a `public static void main(String[] args)` and accepts input via command-line arguments.
- There is no build system (no Maven/Gradle); tests and CI use plain `javac`/`java` invocations via the `.github/classroom/autograding.json` definitions.

## Build & run (explicit)
- Compile all exercises: `javac *.java`
- Run a single exercise (example): `java Bill3 Alice Bob Carol 239`
- The autograder runs exactly the commands in `.github/classroom/autograding.json` (use those entries as canonical examples).

## Tests & autograder
- See `.github/classroom/autograding.json` — each test contains `setup` (usually `javac <File>.java`) and `run` (e.g. `java Bill3 Dan Moti Itay 300`) and an expected `output` string. Match these outputs exactly (punctuation, spacing, capitalization, and numeric formatting).
- Examples from autograder:
  - Bill3 expects outputs like: `Dear Itay, Moti, and Dan: pay 100.0 Shekels each`
  - FVCalc expects outputs like: `After 2 years, $100 saved at 10.0% will yield $121`

## Code patterns & conventions (do exactly)
- Input via `args[]` only (no STDIN). Validate `args.length` when appropriate and fail gracefully if missing.
- Print exact phrases as in autograder. Tests compare included strings, so whitespace and punctuation matter.
- Numeric formatting: autograder outputs show numeric values often as a single decimal (e.g., `80.0`, `334.0`) or as integers for calculations that yield whole numbers; follow the examples. Use `Math.round(...)` or `String.format` when reproducing rounding behaviour that matches tests.
- Keep each class in its own file and public class name = file name (already the case here).

## Common pitfalls to check first
- Run `javac <File>.java` locally to discover compile-time typos (for example, `Bill3.java` currently contains a typo in the parse call and will not compile as-is).
- Tests expect deterministic rounding/formatting (see Bill3 rounding to nearest whole Shekel then showing `.0`). Verify rounding logic matches autograder samples.
- Do not add package declarations — the autograder compiles from the repository root.

## When editing or adding code
- Keep output strings stable. If you must change wording, update the autograder entries accordingly (instructors only).
- Write small, local changes and compile (`javac`) before committing. Use the autograder JSON run entries to craft local test runs.

## Files to inspect for examples
- `Bill3.java` — CLI arg parsing and printing exact message format.
- `FVCalc.java` — numeric computation and integer formatting examples.
- `NumWords.java`, `TimeFormat.java` — more examples of argument parsing and string output formats.

## Ask the instructor / user when uncertain
- If formatting or rounding is ambiguous, prefer matching the autograder outputs exactly. If you suspect the autograder is wrong, ask for clarification instead of changing tests.

If this file should be more or less prescriptive, tell me which sections to expand or trim.
