# Integer to Roman – Two Approaches

## 1. Array-Based (Greedy) Approach

### Time Complexity
**O(1)**

**Reason:**  
The array size is fixed (13 elements), and each Roman symbol is appended at most a constant number of times.

### Why It’s Efficient
- **No dynamic data structures:** Uses primitive arrays  
- **No repeated scanning:** Processes each symbol index once  
- **Direct access:** Uses simple index-based logic  

---

## 2. HashMap-Based Approach

### Idea
Store Roman values and symbols in a `LinkedHashMap`. While the number is greater than zero, scan the map to find the largest valid key, subtract it, and append its symbol.

### Key Code Segment (Performance Bottleneck)
```java
while (num > 0) {
    for (int key : map.keySet()) {
        if (num >= key) {
            result.append(map.get(key));
            num -= key;
            break;
        }
    }
}
```
### Time Complexity

**O(n)**

**Reason:**
Each Roman symbol appended requires scanning up to all map keys.

### Why It’s Slower

- **Repeated iteration:** Re-scans the map’s key set multiple times

- **Iterator overhead:** Iteration and get() calls are heavier than array indexing

- **Nested logic:** while loop combined with for loop increases operations

| Aspect          | Array Approach | HashMap Approach |
| --------------- | -------------- | ---------------- |
| Time Complexity | O(1)           | O(n)             |
| Data Structure  | Fixed arrays   | LinkedHashMap    |
| Iterations      | Constant       | Repeated         |
| Performance     | Faster         | Slower           |


### Conclusion

The array-based greedy approach is optimal because Roman numeral rules are fixed and finite.