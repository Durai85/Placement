# 📌 LeetCode 20 – Valid Parentheses

## 🔹 Problem

Given a string `s` containing only:

'(' , ')' , '{' , '}' , '[' , ']'


Return `true` if:

- Every opening bracket has a matching closing bracket  
- Brackets are closed in the correct order  
- No unmatched brackets remain  

---

# 🟦 Approach 1: Using Deque (ArrayDeque)

```java
public boolean isValid(String s) {
    HashMap<Character, Character> pair = new HashMap<>();
    pair.put(')', '(');
    pair.put('}', '{');
    pair.put(']', '[');

    Deque<Character> stack = new ArrayDeque<>();

    for(char c : s.toCharArray()){
        if(c == '(' || c == '[' || c == '{'){
            stack.push(c);
        }
        else if(stack.isEmpty()) return false;
        else if(stack.pop() != pair.get(c)) return false;
    }

    return stack.isEmpty();
}
```

### 💡 Idea

- Use a stack to track opening brackets

- Push opening brackets onto the stack

- When a closing bracket appears:

- If stack is empty → invalid

- If top does not match expected opening → invalid

- At the end, stack must be empty

### ⏱ Time Complexity

**O(n)**

Each character is processed once

### 📦 Space Complexity

**O(n)**

Worst case: all characters are opening brackets

✅ Advantages

Modern and recommended approach

Faster than Stack

No synchronization overhead

Preferred in interviews

❌ Disadvantages

Not thread-safe (usually not needed in coding problems)

🟩 Approach 2: Using Stack
```
public boolean isValid(String s) {
    HashMap<Character, Character> pair = new HashMap<>();
    pair.put(')', '(');
    pair.put('}', '{');
    pair.put(']', '[');

    Stack<Character> stack = new Stack<>();

    for(char c : s.toCharArray()){
        if(c == '(' || c == '[' || c == '{'){
            stack.push(c);
        }
        else if(stack.isEmpty()) return false;
        else if(stack.pop() != pair.get(c)) return false;
    }

    return stack.isEmpty();
}
```
### 💡 Idea

- Same stack-based logic

- Uses Java’s legacy Stack class

### ⏱ Time Complexity

**O(n)**

### 📦 Space Complexity

**O(n)**

### ✅ Advantages

- Simple and readable

- Thread-safe

### ❌ Disadvantages

Stack is a legacy class

Internally synchronized → unnecessary overhead

Not recommended in modern Java

🔥 Direct Comparison

| Feature                  | Deque (ArrayDeque) | Stack           |
| ------------------------ | ------------------ | --------------- |
| Time Complexity          | `O(n)`             | `O(n)`          |
| Space Complexity         | `O(n)`             | `O(n)`          |
| Performance              | Faster             | Slightly slower |
| Thread-safe              | No                 | Yes             |
| Synchronization Overhead | None               | Present         |
| Java Recommended         | Yes                | No (Legacy)     |
| Interview Preferred      | Yes                | Avoid           |


🏆 Conclusion

✅ Interview Preferred: ArrayDeque

❌ Avoid using Stack unless explicitly required

🚀 Deque is modern, faster, and officially recommended for stack behavior