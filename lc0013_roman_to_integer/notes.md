# Roman to Integer – Approach Comparison

## 1. Optimal (Comparison-Based) Approach

**Idea**: Traverse the string once and decide add/subtract based on the next symbol.

**How it Works**

* If current value < next value → subtract
* Else → add
* Add last character at the end

**Complexity**

* Time: `O(n)`
* Space: `O(1)` (map size is constant)

**Pros**

* Single pass
* No string modification
* Clean and efficient
* Interview‑preferred solution

**Cons**

* Requires understanding subtractive rule logic

---

## 2. String Replacement Approach

**Idea**: Convert subtractive patterns into additive ones, then sum all symbols.

**How it Works**

* Replace patterns like `IV → IIII`, `IX → VIIII`
* After replacement, every symbol is additive

**Complexity**

* Time: `O(n)` but with multiple string scans
* Space: `O(n)` due to new strings created

**Pros**

* Very intuitive
* Easy to debug
* Straightforward logic

**Cons**

* Multiple string allocations
* Less efficient
* Not scalable for large inputs

---

## Verdict

* **Best overall / optimal**: Comparison-Based approach
* **Best for clarity / learning**: String replacement approach

Use the optimal approach for interviews and performance‑critical code.
