# Interchangeable Rectangles – GCD + HashMap Approach

## Core Idea

Two rectangles are interchangeable if their **width : height ratio** is the same.
To avoid floating‑point precision issues, the ratio is **normalized using GCD**.

---

## How the Code Works

1. For each rectangle:

   * Compute `gcd(width, height)`
   * Reduce the ratio: `(width/g, height/g)`
2. Convert the reduced ratio into a **key** (`a/b`)
3. Count occurrences of each ratio using a `HashMap`
4. For each ratio with frequency `i`, compute number of pairs:

   `i * (i - 1) / 2`

---

## Correctness Insight

* GCD guarantees the ratio is in **lowest form**
* Rectangles with the same reduced ratio are interchangeable
* Combination formula counts unique pairs

---

## Complexity Analysis

* **Time Complexity**: `O(n)`

  * One pass over rectangles
  * GCD per rectangle
  * HashMap operations are average `O(1)`

* **Space Complexity**: `O(n)`

  * HashMap stores up to `n` unique ratios

---

## Why the Runtime Is ~86 ms

Although optimal in Big‑O terms, constant factors matter:

### 1. String Key Overhead (Major Cost)

```java
String key = a + "/" + b;
```

* Creates new `String` objects
* Performs integer → string conversion
* String hashing is character‑based

### 2. HashMap with Boxed Types

* `Integer` boxing/unboxing
* Cache‑unfriendly memory access

### 3. Recursive GCD

* Function call overhead
* Modulo operation per recursion step

---

## Important Bug Avoided

```java
result += ((long)i * (i - 1)) / 2;
```

* Casting to `long` **before multiplication** prevents integer overflow
* Without casting, intermediate multiplication overflows

---

## Pros

* Precise (no floating‑point errors)
* Clean logic
* Interview‑ready
* Handles large inputs correctly

---

## Cons

* String keys add unnecessary overhead
* Slightly slower in practice despite optimal complexity

---

## Optimization Ideas (Optional)

* Use `long` as key instead of `String`
* Use iterative GCD instead of recursion
* Pre‑size `HashMap`

---

## Verdict

* **Algorithmically optimal (O(n))**
* Runtime difference comes from implementation choices, not logic
* Excellent solution; can be micro‑optimized if needed
