# Daily Workflow Guide - Quick Reference

## 🚀 Your Daily Routine (5 minutes)

### 1. Solve a Problem
- Choose from: **LeetCode**, **HackerRank**, **GeeksforGeeks**, **InterviewBit**
- Time estimate: 30-60 minutes per problem

### 2. Create Solution File
**Navigate to appropriate folder:**
```bash
# Easy problems
Problems/Easy/ProblemName.java

# Medium problems  
Problems/Medium/ProblemName.java

# Hard problems
Problems/Hard/ProblemName.java
```

**By Topic (if organizing by data structure):**
```bash
DataStructures/Arrays/ProblemName.java
DataStructures/Strings/ProblemName.java
DataStructures/Trees/ProblemName.java
# etc...
```

### 3. Code Template
Copy from `Resources/SOLUTION_TEMPLATE.java` and fill in:
- Problem statement
- Your approach/algorithm
- Time & Space complexity
- Test cases

### 4. Commit to Git
```bash
# Stage all changes
git add .

# Commit with clear message
git commit -m "Add: ProblemName (Difficulty) - 2025-12-13"

# Push to remote (if configured)
git push origin main
```

### 5. Update Progress
Edit `PROGRESS.md`:
- Add row to progress table
- Update monthly stats
- Note key learnings

---

## 📋 Commit Message Examples

### Format: `Type: Description (Difficulty) - Date`

**Examples:**
```bash
git commit -m "Add: Two Sum (Easy) - 2025-12-13"
git commit -m "Add: LongestSubstring (Medium) - 2025-12-13"  
git commit -m "Add: RegularExpressionMatching (Hard) - 2025-12-13"
git commit -m "Fix: Optimized BubbleSort - 2025-12-13"
git commit -m "Refactor: Clean up code structure - 2025-12-13"
git commit -m "Study: Binary Search notes - 2025-12-13"
```

---

## 🗂️ Folder Structure Quick Map

| Folder | Use For |
|--------|---------|
| `Problems/Easy` | Easy problems (straightforward) |
| `Problems/Medium` | Medium problems (needs optimization) |
| `Problems/Hard` | Hard problems (complex solutions) |
| `DataStructures/*` | Topic-specific implementations |
| `Algorithms/*` | Algorithm implementations |
| `Fundamentals/BasicMath` | Math basics, data types |
| `Fundamentals/Patterns` | Pattern printing |
| `Resources/` | Templates, references, notes |

---

## 💻 Terminal Commands

### Initialize git (already done)
```bash
git init
git config user.name "Your Name"
git config user.email "your@email.com"
```

### Daily workflow
```bash
# Check status
git status

# Add all changes
git add .

# Commit changes
git commit -m "Add: ProblemName (Difficulty) - Date"

# Push to remote
git push origin main

# View commits
git log --oneline
```

### View what you've done
```bash
# See all commits
git log

# See changes made
git diff

# See last commit details
git show HEAD
```

---

## 📊 Progress Tracking

### Weekly Goal
- **Target**: 7 problems/week (1 per day)
- **Easy**: 40% of problems
- **Medium**: 40% of problems  
- **Hard**: 20% of problems

### Monthly Goal
- **Target**: 30 problems/month
- **Consistency**: Never miss a day
- **Variety**: Touch all data structures

### Yearly Goal
- **Target**: 365+ problems solved
- **Master**: Core DSA concepts
- **Interview Ready**: Confident in coding interviews

---

## 🎯 Tips for Success

1. **✅ Solve First, Optimize Second**
   - Get working solution → Optimize → Document

2. **✅ Understand Before Moving On**
   - Don't memorize, understand the logic

3. **✅ Commit Daily**
   - Even if small, consistency builds streaks

4. **✅ Try Multiple Approaches**
   - Brute force → Optimized → Most elegant

5. **✅ Document Edge Cases**
   - Note tricky test cases in comments

6. **✅ Review Weekly**
   - Revisit solutions from 1 week ago

---

## 🔗 Quick Links

- **LeetCode**: https://www.leetcode.com
- **HackerRank**: https://www.hackerrank.com
- **GeeksforGeeks**: https://www.geeksforgeeks.org
- **Java Documentation**: https://docs.oracle.com

---

## ✨ Repository Ready!

Your DSA repository is now organized and ready for daily pushes. Just:

1. **Solve** → 2. **Code** → 3. **Document** → 4. **Commit** → 5. **Track** 

**Repeat daily!** 🚀

---

*Last Updated: 2025-12-13*
