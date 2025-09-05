# Find Numbers with Even Number of Digits

## Problem
Given an array `nums` of integers, return how many of them contain an even number of digits.

---

## Examples

### Example 1
**Input**:  

``` java
nums = [12, 345, 2, 6, 7896]
```

**Output**:  

``` java
    2
```

**Explanation**:  
- 12 contains 2 digits → even  
- 345 contains 3 digits → odd  
- 2 contains 1 digit → odd  
- 6 contains 1 digit → odd  
- 7896 contains 4 digits → even  

Therefore only **12** and **7896** contain an even number of digits.

---

### Example 2
**Input**:  
```
nums = \[555, 901, 482, 1771]
```

**Output**:  
```
1
```

**Explanation**:  
Only **1771** contains an even number of digits.

---

## Constraints
- `1 <= nums.length <= 500`
- `1 <= nums[i] <= 10^5`

--- 