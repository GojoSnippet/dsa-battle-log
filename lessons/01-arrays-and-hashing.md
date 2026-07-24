# Lesson 1 — Arrays & Hashing (plain English)

## The one idea
A **hash map** (HashMap / dictionary) is a magic drawer system: you give it a **key**,
it tells you **instantly** where the value is — no searching through everything.
- `put(key, value)` ≈ instant
- `get(key)` ≈ instant
- "is this key here?" ≈ instant

All roughly **O(1)** on average. A **hash set** is the same thing but it only remembers
**keys** (no values) — perfect for *"have I seen this before?"*

## When to reach for it (the trigger phrases)
- *"have I seen X before?"* → **hash set**
- *"how many times does X appear?" / "count of…"* → **hash map** (key → count)
- *"find two things that relate"* (a pair summing to target) → **hash map**, store as you go
- *"group things that are the same in some way"* → **hash map** (signature → bucket)

**The tell:** a brute-force answer would put a loop *inside* the loop (O(n²)) just to *check*
something. The hash map deletes that inner loop → the whole thing drops to **O(n)**.

## The trade
You spend **memory** (the map/set) to buy **speed** (instant lookups). Space O(n), time O(n).
Almost always worth it.

## The move (the template)
Walk the array **once**. For each element:
1. **Ask your question** against what you've already stored.
2. **Then store** the current element.

(Order matters — ask *before* you store, or an element can wrongly match itself. That's the Two Sum trap.)

## Problems that are literally just this pattern
| Problem | The question you ask | Structure |
|---|---|---|
| Two Sum (#1) | "is `target − x` already stored?" | map: value → index |
| Contains Duplicate (#217) | "have I seen this number?" | set |
| Valid Anagram (#242) | "do both strings have the same letter counts?" | map: char → count |
| Group Anagrams (#49) | "what's this word's signature?" | map: sorted-letters → list |
| Top K Frequent (#347) | "count everything, take the top K" | map: value → count |

## Gotchas
- **Check before insert** (Two Sum self-pairing).
- Counting in Java: `map.put(k, map.getOrDefault(k, 0) + 1)`.
- `HashSet` answers *"present?"*; `HashMap` answers *"present, and here's the value."*
- **Return early** when you can (see Contains Duplicate) — don't do extra work after the answer is known.

---
*Re-read this the day before a review. If any row in the table feels fuzzy, re-solve that problem.*
