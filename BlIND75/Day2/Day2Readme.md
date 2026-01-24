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