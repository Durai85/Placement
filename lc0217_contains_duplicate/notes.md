# 📌 LeetCode 217 – Contains Duplicate

## 🔹 Problem

Given an integer array `nums`, return `true` if any value appears at least twice, otherwise return `false`.

---

# 🟦 Approach 1: Sorting the Array

```java
public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for(int i = 0; i < nums.length - 1; i++){
        if(nums[i] == nums[i+1]) return true;
    }
    return false;
}
```

## 💡 Idea

* Sort the array
* After sorting, duplicates become adjacent
* Compare each element with the next one

## ⏱ Time Complexity

* `O(n log n)`
* Sorting dominates the complexity

## 📦 Space Complexity

* `O(1)` (ignoring sorting stack space)
* Java uses **Dual-Pivot QuickSort** for primitives (in-place)

## ✅ Advantages

* Simple logic
* No extra data structure needed
* Good when modifying the array is allowed

## ❌ Disadvantages

* Slower than HashSet for large inputs
* Modifies the original array
* Not ideal if order must be preserved

---

# 🟩 Approach 2: Using HashSet

```java
public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for(int num : nums){
        if(seen.contains(num)) return true;
        seen.add(num);
    }
    return false;
}
```

## 💡 Idea

* Create a `HashSet`
* Iterate through the array
* If element exists in set → duplicate found
* Otherwise, add it to the set

## ⏱ Time Complexity

* `O(n)`
* `contains()` and `add()` are `O(1)` on average

## 📦 Space Complexity

* `O(n)`
* Worst case: all elements are unique

## ✅ Advantages

* Faster than sorting approach
* Does not modify the array
* Early exit when duplicate found

## ❌ Disadvantages

* Uses extra memory
* Slight overhead due to hashing

---

# 🔥 Direct Comparison

| Feature          | Sorting Approach         | HashSet Approach           |
| ---------------- | ------------------------ | -------------------------- |
| Time Complexity  | `O(n log n)`             | `O(n)`                     |
| Space Complexity | `O(1)`                   | `O(n)`                     |
| Modifies Input   | Yes                      | No                         |
| Early Exit       | Yes                      | Yes                        |
| Best For         | Memory-constrained cases | Performance-critical cases |

---

# 🏆 Conclusion

* ✅ **Interview Preferred:** HashSet (optimal time complexity)
* ✅ **Memory-Constrained Scenarios:** Sorting approach
* 🚀 HashSet is generally con
