# Isomorphic Strings – Approach Comparison

## 1. Optimal Array-Based Approach

**Idea**: Track last seen index of characters using fixed-size arrays.

**Key Points**

* Uses two `int[256]` arrays
* Stores `i + 1` to avoid default `0` ambiguity
* Direct index access via ASCII values

**Complexity**

* Time: `O(n)`
* Space: `O(1)` (constant 256 size)

**Pros**

* Faster (no hashing overhead)
* Memory-efficient
* Clean and compact logic

**Cons**

* Limited to ASCII characters
* Slightly less intuitive

---

## 2. HashMap-Based Approach

**Idea**: Maintain bidirectional character mappings using HashMaps.

**Key Points**

* Uses two `HashMap<Character, Character>`
* Explicit mapping validation in both directions

**Complexity**

* Time: `O(n)` (average case)
* Space: `O(n)` (depends on unique characters)

**Pros**

* Easy to understand
* Works with full Unicode
* Conceptually clear

**Cons**

* Extra memory overhead
* Slower due to hashing

---

## Verdict

* **Best for performance & interviews**: Array-based approach
* **Best for readability & flexibility**: HashMap approach

Both are correct; choice depends on constraints and clarity vs speed trade-off.
