# Day 1 – Two Sum

## 📌 Information
- Platform: LeetCode  
- Difficulty: Easy  
- Topic: Array, HashMap  
- Date Solved: 23/01/2026  
- Time Solved: 7:42 PM  

---

## 🧩 Problem Statement
Given an array of integers `nums` and an integer `target`, return the **indices of the two numbers** such that they add up to `target`.

- Each input has **exactly one solution**
- The same element **cannot be used twice**
- The order of indices does not matter

---

## 📘 Example
Input:
nums = [2, 4, 5, 6, 7]
target = 8

Output:
[0, 3]


Explanation:
nums[0] + nums[3] → 2 + 6 = 8


---

## ❌ Brute Force Approach

### Logic
- Use two nested loops (`i` and `j`)
- Fix one element using `i`
- Traverse the rest of the array using `j`
- Check if `nums[i] + nums[j] == target`

### Drawback
- Every element is compared with every other element

### Complexity
- **Time Complexity:** O(n²)  
- **Space Complexity:** O(1)  

This approach works but is inefficient for large arrays.

---

## ✅ Optimal Approach (Using HashMap)

### Key Idea
Instead of checking all possible pairs, we:
- Traverse the array **once**
- For each element, calculate the **required value** to reach the target
- Check if this required value was already seen earlier

### Why HashMap?
A HashMap stores data in the format:
value → index


This allows:
- Constant-time lookup (O(1) average)
- Remembering previously seen numbers and their indices

---

## 🧠 Algorithm Steps
1. Create a HashMap to store values and their indices
2. Traverse the array using a single loop
3. For each element:
   - Compute `needed = target - nums[i]`
   - If `needed` exists in the map:
     - Return the index stored in the map and the current index
   - Otherwise:
     - Store the current value and its index in the map
4. Return an empty array if no solution is found