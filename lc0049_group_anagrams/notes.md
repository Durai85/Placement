# Group Anagrams – Optimal Approach

## Core Idea

Anagrams share the **same characters in the same frequency**. If we sort the characters of each word, all anagrams will produce the **same sorted string**, which can be used as a key.

---

## How the Code Works

1. Create a `HashMap<String, List<String>>`

   * **Key**: sorted version of the string
   * **Value**: list of original strings that match this key

2. For each string:

   * Convert to `char[]`
   * Sort the characters
   * Convert back to a string → this becomes the key
   * Add the original string to the corresponding list

3. Return all map values as the final grouped anagrams

---

## Example

Input:

```
["eat", "tea", "tan", "ate", "nat", "bat"]
```

Sorted keys:

* eat → aet
* tea → aet
* ate → aet
* tan → ant
* nat → ant
* bat → abt

Output groups:

```
[[eat, tea, ate], [tan, nat], [bat]]
```

---

## Complexity Analysis

* **Time Complexity**: `O(n * k log k)`

  * `n` = number of strings
  * `k` = average string length (sorting each string)

* **Space Complexity**: `O(n * k)`

  * HashMap keys + grouped strings

---

## Why This Works

* Sorting normalizes all anagrams to the same representation
* HashMap enables fast grouping
* One pass over the input

---

## Pros

* Very intuitive
* Easy to implement
* Reliable and interview‑friendly

---

## Cons

* Sorting each string adds overhead
* Not the most optimal for very large strings

---

## Verdict

* **Best balance of simplicity and correctness**
* Ideal for interviews and clean production code
* Frequency‑count key approach can be faster but is
