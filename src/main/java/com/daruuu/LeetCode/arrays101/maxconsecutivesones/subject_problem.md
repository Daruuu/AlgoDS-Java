### 1. Max Consecutive Ones

**Problem:**  
Given a binary array `nums`, return the maximum number of consecutive `1`s in
the array.

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

✅ *This is a classic problem to practice understanding Array capacity vs length,
and how to iterate correctly through arrays using `.length`.*

---
💻 Solution:
🔗 [View Solution](https://github.com/daruuu/AlgoDS-Java/src/main/java/com/daruuu/LeetCode/arrays101/maxconsecutiveones/MaxConsecutiveOnes.java)

🧪 Tests

💻 Solution:
🔗 [View Solution](https://github.com/daruuu/AlgoDS-Java/src/test/java/com/daruuu/LeetCode/arrays101/MaxConsecutiveOnesTest.java)

Here are example test cases using JUnit 5:

``` java

@Test
void shouldReturnThree_whenArrayHasThreeConsecutiveOnes() {
int[] input = {1, 1, 0, 1, 1, 1};
assertEquals(3, MaxConsecutiveOnes.findMaxConsecutiveOnes(input));
}

@Test
void shouldReturnTwo_whenArrayHasTwoConsecutiveOnes() {
int[] input = {1, 0, 1, 1, 0, 1};
assertEquals(2, MaxConsecutiveOnes.findMaxConsecutiveOnes(input));
}

@Test
void shouldReturnZero_whenArrayHasOnlyZeros() {
int[] input = {0, 0, 0, 0};
assertEquals(0, MaxConsecutiveOnes.findMaxConsecutiveOnes(input));
}

@Test
void shouldReturnLength_whenArrayHasOnlyOnes() {
int[] input = {1, 1, 1, 1, 1};
assertEquals(5, MaxConsecutiveOnes.findMaxConsecutiveOnes(input));
}
```

✅ This way, anyone reading your README can see the problem, solution, and how it
is tested.