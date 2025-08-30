## 📚 Big O Notation, Time & Space Complexity — with Java Examples

### 🔢 1. Big O Notation

Big O describes how an algorithm performs as the input grows. It’s about scalability, not real-time performance.

| Big O    | Name        | Example Description                    | Java Example               |
| -------- | ----------- | -------------------------------------- | -------------------------- |
| O(1)     | Constant    | Accessing an element by index          | `array[0]`                 |
| O(log n) | Logarithmic | Binary search in a sorted array        | `Arrays.binarySearch()`    |
| O(n)     | Linear      | Iterating through a list               | `for (int i : list)`       |
| O(n²)    | Quadratic   | Nested loops on array                  | Bubble sort                |
| O(2ⁿ)    | Exponential | Recursive solution without memoization | Solving the Tower of Hanoi |

### 🧠 2. Running Time

How long the algorithm takes to execute depending on input size. It’s usually estimated in Big O, but real time depends on:

* CPU speed
* Language/runtime
* Implementation

### 💾 3. Space Complexity

Amount of extra memory the algorithm needs (not counting input).

| Space Complexity | Example                                | Java Example                                  |
| ---------------- | -------------------------------------- | --------------------------------------------- |
| O(1)             | In-place swap in array                 | `int tmp = a; a = b; b = tmp;`                |
| O(n)             | Creating copy of array or dynamic list | `List<Integer> copy = new ArrayList<>(list);` |

---

## 🧩 Data Structures in Java — Usage, Methods & Algorithms

### 🔸 1. Arrays

* ✅ Fixed size, fast index access.
* ❌ Size can't change.
* 🔧 Use when you know the number of elements ahead of time.

**Java methods**:

```java
int[] arr = {1, 2, 3};
arr[0] = 10;
int value = arr[2];
```

**Typical algorithms**:

* Binary search (sorted array)
* Two pointers

**Time complexities**:

* Access: O(1)
* Search: O(n)
* Insert/Delete (middle): O(n)

---

### 🔸 2. Strings

* Immutable sequences of characters in Java.
* Good for character-based logic, but expensive to modify frequently.

**Java methods**:

```java
String s = "hello";
char c = s.charAt(1);
String upper = s.toUpperCase();
```

**Use cases**:

* Palindrome problems
* Substring search
* Tokenization

🔄 If modifying a string frequently, use `StringBuilder`:

```java
StringBuilder sb = new StringBuilder("abc");
sb.append("d");  // "abcd"
```

---

### 🔸 3. Lists (ArrayList, LinkedList)

* ✅ Dynamic size, indexed.
* Use `ArrayList` for fast access.
* Use `LinkedList` for frequent insertions/removals at the ends.

**Java methods**:

```java
List<Integer> list = new ArrayList<>();
list.add(5);
list.get(0);
list.remove(0);
```

**Algorithms**:

* Sliding window
* Merge intervals
* BFS queue (LinkedList)

**Time complexities**:

| Operation     | ArrayList | LinkedList |
| ------------- | --------- | ---------- |
| Access        | O(1)      | O(n)       |
| Insert/remove | O(n)      | O(1) ends  |

---

### 🔸 4. HashMap

* Key-value store with average O(1) access.
* Use when quick lookup by key is required.

**Java methods**:

```java
Map<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.get("apple");
map.containsKey("banana");
```

**Use cases**:

* Counting frequencies
* Caching/memoization
* Finding complements (two-sum problem)

**Time complexities**:

* Access: O(1) average, O(n) worst-case (with collisions)

---

### 🔸 5. HashSet

* No duplicates, no order.
* Internally backed by a HashMap.

**Java methods**:

```java
Set<Integer> set = new HashSet<>();
set.add(10);
set.contains(10);
set.remove(10);
```

**Use cases**:

* Checking for duplicates
* Set intersections
* Seen elements in sliding window problems

**Time complexities**:

* Add: O(1)
* Search: O(1)

---

## ✅ Quick Reference — When to Use

| Data Structure | Use when...                                     |
| -------------- | ----------------------------------------------- |
| Array          | You know the exact number of items              |
| ArrayList      | Need dynamic array, fast access by index        |
| LinkedList     | Need frequent insertions/removals at ends       |
| HashMap        | Fast lookups by key                             |
| HashSet        | Need uniqueness, check if element seen before   |
| StringBuilder  | Repeated string modifications (reverse, append) |

---
