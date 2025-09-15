# 🧠 Algorithms and Data Structures in Java

This repository contains a comprehensive collection of algorithm and data structure
implementations in Java.<br>
It is designed for learning, practice, and preparing for technical interviews,
with exercises categorized by platform, problem type, and algorithmic technique.

---

[![Java](https://img.shields.io/badge/Java-11-orange?logo=java)](https://www.oracle.com/java/)
[![Build](https://img.shields.io/badge/build-Maven-blue?logo=apache-maven)](pom.xml)
[![Tests](https://img.shields.io/badge/tests-JUnit%205-green?logo=junit)](https://junit.org/junit5/)
[![License](https://img.shields.io/badge/license-MIT-green)](LICENSE)
[![LeetCode](https://img.shields.io/badge/Problems-LeetCode-yellow?logo=leetcode)](https://leetcode.com/)
[![HackerRank](https://img.shields.io/badge/Problems-HackerRank-brightgreen?logo=hackerrank)](https://www.hackerrank.com/)

---

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation
```bash
git clone https://github.com/Daruuu/AlgoDS-Java.git
cd AlgoDS-Java
mvn clean compile
```

### Running Tests
```bash
mvn test
```

### Running Specific Examples
```bash
mvn exec:java -Dexec.mainClass="com.daruuu.Main"
```

## 📊 Progress Overview

| Platform | Category | Solved | Status |
|----------|----------|--------|--------|
| LeetCode | Easy Arrays | 16 | ✅ |
| LeetCode | Easy Strings | 6 | ✅ |
| LeetCode | Easy Math | 2 | ✅ |
| LeetCode | Easy Two Pointers | 8 | ✅ |
| LeetCode | Medium Arrays | 1 | 🔄 |
| LeetCode | Medium Dynamic Programming | 2 | 🔄 |
| LeetCode | Medium Greedy | 2 | 🔄 |
| LeetCode | Medium Sorting | 1 | 🔄 |
| HackerRank | Algorithms | 4 | ✅ |
| HackerRank | Data Structures | 1 | 🔄 |
| **Total** | **All** | **41+** | **🔄** |

### 🎯 Current Focus
- [ ] Complete HackerRank Data Structures section
- [ ] Add more Dynamic Programming problems
- [ ] Implement advanced sorting algorithms (QuickSort, HeapSort)
- [ ] Add graph algorithms section

---

## 📊 Big O Notation, Time & Space Complexity

This section contains notes and Java examples on how to analyze **time and space complexity** of algorithms.

[__View full Big O Examples__](teorywithexamples/bigOAnotation.md)
<br>
[Java Interview Notes](teorywithexamples/javaInterviewNotes.md)
<br>
[type of Data Structures](teorywithexamples/typeOfDataStructures.md)

---

## ⚡ Algorithm Complexity Reference

| Algorithm | Time Complexity | Space Complexity | Best Case | Worst Case |
|-----------|----------------|------------------|-----------|------------|
| Linear Search | O(n) | O(1) | O(1) | O(n) |
| Binary Search | O(log n) | O(1) | O(1) | O(log n) |
| Bubble Sort | O(n²) | O(1) | O(n) | O(n²) |
| Selection Sort | O(n²) | O(1) | O(n²) | O(n²) |
| Insertion Sort | O(n²) | O(1) | O(n) | O(n²) |
| Merge Sort | O(n log n) | O(n) | O(n log n) | O(n log n) |
| Two Sum (HashMap) | O(n) | O(n) | O(n) | O(n) |
| Two Pointers | O(n) | O(1) | O(1) | O(n) |
| Dynamic Programming | O(n) to O(n²) | O(n) to O(n²) | Varies | Varies |

---

## 📁 Directory Overview

### 🏗️ **New Organized Structure**

```
src/main/java/com/daruuu/
├── algorithms/                    # Fundamental algorithms
│   ├── sorting/                   # Sorting algorithms
│   └── searching/                 # Searching algorithms
├── problems/                      # Problems by platform
│   ├── leetcode/                  # LeetCode problems
│   │   ├── easy/                 # Easy problems by category
│   │   ├── medium/                # Medium problems by category
│   │   └── hard/                  # Hard problems by category
│   └── hackerrank/                # HackerRank problems
│       ├── algorithms/            # Algorithm challenges
│       └── dataStructures/         # Data structure challenges
├── utils/                         # Common utilities
├── complexity/                    # Complexity analysis exercises
└── docs/                          # Documentation
```

---

## 🔍 **Fundamental Algorithms**

### `algorithms/sorting/`

| Algorithm | Description | Time Complexity |
|-----------|-------------|-----------------|
| [`BubbleSort`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/algorithms/sorting/BubbleSort.java) | Repeatedly swaps adjacent elements in wrong order | O(n²) |
| [`SelectionSort`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/algorithms/sorting/SelectionSort.java) | Selects minimum element and places at correct position | O(n²) |
| [`InsertionSort`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/algorithms/sorting/InsertionSort.java) | Builds sorted array by inserting one element at a time | O(n²) |
| [`MergeSort`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/algorithms/sorting/MergeSort.java) | Divides array and merges sorted halves | O(n log n) |

### `algorithms/searching/`

| Algorithm | Description | Time Complexity |
|-----------|-------------|-----------------|
| [`LinearSearch`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/algorithms/searching/LinearSearch.java) | Iterates through array to find target | O(n) |
| [`BinarySearch`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/algorithms/searching/BinarySearch.java) | Efficiently searches sorted arrays using divide and conquer | O(log n) |

---

## 📌 **LeetCode Problems**

### **Easy Problems** (32 total)

#### `problems/leetcode/easy/arrays/` (16 problems)
- [`TwoSum`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/TwoSum.java) - Find two numbers that sum to target
- [`BuildArrayFromPermutation`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/BuildArrayFromPermutation.java) - Build array using permutation rule
- [`ConcatenationOfArray`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/ConcatenationOfArray.java) - Concatenate array with itself
- [`ShuffleTheArray`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/ShuffleTheArray.java) - Shuffle array in specific pattern
- [`RunningSumOfOneDArray01`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/RunningSumOfOneDArray01.java) - Calculate running sum
- [`RichestCustomerWealth02`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/RichestCustomerWealth02.java) - Find richest customer
- [`MaxConsecutiveOnes`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/MaxConsecutiveOnes.java) - Find maximum consecutive ones
- [`SortedSquares`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/SortedSquares.java) - Return squares in sorted order
- [`DuplicateZeros`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/DuplicateZeros.java) - Duplicate each occurrence of zero
- [`FindNumbers`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/FindNumbers.java) - Find numbers with even number of digits
- [`FindWordsContainingCharacter`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/FindWordsContainingCharacter.java) - Filter words containing character
- [`HowManyNumbersAreSmallerThanTheCurrentNumber`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/HowManyNumbersAreSmallerThanTheCurrentNumber.java) - Count smaller numbers
- [`KeyboardRow`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/KeyboardRow.java) - Words that can be typed using one keyboard row
- [`StringMatchingInArray`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/StringMatchingInArray.java) - Find strings that are substrings
- [`MiddleOfTheLinkedList05`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/arrays/MiddleOfTheLinkedList05.java) - Find middle of linked list

#### `problems/leetcode/easy/strings/` (6 problems)
- [`LengthOfLastWord`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/strings/LengthOfLastWord.java) - Find length of last word
- [`LongestCommonPrefix`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/strings/LongestCommonPrefix.java) - Find longest common prefix
- [`MinimumIndexSumOfTwoLists`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/strings/MinimumIndexSumOfTwoLists.java) - Find common strings with least index sum
- [`RansomNote06`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/strings/RansomNote06.java) - Check if ransom note can be constructed
- [`RomantoInteger`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/strings/RomantoInteger.java) - Convert Roman numeral to integer
- [`StringToInteger`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/strings/StringToInteger.java) - Convert string to integer

#### `problems/leetcode/easy/math/` (2 problems)
- [`Fizzbuzz03`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/math/Fizzbuzz03.java) - Classic FizzBuzz problem
- [`NumberOfStepsToReduceANumberToZero04`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/math/NumberOfStepsToReduceANumberToZero04.java) - Count steps to reduce number to zero

#### `problems/leetcode/easy/twoPointers/` (8 problems)
- [`FindFirstPalindromicStringInArray`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/twoPointers/FindFirstPalindromicStringInArray.java) - Find first palindrome in array
- [`FindIndexOfTheFirstOccurrenceInString`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/twoPointers/FindIndexOfTheFirstOccurrenceInString.java) - Find first occurrence of substring
- [`MergeStringsAlternately`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/twoPointers/MergeStringsAlternately.java) - Merge strings alternately
- [`RemoveDuplicatesFromSortedArray`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/twoPointers/RemoveDuplicatesFromSortedArray.java) - Remove duplicates from sorted array
- [`ReverPrefixOfWord`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/twoPointers/ReverPrefixOfWord.java) - Reverse prefix of word
- [`ReverseString`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/twoPointers/ReverseString.java) - Reverse character array in-place
- [`ReverseWordsInString3`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/twoPointers/ReverseWordsInString3.java) - Reverse words in sentence
- [`ValidPalindrome`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/easy/twoPointers/ValidPalindrome.java) - Check if string is palindrome

### **Medium Problems** (6 total)

#### `problems/leetcode/medium/arrays/` (1 problem)
- [`RemoveElement_27`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/medium/arrays/RemoveElement_27.java) - Remove element in-place

#### `problems/leetcode/medium/dynamicProgramming/` (2 problems)
- [`ClimbingStairs`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/medium/dynamicProgramming/ClimbingStairs.java) - Ways to climb stairs using DP
- [`FibonacciNumber`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/medium/dynamicProgramming/FibonacciNumber.java) - Fibonacci numbers with memoization

#### `problems/leetcode/medium/greedy/` (2 problems)
- [`ArrayPartition`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/medium/greedy/ArrayPartition.java) - Maximize sum of minimums in array pairs
- [`LongestPalindrome`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/medium/greedy/LongestPalindrome.java) - Find length of longest palindrome

#### `problems/leetcode/medium/sorting/` (1 problem)
- [`SortColors`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/leetcode/medium/sorting/SortColors.java) - Sort array of 0s, 1s, and 2s

---

## 📌 **HackerRank Problems**

### `problems/hackerrank/algorithms/` (4 problems)

| Algorithm | Description |
|-----------|-------------|
| [`AVeryBigSum`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/hackerrank/algorithms/averybigsum02/AVeryBigSum.java) | Sums large integers that may exceed standard data types |
| [`CompareTriplets`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/hackerrank/algorithms/comparetriplets01/CompareTriplets.java) | Compares scores of two players based on multiple criteria |
| [`DiagonalDifference`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/hackerrank/algorithms/diagonaldifference03/DiagonalDifference.java) | Calculates absolute difference between diagonals of square matrix |
| [`MiniMaxSum`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/hackerrank/algorithms/minimaxsum04/MiniMaxSum.java) | Finds minimum and maximum sum of 4 out of 5 integers |

### `problems/hackerrank/dataStructures/` (1 problem)

| Algorithm | Description |
|-----------|-------------|
| [`ReverseArray`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/problems/hackerrank/dataStructures/ReverseArray.java) | Reverses an array in-place using two pointers technique |

---

## 🛠️ **Utilities**

### `utils/`

| Utility | Description |
|---------|-------------|
| [`ListNode`](https://github.com/Daruuu/AlgoDS-Java/blob/master/src/main/java/com/daruuu/utils/ListNode.java) | Common ListNode class for linked list problems |

---

## ⏱️ **Complexity Analysis**

### `complexity/`

| Exercise | Description |
|----------|-------------|
| `Exercise01.java` to `Exercise04.java` | Simple Java programs designed to analyze and reason about algorithm complexity |

---

## 📘 **Documentation**

### `docs/`

| File | Description |
|------|-------------|
| `algorithms/README.md` | Sorting and searching algorithms guide |
| `leetcode/README.md` | LeetCode problems documentation |
| `leetcode/TimeAndSpaceComplexOfAlgorithms.md` | Complexity analysis notes |

---

## ✅ Unit Testing with JUnit 5

Tests are located in the `src/test/java/...` directory, organized to mirror the
structure of your main code.

### Features:

- Written using **JUnit 5**
- Each class has its corresponding test class
- Assertions for correctness and edge cases

### Run all tests:

``` bash
    mvn test
```

---

## 🤝 Contributing

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingAlgorithm`)
3. Commit tus cambios (`git commit -m 'Add some AmazingAlgorithm'`)
4. Push a la rama (`git push origin feature/AmazingAlgorithm`)
5. Abre un Pull Request

### Guidelines
- Sigue las convenciones de Java
- Incluye tests para nuevos algoritmos
- Documenta la complejidad temporal y espacial
- Actualiza el README si es necesario

---

## 🗺️ Roadmap

### Short Term (Next 2 weeks)
- [ ] Complete HackerRank Data Structures
- [ ] Add 5 more LeetCode Medium problems
- [ ] Implement QuickSort and HeapSort

### Medium Term (Next month)
- [ ] Add Graph Algorithms section
- [ ] Implement Tree traversal algorithms
- [ ] Add Backtracking problems

### Long Term
- [ ] Add System Design notes
- [ ] Create video explanations
- [ ] Add competitive programming section

---

## 📚 Additional Resources

### Learning Materials
- [LeetCode Official Guide](https://leetcode.com/explore/)
- [HackerRank Algorithms](https://www.hackerrank.com/domains/algorithms)
- [Big O Cheat Sheet](https://www.bigocheatsheet.com/)

### Books
- "Cracking the Coding Interview" by Gayle McDowell
- "Introduction to Algorithms" by Cormen, Leiserson, Rivest, Stein

### Practice Platforms
- [LeetCode](https://leetcode.com/)
- [HackerRank](https://www.hackerrank.com/)
- [CodeSignal](https://codesignal.com/)

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

**Daruuu** - [GitHub](https://github.com/Daruuu)

---

## 🙏 Acknowledgments

- LeetCode community for amazing problems
- HackerRank for algorithm challenges
- All contributors who help improve this repository

--- 
