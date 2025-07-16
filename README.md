
# 🧠 Algorithms and Data Structures in Java

This repository contains a collection of algorithm and data structure implementations in Java.<br>
It is designed for learning, practice, and preparing for technical interviews, with exercises <br>
categorized by platform, problem type, and algorithmic technique.

---

## 📁 Directory Overview

``` markdown

    daruuu/
    ├── HackerRank/
    │   ├── Algorithms/
    │   └── DataStructures/
    ├── LeetCode/
    │   ├── array/
    │   ├── dynamicprogramming/
    │   ├── greedyalgorithms/
    │   └── twopointers/
    ├── sortAndSearchAlgorithms/
    ├── teorywithexamples/
    ├── typesofcomplexity/
    └── Main.java
```

---

## 📌 HackerRank Challenges

### `HackerRank/Algorithms`

| Algorithm | File | Description |
|----------|------|-------------|
| A Very Big Sum | `AVeryBigSum.java` | Sums large integers that may exceed standard data types. |
| Compare Triplets | `CompareTriplets.java` | Compares scores of two players based on multiple criteria. |
| Diagonal Difference | `DiagonalDifference.java` | Calculates the absolute difference between the diagonals of a square matrix. |
| Mini-Max Sum | `MiniMaxSum.java` | Finds the minimum and maximum sum of 4 out of 5 integers. |

Each folder includes a `subject.txt` describing the problem statement.

### `HackerRank/DataStructures`

- `ReverseArray.java`: Reverses the elements of an array.
- Includes input/output samples (`sampleInput.png`, `subject.png`).

---

## 📌 LeetCode Solutions

### `LeetCode/array`

| Algorithm | Description |
|----------|-------------|
| BuildArrayFromPermutation.java | Builds a new array using the permutation rule `arr[i] = arr[arr[i]]`. |
| ConcatenationOfArray.java | Concatenates an array with itself. |
| FindWordsContainingCharacter.java | Filters words containing a specific character. |
| KeyboardRow.java | Returns words that can be typed using one row of a keyboard. |
| LenghtOfLastWord.java | Finds the length of the last word in a string. |
| LongestCommonPrefix.java | Finds the longest common prefix of a list of strings. |
| MinimumIndexSumOfTwoLists.java | Finds common strings with the least index sum. |
| ShuffleTheArray.java | Shuffles an array in the form [x1,x2,...,xn,y1,y2,...,yn] to [x1,y1,x2,y2,...]. |
| StringMatchingInArray.java | Finds strings that are substrings of another string. |
| TwoSum.java | Finds two numbers that sum to a given target. |

### `LeetCode/dynamicprogramming`

| Algorithm | Description |
|----------|-------------|
| ClimbingStairs.java | Solves the classic "ways to climb stairs" problem using DP. |
| FibonacciNumber.java | Computes Fibonacci numbers using memoization. |

### `LeetCode/greedyalgorithms`

| Algorithm | Description |
|----------|-------------|
| ArrayPartition.java | Maximizes the sum of minimums in array pairs. |
| LongestPalidrome.java | Finds the length of the longest palindrome that can be built. |

### `LeetCode/twopointers`

| Algorithm | Description |
|----------|-------------|
| FindFirstPalindromicStringInArray.java | Finds the first palindrome in an array. |
| FindIndexOfTheFirstOccurrenceInString.java | Returns the index of the first occurrence of a substring. |
| MergeStringsAlternately.java | Alternately merges characters from two strings. |
| ReverPrefixOfWord.java | Reverses the prefix of a word up to a given character. |
| ReverseString.java | Reverses a character array in-place. |
| ReverseWordsInString3.java | Reverses words in a sentence but not their order. |
| ValidPalindrome.java | Checks if a string is a palindrome (ignoring non-alphanumeric chars). |

---

## 🔍 Sorting and Searching Algorithms

### `sortAndSearchAlgorithms/`

| Algorithm | File | Description |
|----------|------|-------------|
| Linear Search | `LinearSearch01.java` | Iterates through array to find a target. |
| Binary Search | `BinarySearch02.java` | Efficiently searches sorted arrays using divide and conquer. |
| Bubble Sort | `BubbleSort03.java` | Repeatedly swaps adjacent elements in wrong order. |
| Insertion Sort | `InsertionSort04.java` | Builds sorted array by inserting one element at a time. |
| Merge Sort | `MergeSort05.java` | Divides the array and merges sorted halves. |
| Selection Sort | `SelectionSort.java` | Selects the minimum element and places it at the correct position. |

Each file has a corresponding test class and is documented with example input/output.

---

## 📘 Theoretical Notes and Interview Prep

### `teorywithexamples/`

| File | Description |
|------|-------------|
| `bigOAnotation.md` | Time and space complexity fundamentals. |
| `javaInterviewNotes.md` | Java-specific interview questions and answers. |
| `typeOfDataStructures.md` | Categorization and explanation of common data structures. |
| `Person.java` | Simple class for OOP and theory demonstration. |

---

## ⏱️ Time & Space Complexity Exercises

### `typesofcomplexity/`

| Exercise | Description |
|----------|-------------|
| `Exercise01.java` to `Exercise04.java` | Simple Java programs designed to analyze and reason about algorithm complexity. |

---

## ✅ Unit Testing with JUnit 5

Tests are located in the `src/test/java/...` directory, organized to mirror the structure of your main code.

### Features:

- Written using **JUnit 5**
- Each class has its corresponding test class
- Assertions for correctness and edge cases

### Run all tests:

``` bash
    mvn test
```

--- 
