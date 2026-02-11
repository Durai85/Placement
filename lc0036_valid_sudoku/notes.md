# 📌 LeetCode 36 – Valid Sudoku (Analysis Notes)

---

# 🟢 Approach 1: Optimal (Boolean Matrix – Single Pass)

## 💡 Core Idea

Use three `9 × 9` boolean arrays to track whether a digit has already appeared in:

- A specific row
- A specific column
- A specific 3×3 box

Instead of using HashSet and Strings, we directly map digits to indices and perform constant-time checks.

---

## 🧠 Data Structure Logic

We maintain:

- `row[i][num]` → digit `num` seen in row `i`
- `col[j][num]` → digit `num` seen in column `j`
- `box[b][num]` → digit `num` seen in box `b`

Where:

- Digits `'1'–'9'` are mapped to indices `0–8`
- Each lookup is O(1)

---

## 🔑 Important Concepts

### 1️⃣ Character to Index Mapping

Convert `'1'–'9'` into `0–8` to use as array indices.

This allows direct access without hashing.

---

### 2️⃣ Box Index Formula

**boxIndex = 3 * (i / 3) + (j / 3)**

Why it works:

- `i / 3` → identifies box row (0,1,2)
- `j / 3` → identifies box column (0,1,2)
- Multiply by 3 to flatten 2D box coordinates into a 1D index (0–8)

## Box layout reference:
| 0 | 1 | 2 |
|---|---|---|
| 3 | 4 | 5 |
|---|---|---|
| 6 | 7 | 8 |


This is a standard **2D to 1D index flattening pattern**:

**index = rowGroup * width + colGroup**
---

## 🚀 Algorithm Flow

1. Traverse the board once.
2. Skip empty cells (`.`).
3. Check if digit already exists in:
   - Its row
   - Its column
   - Its box
4. If yes → invalid.
5. Otherwise mark it as seen.

---

## ⏱ Complexity

- **Time:** O(81) → O(1) (fixed board size)
- **Space:** O(1) (constant 9×9 arrays)

---

## ✅ Why This Is Optimal

- Single traversal
- No HashSet
- No String creation
- No hashing overhead
- Clean and highly interview-efficient
- Pure constant-time lookups

---

# 🔵 Approach 2: Set-Based Approach

## 💡 Core Idea

Validate:

- Rows using `HashSet<Character>`
- Columns using `HashSet<Character>`
- Boxes using `HashSet<String>`

Each section is checked separately.

---

## 🧠 Logic

- For each row → detect duplicates using a set.
- For each column → detect duplicates using a set.
- For boxes → store a combination of:
  - Digit
  - Box row
  - Box column  
  as a String key to detect duplicates.

---

## ⏱ Complexity

- **Time:** O(81) → O(1) (but higher constant factor)
- **Space:** Extra HashSets + String objects

---

## ❌ Drawbacks

- Three separate traversals
- String creation overhead
- Hashing cost
- More memory usage
- Less optimal constant performance

---

# ⚖️ Comparison Summary

| Feature | Boolean Matrix | Set Approach |
|----------|---------------|--------------|
| Traversals | 1 | 3 |
| Hashing | ❌ | ✅ |
| String Creation | ❌ | ✅ |
| Memory Usage | Lower | Higher |
| Interview Strength | ⭐⭐⭐⭐ | ⭐⭐ |

---

# 🎯 Final Takeaway

When:

- The value range is small and fixed (like digits 1–9)
- Fast duplicate detection is required
- Performance matters

👉 Prefer **boolean arrays over HashSet**.

---

🔥 Pattern Learned:

Use boolean matrices when:
- Constraints are fixed and small
- You need constant-time lookups
- You want optimal constant-factor performance
- You can map values directly to indices
