# Big O Notation, Time & Space Complexity (with Java Examples)

## ✨ What is Big O?

Big O notation describes **how the performance of an algorithm scales** with the size of the input `n`.
It does **not measure actual runtime**, but rather the **growth rate**.

| Big O      | Name         | Example scenario                              |
| ---------- | ------------ | --------------------------------------------- |
| O(1)       | Constant     | Accessing an array element by index           |
| O(log n)   | Logarithmic  | Binary Search                                 |
| O(n)       | Linear       | Looping through an array                      |
| O(n log n) | Linearithmic | Merge Sort, Quick Sort (average)              |
| O(n^2)     | Quadratic    | Nested loops (e.g., Bubble Sort)              |
| O(2^n)     | Exponential  | Recursive Fibonacci (no memoization)          |
| O(n!)      | Factorial    | Brute-force permutations (Traveling Salesman) |

---

## 🕛 Time Complexity

Time complexity measures **how many operations** an algorithm performs **relative to the input size**.

### Java Examples

#### ✅ O(1) - Constant Time

```java
int getFirst(int[] array) {
    return array[0];
}
```

#### ✅ O(n) - Linear Time

```java
int sum(int[] array) {
    int total = 0;
    for (int num : array) {
        total += num;
    }
    return total;
}
```

#### ✅ O(n^2) - Quadratic Time

```java
void printAllPairs(int[] array) {
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[i] + "," + array[j]);
        }
    }
}
```

---

## 📀 Space Complexity

Space complexity measures **how much additional memory** is needed by the algorithm (not including input size).

| Big O | Description                           |
| ----- | ------------------------------------- |
| O(1)  | Constant space (no extra memory used) |
| O(n)  | Proportional to input size            |

### Java Examples

#### ✅ O(1) Space

```java
int findMax(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int num : array) {
        if (num > max) max = num;
    }
    return max;
}
```

#### ✅ O(n) Space

```java
int[] copyArray(int[] array) {
    int[] copy = new int[array.length];
    for (int i = 0; i < array.length; i++) {
        copy[i] = array[i];
    }
    return copy;
}
```

---

## 🔹 How to Estimate Big O

1. **Loops**: A single loop = O(n), nested loop = O(n^2)
2. **Recursion**: Depends on branching factor and depth (e.g., Fibonacci = O(2^n))
3. **Auxiliary Structures**: Creating new arrays, lists, maps may increase space complexity
4. **Ignore constants**: O(2n) ➞ O(n), O(3n^2 + 2n) ➞ O(n^2)

---

## 🎯 Real-World Interview Tips

When asked to analyze complexity:

* Talk out loud: "We have one loop that goes through all elements: O(n)"
* Explain space if you allocate memory: "I create a copy of the input so it's O(n) space"
* Test edge cases to find potential inefficiencies (e.g., large input arrays)

---

## ✅ Summary

| Concept          | How to Think About It                    |
| ---------------- | ---------------------------------------- |
| Time Complexity  | How the algorithm scales with input size |
| Space Complexity | How much extra memory is required        |
| Big O            | Expresses both in terms of input growth  |

---
