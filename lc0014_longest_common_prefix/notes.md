# Longest Common Prefix – Optimal Approach

## Problem Insight

To find the longest common prefix among multiple strings, we only need to compare the **most different strings** after sorting.

---

## Core Idea

1. **Sort the array of strings**
2. After sorting:

   * The **first** string is lexicographically smallest
   * The **last** string is lexicographically largest
3. The common prefix of these two strings is guaranteed to be the common prefix of the entire array

---

## How the Code Works

* Sorts the input array using `Arrays.sort()`
* Compares characters of the first and last strings
* Stops at the first mismatch
* Builds the prefix using `StringBuilder`

---

## Complexity Analysis

* **Time Complexity**: `O(n log n + m)`

  * `n log n` → sorting strings
  * `m` → length of the shortest string
* **Space Complexity**: `O(1)` (ignoring sorting overhead)

---

## Why This Works

* Sorting groups similar prefixes together
* Maximum difference appears between first and last strings
* If they match, all middle strings must match too

---

## Pros

* Simple and elegant
* No nested loops over all strings
* Easy to implement and understand

---

## Cons

* Sorting overhead
* Not optimal if strings are very large and count is small

---

## Verdict

* **Great balance of clarity and efficiency**
* Ideal for interviews and clean implementations
* Alternative approaches (horizontal/vertical scanning) avoid sorting but are more verbose
