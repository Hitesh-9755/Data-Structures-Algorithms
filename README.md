# Data Structures & Algorithms - Daily Problem Solving Repository

A comprehensive repository for solving Data Structures and Algorithms problems daily with proper organization and tracking.

## 📁 Repository Structure

```
A2Z/
├── Problems/               # Solved problems organized by difficulty
│   ├── Easy/              # Easy level problems
│   ├── Medium/            # Medium level problems
│   └── Hard/              # Hard level problems
│
├── DataStructures/        # Core data structure implementations
│   ├── Arrays/
│   ├── Strings/
│   ├── LinkedList/
│   ├── Trees/
│   ├── Graphs/
│   ├── HashMaps/
│   └── Stacks_Queues/
│
├── Algorithms/            # Algorithm implementations and problems
│   ├── Sorting/
│   ├── Searching/
│   ├── DynamicProgramming/
│   ├── Recursion/
│   └── Greedy/
│
├── Fundamentals/          # Basic concepts and fundamentals
│   ├── BasicMath/
│   └── Patterns/
│
├── Resources/             # Notes, references, and resources
├── PROGRESS.md           # Daily progress tracking
├── README.md             # This file
└── .gitignore           # Git ignore patterns
```

## 📝 How to Add a Problem Solution

### Step 1: Create Solution File
Create a Java file in the appropriate folder:
```
Problems/Easy/ProblemName.java
Problems/Medium/ProblemName.java
Problems/Hard/ProblemName.java
```

### Step 2: Follow Solution Template
```java
/**
 * Problem: Problem Statement
 * Difficulty: Easy/Medium/Hard
 * Link: (problem source link if applicable)
 * Date Solved: YYYY-MM-DD
 * 
 * Approach:
 * 1. Explanation of approach
 * 2. Time Complexity: O(?)
 * 3. Space Complexity: O(?)
 */

public class ProblemName {
    // Solution code here
}
```

### Step 3: Update Progress File
Add entry to `PROGRESS.md` with date, problem name, difficulty, and approach summary.

## 🚀 Daily Push Routine

### Every Day:
1. **Solve a problem** - Pick from LeetCode, HackerRank, or other platforms
2. **Create file** - Add to appropriate difficulty folder
3. **Document solution** - Include comments and approach
4. **Update PROGRESS.md** - Track what you solved
5. **Commit and Push**:
   ```bash
   git add .
   git commit -m "Add: ProblemName (Difficulty) - Date"
   git push origin main
   ```

### Commit Message Format:
```
Add: ProblemName (Difficulty) - YYYY-MM-DD
Fix: Improved solution for ProblemName
Refactor: Optimized algorithm for ProblemName
Study: DataStructure/Algorithm theory notes
```

## 📊 Progress Tracking

Check [PROGRESS.md](PROGRESS.md) for:
- Daily solved problems
- Problem difficulty level
- Algorithms/data structures used
- Time and space complexity
- Key learnings

## 🎯 Learning Categories

### By Data Structure:
- **Arrays**: Problems involving array manipulation, sorting, searching
- **Strings**: String manipulation, pattern matching, palindromes
- **LinkedList**: Insertion, deletion, reversal, cycle detection
- **Trees**: BST, traversal, paths, ancestors, LCA
- **Graphs**: DFS, BFS, shortest path, connected components
- **HashMaps**: Frequency counting, two sum variations, grouping
- **Stacks/Queues**: Valid parentheses, sliding window, monotonic stacks

### By Algorithm:
- **Sorting**: Merge Sort, Quick Sort, Heap Sort, custom sorting
- **Searching**: Binary Search, linear search variations
- **Dynamic Programming**: 0/1 Knapsack, LIS, LCS, grid paths
- **Recursion**: Permutations, combinations, backtracking
- **Greedy**: Activity selection, fractional knapsack, interval problems

## 📈 Goals

- [ ] Solve 1-2 problems daily
- [ ] Maintain consistent commit history
- [ ] Document all solutions with clear explanations
- [ ] Build intuition for different problem types
- [ ] Master core data structures and algorithms

## 🔗 Useful Resources

- **LeetCode**: [leetcode.com](https://www.leetcode.com)
- **HackerRank**: [hackerrank.com](https://www.hackerrank.com)
- **GeeksforGeeks**: [geeksforgeeks.org](https://www.geeksforgeeks.org)
- **InterviewBit**: [interviewbit.com](https://www.interviewbit.com)

## 💡 Tips for Success

1. **Consistency**: Push a solution every day, even if small
2. **Understanding**: Focus on understanding the approach, not just memorizing
3. **Optimization**: Always try to improve time/space complexity
4. **Documentation**: Clear comments help future reference
5. **Variety**: Solve problems from different categories
6. **Review**: Periodically review past solutions for learning

## 📌 Getting Started

```bash
# Configure git (if not done)
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"

# Make first commit
git add .
git commit -m "Initial commit: Repository structure setup"
git push origin main
```

---

**Keep solving, keep learning!** 🚀

Last Updated: 2025-12-13
