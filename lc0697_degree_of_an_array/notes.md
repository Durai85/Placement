# LC 697 – Degree of an Array  
## Comparison of Three Implementations

---

# 1️⃣ OneHashMap Approach

## 🔎 Strategy
- Count frequency using one `HashMap`
- Find max frequency (degree)
- Collect elements having max frequency
- For each such element:
  - Rescan array to find first occurrence
  - Rescan array to find last occurrence
  - Compute subarray length

## ⏱ Time Complexity
- Counting → O(n)
- Collecting max elements → O(n)
- Rescanning array for each max element → O(n² worst case)

**Overall: O(n²) worst case**

Why?
Because for each high-frequency element, the array is scanned again.

## 💾 Space Complexity
- O(n) for frequency map
- O(k) for list of max elements

## ❌ Drawbacks
- Repeated rescanning
- Inefficient for large inputs
- Avoidable extra work

## 🧠 Learning Point
Rescanning is a red flag.  
If you are searching for first/last repeatedly, store that info during first pass.

---

# 2️⃣ ThreeHashMap Approach

## 🔎 Strategy
- Store:
  - `count`
  - `first index`
  - `last index`
- Compute degree during traversal
- Final loop iterates over entire array again to compute min length

## ⏱ Time Complexity
- First traversal → O(n)
- Second traversal over array → O(n)

**Overall: O(n)**

## 💾 Space Complexity
- Three HashMaps → O(n)

## ⚠️ Minor Inefficiencies
- First index logic unnecessarily uses `Math.min`
- Last index logic unnecessarily uses `Math.max`
- Final loop iterates over `nums` instead of `map.keySet()`, causing redundant checks

## 🧠 Learning Point
Metadata should be:
- Stored once
- Not recalculated
- Not rechecked multiple times

This version is optimal in complexity but not minimal in structure.

---

# 3️⃣ Optimal Approach

## 🔎 Strategy
- Store:
  - `count`
  - `first index`
  - `last index`
- First occurrence stored only once
- Last occurrence updated naturally during traversal
- Final loop iterates only over unique keys

## ⏱ Time Complexity
- First pass → O(n)
- Second pass over unique elements → O(n worst case)

**Overall: O(n)**

No rescanning.
No redundant checks.

## 💾 Space Complexity
- Three HashMaps → O(n)

## ✅ Why It’s Best
- Clean logic
- No unnecessary comparisons
- No repeated scans
- Fully optimal
- Interview-ready structure

---

# 🔥 Direct Comparison

| Version        | Time Complexity | Space | Efficiency Level |
|---------------|-----------------|-------|------------------|
| OneHashMap   | O(n²)           | O(n)  | ❌ Inefficient    |
| ThreeHashMap | O(n)            | O(n)  | ✅ Good           |
| Optimal      | O(n)            | O(n)  | 🚀 Best Structure |

---

# 🎯 Core Optimization Pattern Learned

Instead of:
> “Find it later by searching again”

Do:
> “Store it when you see it”

This pattern:
- Eliminates nested scanning
- Converts O(n²) → O(n)
- Is frequently tested in interviews

---

# 🚀 Final Recommendation

Use the **Optimal Approach**.

It is:
- Time optimal
- Clean
- Minimal
- Scalable
- Interview safe

---

# 🧠 Concept Upgrade Achieved

You moved from:
- Brute force thinking

To:
- Metadata-driven optimization

That is a major improvement in algorithmic maturity.
