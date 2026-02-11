# 0169 - Majority Element

## 📌 Problem Summary
Given an integer array `nums`, return the **majority element**.

- The majority element appears **more than ⌊n / 2⌋ times**.
- It is guaranteed to exist.

---

# 🔹 Approach 1: HashMap (Frequency Counting)

## 💡 Idea
Count how many times each number appears using a `HashMap`.  
Return the number whose count is greater than `n / 2`.

## 🔎 Steps
1. Create a `HashMap<Integer, Integer>`.
2. Traverse the array and update frequency.
3. Iterate through the map.
4. Return the element whose frequency > `n / 2`.

## ⏱ Time Complexity
`O(n)`  
- One pass to build map  
- One pass to check majority  

## 💾 Space Complexity
`O(n)`  
- In worst case, all elements are unique.

## ✅ Pros
- Easy to understand
- Straightforward implementation

## ❌ Cons
- Uses extra memory

---

# 🔹 Approach 2: Sorting

## 💡 Idea
Sort the array.  
The majority element will always be at index `n / 2`.

## 🔎 Why It Works
If an element appears more than half the time:
- It must occupy the middle position after sorting.
- So directly return `nums[n / 2]`.

## ⏱ Time Complexity
`O(n log n)`  
- Due to sorting

## 💾 Space Complexity
`O(1)`  
- Primitive array sorting is in-place

## ✅ Pros
- Very short code
- No extra data structures

## ❌ Cons
- Slower than optimal solution

---

# 🔥 Optimal (Interview Preferred)

## Boyer-Moore Voting Algorithm

### ⏱ Time Complexity
`O(n)`

### 💾 Space Complexity
`O(1)`

### ✨ Why Best?
- No extra memory
- No sorting
- Single pass solution

---

# 🧠 Quick Comparison

| Approach  | Time | Space | Interview Friendly |
|-----------|------|--------|-------------------|
| HashMap   | O(n) | O(n)   | Medium |
| Sorting   | O(n log n) | O(1) | Okay |
| Boyer-Moore | O(n) | O(1) | ⭐ Best |

---
