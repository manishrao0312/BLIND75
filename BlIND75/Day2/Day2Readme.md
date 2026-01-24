Day 2 – Contains Duplicate
📌 Information

Platform: LeetCode

Difficulty: Easy

Topic: Array, HashMap

Date Solved: 24/01/2026

Time Solved: —

🧩 Problem Statement

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

📘 Example
Example 1

Input:
nums = [1, 2, 3, 1]

Output:
true

Explanation:
The number 1 appears more than once.

Example 2

Input:
nums = [1, 2, 3, 4]

Output:
false

Explanation:
All elements are unique.

❌ Brute Force Approach
Logic

Use two nested loops (i and j)

Fix one element at index i

Compare it with all remaining elements using j

If any two elements are equal, return true

Drawback

Every element is compared with every other element

Complexity

Time Complexity: O(n²)

Space Complexity: O(1)

This approach works but is inefficient for large inputs.

✅ Optimal Approach (Using HashMap)
Key Idea

Instead of comparing every pair:

Traverse the array once

Keep track of elements that have already been seen

If the current element was seen before, a duplicate exists

🧠 Algorithm Steps

Initialize a HashMap to store numbers already encountered

Traverse the array using a single loop

For each element:

Check if it already exists in the map

If yes → return true

If no → store it in the map

If the loop completes, return false

⏱️ Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(n)

Extra space is used to achieve faster lookup and avoid nested loops.

✅ Final Notes

This problem is about existence, not position

Checking presence (containsKey) is safer than fetching values (get)

The HashMap acts as memory of previously seen elements

# Day 2 – Contains Duplicate

## 📌 Information
- **Platform:** LeetCode  
- **Difficulty:** Easy  
- **Topic:** Array, HashMap  
- **Date Solved:** 24/01/2026  
- **Time Solved:** —  

---

## 🧩 Problem Statement
Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is **distinct**.

---

## 📘 Examples

### Example 1
**Input:**
nums = [1, 2, 3, 1]

**Output:**
true

**Explanation:**  
The number `1` appears more than once.

---

### Example 2
**Input:**
nums = [1, 2, 3, 4]

**Output:**
false

**Explanation:**  
All elements are unique.

---

## ❌ Brute Force Approach

### 💡 Logic
- Use two nested loops (`i` and `j`)
- Fix one element at index `i`
- Compare it with all remaining elements using `j`
- If any two elements are equal, return `true`

### ⚠️ Drawback
- Every element is compared with every other element

### ⏱️ Complexity
- **Time Complexity:** `O(n²)`
- **Space Complexity:** `O(1)`

This approach works but becomes inefficient for large inputs.

---

## ✅ Optimal Approach (Using HashMap)

### 🔑 Key Idea
Instead of comparing every pair:
- Traverse the array once
- Keep track of elements already seen
- If the current element is seen again, a duplicate exists

---

## 🧠 Algorithm Steps
1. Initialize a `HashMap` (or `HashSet`) to store elements already encountered  
2. Traverse the array using a single loop  
3. For each element:
   - If it already exists in the map → return `true`
   - Otherwise, store it in the map  
4. If the loop completes, return `false`

---

## ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

Extra space is used to achieve faster lookups and avoid nested loops.

---

## ✅ Final Notes
- This problem is about **existence**, not position  
- Checking presence (`containsKey`) is safer than fetching values (`get`)  
- The HashMap acts as **memory of previously seen elements**
🆕 New README.md — Valid Anagram
# Day X – Valid Anagram

## 📌 Information
- **Platform:** LeetCode  
- **Difficulty:** Easy  
- **Topic:** String, HashMap  
- **Date Solved:** 24/01/2026  
- **Time Solved:** —  

---

## 🧩 Problem Statement
Given two strings `s` and `t`, return `true` if `t` is an **anagram** of `s`, and `false` otherwise.

An anagram is formed by rearranging the letters of a string using **all original characters exactly once**.

---

## 📘 Examples

### Example 1
**Input:**
s = "anagram"
t = "nagaram"

**Output:**
true


### Example 2
**Input:**
s = "rat"
t = "car"

**Output:**
false


---

## ❌ Brute Force Approach

### 💡 Logic
- Sort both strings
- Compare the sorted versions
- If they are equal → anagram

### ⚠️ Drawback
- Sorting adds extra time overhead

### ⏱️ Complexity
- **Time Complexity:** `O(n log n)`
- **Space Complexity:** `O(1)` or `O(n)` (depending on sorting method)

---

## ✅ Optimal Approach (Using HashMap)

### 🔑 Key Idea
Anagrams must have:
- Same characters  
- Same frequency for each character  

Order does **not** matter, frequency does.

---

## 🧠 Algorithm Steps
1. If lengths of `s` and `t` differ, return `false`
2. Create a `HashMap<Character, Integer>`
3. Traverse string `s`:
   - Increase count of each character
4. Traverse string `t`:
   - If character does not exist in map → return `false`
   - Decrease count
   - If count becomes negative → return `false`
5. If all counts balance, return `true`

---

## ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## ✅ Final Notes
- Order of characters is irrelevant  
- Frequency balance is mandatory  
- `get + put` is used to update counts  
- This is a classic **frequency accounting** problem