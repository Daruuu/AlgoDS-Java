### 🔹 What Is an Array

* An **Array** is a collection of elements (integers, strings, objects, etc.)
  stored in **contiguous memory locations**.
* Its size **N** is fixed at creation and cannot be changed afterward.

---

### 🔹 Creating an Array

* In Java:

``` java
  DVD[] dvdCollection = new DVD[15];
```

* It can only store elements of the specified type (`DVD` in this case).
* If more space is needed (e.g., a 16th DVD), a new Array must be created.

---

### 🔹 Accessing Elements

1. **Writing (inserting)**

    * Use the index (from `0` to `N-1`).
    * Assigning a new value to an index **overwrites** the old one.

``` java
   dvdCollection[7] = avengersDVD;
```

2. **Reading (retrieving)**

    * Access is also by index.
    * If a slot has no value:

        * For objects → `null`.
        * For primitives → default values:

            * `int` → 0
            * `float` → 0.0
            * `boolean` → false

---

### 🔹 Using Loops with Arrays

* **Standard `for` loop:** useful when you need the index (e.g., filling
  values).

``` java
  for (int i = 0; i < 10; i++) {
      squareNumbers[i] = (i + 1) * (i + 1);
  }
```

* **For-each loop:** more readable, but doesn’t provide index access (mainly for
  reading).

``` java
  for (int square : squareNumbers) {
      System.out.println(square);
  }
```

---

✅ **Key Idea:**
An Array in Java is a fixed-size structure that stores elements of the same type
in indexed slots. You can insert, read, and overwrite elements, and loops are
typically used to handle multiple values efficiently.

---

---

### 🔹 Two Meanings of "Length"

When someone asks, *“How long is the Array?”*, there are **two possible answers
**:

1. **Capacity** → how many items the Array *can hold* in total.
2. **Length** → how many items are *actually stored* right now.

Both are correct but mean different things.

---

### 🔹 Array Capacity

* Defined when the Array is created and **cannot change**.

* Example:

``` java
  DVD[] array = new DVD[6];
```

    * Capacity = 6
    * Valid indexes: 0 to 5
    * Invalid operations:

      ```java
      array[6] = new DVD(...);   // ❌ ArrayIndexOutOfBoundsException
      array[10] = new DVD(...);  // ❌ Crash
      ```

* You can check capacity using `.length`:

``` java
  int capacity = array.length;
  System.out.println("The Array has a capacity of " + capacity);
  // Output: The Array has a capacity of 6
```

⚠️ Note: in Java, `.length` refers to the **capacity** of the Array.

---

### 🔹 Array Length

* Represents how many items are currently in the Array.
* You must track this **manually** with a counter variable.
* Example:

``` java
  DVD[] array = new DVD[6];
  int length = 0; // currently no DVDs stored

  array[0] = new DVD("Inception", 2010, "Christopher Nolan");
  length++;
  array[1] = new DVD("Avatar", 2009, "James Cameron");
  length++;
  array[2] = new DVD("Titanic", 1997, "James Cameron");
  length++;

  System.out.println("The Array has a capacity of " + array.length);
  System.out.println("The Array has a length of " + length);
```

**Output:**

```
  The Array has a capacity of 6
  The Array has a length of 3
```

---

### 🔹 Arrays as Parameters (LeetCode Example)

* Most coding problems give you just an Array as input:

  ```java
  public int findMaxConsecutiveOnes(int[] nums) {
      // nums is the only parameter
  }
  ```

* Here, you don’t get a separate "capacity" or "length".

* By convention:

```
  length == capacity
```

→ The Array is the exact size it needs to be.

* To iterate through all items:

``` java
  for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
  }
  ```

✅ Remember: Arrays are **0-indexed**, so the last index is `.length - 1`.

---

### ✅ Key Takeaway

* **Capacity (`arr.length`)** = total possible slots (fixed when created).
* **Length (tracked manually)** = number of items currently filled.
* In coding problems, you can assume `capacity == length`.

---

---

## 🚀 Problems to Practice

### 1. Max Consecutive Ones

**Problem:**  
Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

---

**Example 1:**
``` java
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits `[1,1]` or the last three digits `[1,1,1]` are consecutive 1s.  
The maximum number of consecutive 1s is 3.
````

**Example 2:**

``` java
Input: nums = [1,0,1,1,0,1]
Output: 2
```

---

**Constraints:**

* `1 <= nums.length <= 10^5`
* `nums[i]` is either `0` or `1`

---

✅ *This is a classic problem to practice understanding Array capacity vs length, and how to iterate correctly through arrays using `.length`.*

---
💻 Solution:
🔗 [View Solution](https://github.com/daruuu/AlgoDS-Java/src/main/java/com/daruuu/LeetCode/arrays101/maxconsecutivesones/MaxConsecutiveOnes.java)

