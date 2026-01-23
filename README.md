# BLIND75 – LeetCode Practice

This repository contains my solutions to the **BLIND 75** LeetCode problems.  
The goal of this repo is to build strong **data structures & algorithms fundamentals** and prepare for **technical interviews**.

All solutions are written with **clarity, correctness, and optimal complexity** in mind.

---

## 📌 Progress Tracker

| Day | Problem | Approach | Time | Space |
|----|--------|---------|------|-------|
| Day 1 | Two Sum | HashMap | O(n) | O(n) |

---

## 📂 Repository Structure

BLIND75/
├── README.md
└── Day1/
└── TwoSum.java

- Each day has its own folder  
- Each problem has a clean, self-contained solution file  
- Code is written in **Java**

---

## 🧠 Problem Breakdown

### Day 1 – Two Sum

**Problem:**  
Given an array of integers and a target value, return the indices of the two numbers such that they add up to the target.

**Brute Force:**  
- Two nested loops  
- Time Complexity: `O(n²)`  
- Inefficient for large inputs

**Optimal Approach:**  
- Use a `HashMap` to store previously seen numbers and their indices  
- For each element, compute `target - currentValue`  
- Check if the required value already exists in the map  

**Why it works:**  
- HashMap provides `O(1)` average lookup time  
- Only one traversal of the array is required  

**Complexity:**  
- Time: `O(n)`  
- Space: `O(n)`

---

## 🛠 Language & Tools

- Language: **Java**
- Platform: **LeetCode**
- Version Control: **Git & GitHub**

---

## 🎯 Goal

- Complete all BLIND 75 problems
- Strengthen problem-solving patterns
- Build an interview-ready DSA repository

---

## 📅 Started On

- **23 / 01 / 2026**

---

## 🚀 Notes

This repository is meant for **learning and revision**, not just storing answers.  
Each solution focuses on **why it works**, not just making it pass.

More problems coming soon.
