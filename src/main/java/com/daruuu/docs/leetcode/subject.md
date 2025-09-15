# Duplicate Zeros

## Problem
Given a fixed-length integer array `arr`, duplicate each occurrence of zero, shifting the remaining elements to the right.

- Elements beyond the length of the original array are **not written**.
- The modifications must be done **in place** and the function should not return anything.

---

## Examples

### Example 1
**Input**:  
``` java
arr = [1,0,2,3,0,4,5,0]
```

**Output**:  
``` java
[1,0,0,2,3,0,0,4]
```

**Explanation**:  
After calling your function, the input array is modified to: `[1,0,0,2,3,0,0,4]`.

---

### Example 2
**Input**:  

``` java
arr = [1,2,3]
```

**Output**:  

```
[1,2,3]
```

**Explanation**:  
No zeros to duplicate, so the array remains unchanged.

---

## Constraints
- `1 <= arr.length <= 10^4`
- `0 <= arr[i] <= 9`

---
