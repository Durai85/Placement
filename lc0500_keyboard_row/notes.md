# Keyboard Row – HashSet Approach

## Problem Insight

Find all words that can be typed using letters from **only one row** on a standard keyboard.

---

## Core Idea

* Represent each keyboard row as a **Set<Character>**
* Convert each word to lowercase for **case-insensitive comparison**
* Check if all characters of a word exist in **any one row set**
* Collect matching words

---

## How the Code Works

1. Define strings for each row:

   ```java
   r1 = "qwertyuiop"; r2 = "asdfghjkl"; r3 = "zxcvbnm";
   ```
2. Convert each row string to a **HashSet** using `addSet`
3. For each word:

   * Convert to lowercase
   * Check `isinrow` for row1, row2, row3
   * If `true`, add the word to the result list
4. Convert `List<String>` to `String[]` and return

---

## Important Notes

* **Case-insensitive:** Use `word.toLowerCase()`
* **Checking efficiency:** `HashSet.contains()` is `O(1)` per character
* **Avoid redundant checks:** Could determine row from first character to skip checking all 3 rows

---

## Complexity Analysis

* **Time Complexity:** `O(n * k)`

  * `n` = number of words
  * `k` = average word length
* **Space Complexity:** `O(1)` for fixed row sets + `O(n*k)` for result list

---

## Pros

* Intuitive and readable
* Handles both uppercase and lowercase letters
* HashSet allows fast character lookups

---

## Cons

* Checks all 3 rows for each word (slightly redundant)
* Minor overhead converting strings to sets

---

## Optimizations

* Determine row using **first character** to reduce checks from 3 to 1
* Could precompute a **mapping from char to row** for faster lookup

---

## Verdict

* **HashSet approach** is clear and efficient for small to medium input
* Great for interviews and educational purposes
* Can be slightly optimized for very large datasets
