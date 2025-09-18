# Data Structures in Java - Complete Guide

## 🧩 Overview

This guide covers the most commonly used data structures in Java, their time complexities, use cases, and practical examples for algorithm problems.

---

## 🔸 Arrays

### Characteristics
* ✅ Fixed size, fast index access
* ❌ Size can't change after creation
* 🔧 Use when you know the number of elements ahead of time

### Java Implementation
```java
int[] arr = {1, 2, 3};
arr[0] = 10;
int value = arr[2];
```

### Time Complexities
| Operation | Complexity | Description |
|-----------|------------|-------------|
| Access | O(1) | Direct index access |
| Search | O(n) | Linear search through elements |
| Insert/Delete (middle) | O(n) | Need to shift elements |
| Insert/Delete (end) | O(1) | Direct access to last element |

### Common Algorithms
* Binary search (on sorted arrays)
* Two pointers technique
* Sliding window

---

## 🔸 Strings

### Characteristics
* Immutable sequences of characters in Java
* Good for character-based logic, but expensive to modify frequently
* Use `StringBuilder` for frequent modifications

### Java Methods
```java
String s = "hello";
char c = s.charAt(1);        // 'e'
String upper = s.toUpperCase(); // "HELLO"
int length = s.length();      // 5
```

### StringBuilder for Modifications
```java
StringBuilder sb = new StringBuilder("abc");
sb.append("d");  // "abcd"
sb.reverse();    // "dcba"
String result = sb.toString();
```

### Common Use Cases
* Palindrome problems
* Substring search
* String manipulation
* Pattern matching

---

## 🔸 Lists (ArrayList, LinkedList)

### ArrayList
* ✅ Dynamic size, fast random access
* ❌ Expensive insertions/deletions in middle
* 🔧 Use for frequent access by index

### LinkedList
* ✅ Fast insertions/deletions at ends
* ❌ Slow random access
* 🔧 Use for frequent insertions/removals

### Java Implementation
```java
List<Integer> arrayList = new ArrayList<>();
List<Integer> linkedList = new LinkedList<>();

// Common operations
list.add(5);           // Add element
list.get(0);           // Get by index
list.remove(0);         // Remove by index
list.contains(5);      // Check existence
list.size();           // Get size
```

### Time Complexities
| Operation | ArrayList | LinkedList |
|-----------|-----------|------------|
| Access | O(1) | O(n) |
| Insert/Remove (end) | O(1) | O(1) |
| Insert/Remove (middle) | O(n) | O(n) |
| Search | O(n) | O(n) |

### Common Algorithms
* Sliding window
* Merge intervals
* BFS queue (LinkedList)
* Dynamic programming

---

## 🔸 HashMap

### Characteristics
* Key-value store with average O(1) access
* No duplicate keys allowed
* Use when quick lookup by key is required

### Java Implementation
```java
Map<String, Integer> map = new HashMap<>();

// Common operations
map.put("apple", 3);           // Insert/Update
int count = map.get("apple");   // Get value
boolean exists = map.containsKey("banana"); // Check key
map.remove("apple");            // Remove
int size = map.size();          // Get size
```

### Common Use Cases
* Counting frequencies
* Caching/memoization
* Finding complements (two-sum problem)
* Grouping elements

### Time Complexities
| Operation | Complexity | Description |
|-----------|------------|-------------|
| Put | O(1) average | Insert/update key-value pair |
| Get | O(1) average | Retrieve value by key |
| Remove | O(1) average | Remove key-value pair |
| Contains Key | O(1) average | Check if key exists |

---

## 🔸 HashSet

### Characteristics
* No duplicates, no order
* Internally backed by a HashMap
* Use when you need uniqueness

### Java Implementation
```java
Set<Integer> set = new HashSet<>();

// Common operations
set.add(10);           // Add element
boolean exists = set.contains(10); // Check existence
set.remove(10);        // Remove element
int size = set.size(); // Get size
```

### Common Use Cases
* Checking for duplicates
* Set intersections
* Tracking seen elements in sliding window problems
* Finding unique elements

### Time Complexities
| Operation | Complexity | Description |
|-----------|------------|-------------|
| Add | O(1) average | Add element |
| Contains | O(1) average | Check if element exists |
| Remove | O(1) average | Remove element |

---

## 🔸 Stack

### Characteristics
* LIFO (Last In, First Out) data structure
* Use for problems involving nested structures or backtracking

### Java Implementation
```java
Stack<Integer> stack = new Stack<>();

// Common operations
stack.push(5);         // Add to top
int top = stack.pop(); // Remove from top
int peek = stack.peek(); // View top without removing
boolean empty = stack.isEmpty(); // Check if empty
```

### Common Use Cases
* Expression evaluation
* Undo operations
* Function call management
* Balanced parentheses problems

---

## 🔸 Queue

### Characteristics
* FIFO (First In, First Out) data structure
* Use for BFS and level-order traversals

### Java Implementation
```java
Queue<Integer> queue = new LinkedList<>();

// Common operations
queue.offer(5);        // Add to end
int front = queue.poll(); // Remove from front
int peek = queue.peek();  // View front without removing
boolean empty = queue.isEmpty(); // Check if empty
```

### Common Use Cases
* BFS (Breadth-First Search)
* Level-order tree traversal
* Task scheduling
* Buffer management

---

## ✅ Quick Reference - When to Use

| Data Structure | Use When... | Time Complexity |
|----------------|-------------|-----------------|
| Array | You know the exact number of items | Access: O(1), Search: O(n) |
| ArrayList | Need dynamic array, fast access by index | Access: O(1), Insert: O(n) |
| LinkedList | Need frequent insertions/removals at ends | Insert/Remove: O(1), Access: O(n) |
| HashMap | Fast lookups by key | All operations: O(1) average |
| HashSet | Need uniqueness, check if element seen | All operations: O(1) average |
| StringBuilder | Repeated string modifications | Append: O(1), toString: O(n) |
| Stack | Nested structures, backtracking | Push/Pop: O(1) |
| Queue | BFS, level-order processing | Offer/Poll: O(1) |

---

## 🎯 Algorithm Problem Patterns

### Two Pointers
- **Use**: Arrays, Strings
- **Pattern**: Start with pointers at both ends or both at start
- **Examples**: Two Sum, Valid Palindrome, Container With Most Water

### Sliding Window
- **Use**: Arrays, Strings
- **Pattern**: Maintain a window of elements
- **Examples**: Longest Substring Without Repeating Characters, Maximum Sum Subarray

### Hash Map/Dictionary
- **Use**: Frequency counting, complement finding
- **Pattern**: Store processed elements for quick lookup
- **Examples**: Two Sum, Group Anagrams, Longest Consecutive Sequence

### Stack
- **Use**: Nested structures, matching problems
- **Pattern**: Process elements in LIFO order
- **Examples**: Valid Parentheses, Daily Temperatures, Largest Rectangle in Histogram

---
