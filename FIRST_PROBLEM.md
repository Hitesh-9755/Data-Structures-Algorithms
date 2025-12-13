# 📝 Your First Problem - Step-by-Step Guide

Complete this checklist for your first daily problem submission!

## ✅ Checklist

### Step 1: Choose a Problem
- [ ] Pick from LeetCode/HackerRank/GeeksforGeeks
- [ ] Note the problem name and difficulty
- [ ] Read problem statement completely
- [ ] Understand input/output format

**Example**: "Two Sum" (Easy, LeetCode #1)

---

### Step 2: Solve & Test Locally
- [ ] Write solution in your editor
- [ ] Test with provided examples
- [ ] Test with edge cases
- [ ] Verify output is correct

**Example Edge Cases for Two Sum**:
- Empty array
- Array with 1 element
- Duplicate numbers in array
- Negative numbers

---

### Step 3: Create Java File
**Create file at correct location:**
```
Problems/Easy/TwoSum.java
```

**File structure:**
```java
/**
 * Problem: Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/
 * Date Solved: 2025-12-13
 * 
 * APPROACH:
 * Use HashMap to store (value, index) pairs
 * For each number, check if complement (target - num) exists
 * Time: O(n), Space: O(n)
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Your solution here
        
        return result;
    }
    
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        // Test case 1
        int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result1)); // Expected: [0, 1]
        
        // Test case 2
        int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(result2)); // Expected: [1, 2]
    }
}
```

---

### Step 4: Update Progress File
Edit `PROGRESS.md` and add entry like this:

```markdown
| 2025-12-13 | Two Sum | Easy | HashMap, Two Pointers | O(n) | O(n) | ✅ |
```

Also update **Monthly Statistics** section:
```
### December 2025
- **Total Problems Solved**: 1
- **Easy**: 1
- **Medium**: 0
- **Hard**: 0
- **Streak**: 1 day
```

---

### Step 5: Commit & Push
```bash
# Navigate to repository
cd "C:\Data Structure & Algorithm with java\A2Z"

# Stage changes
git add .

# Commit with message
git commit -m "Add: TwoSum (Easy) - 2025-12-13"

# Push to GitHub (if repository is linked)
git push origin main
```

---

## 💾 Commit Message Format

Use this format for consistency:
```
Add: ProblemName (Difficulty) - YYYY-MM-DD
```

**Examples**:
- `Add: TwoSum (Easy) - 2025-12-13`
- `Add: LongestSubstring (Medium) - 2025-12-13`
- `Add: MedianOfTwoSortedArrays (Hard) - 2025-12-13`
- `Fix: Improved TwoSum solution - 2025-12-13`

---

## 📂 File Organization Rules

| Problem Type | Location | Example |
|---|---|---|
| Easy (by difficulty) | `Problems/Easy/` | `Problems/Easy/TwoSum.java` |
| Medium (by difficulty) | `Problems/Medium/` | `Problems/Medium/LongestSubstring.java` |
| Hard (by difficulty) | `Problems/Hard/` | `Problems/Hard/MedianOfTwoSortedArrays.java` |
| Array problems | `DataStructures/Arrays/` | `DataStructures/Arrays/TwoSum.java` |
| String problems | `DataStructures/Strings/` | `DataStructures/Strings/LongestSubstring.java` |

**Choose ONE structure and stick with it!** Recommended: **Difficulty-based** (Problems folder)

---

## 🎯 Daily Routine (After Today)

1. **8:00 AM** - Pick a problem
2. **8:30 AM** - Start solving
3. **9:15 AM** - Solution ready
4. **9:20 AM** - Create Java file
5. **9:25 AM** - Commit and push
6. **9:30 AM** - Update PROGRESS.md

**Total time: ~1.5 hours per problem**

---

## 📚 Resources for Learning

### Before Problem Solving
- Read problem carefully (2-3 times)
- Identify data structures needed
- Think of approach before coding

### While Coding
- Write clean, readable code
- Add meaningful variable names
- Include comments for complex logic

### After Solving
- Optimize if possible
- Document approach
- Test edge cases
- Update progress tracker

---

## 🚀 Success Criteria for Today

✅ Problem solved locally
✅ Java file created in correct folder
✅ PROGRESS.md updated
✅ Git commit made
✅ Ready for tomorrow's problem!

---

## 🤔 Common Mistakes to Avoid

❌ **Don't** commit without testing
❌ **Don't** forget to update PROGRESS.md
❌ **Don't** skip documentation/comments
❌ **Don't** put all problems in root folder
❌ **Don't** skip edge case testing

---

## ✨ Ready to Code?

Your repository structure is set up! Now:

1. Pick a problem (**Easy level recommended**)
2. Follow this checklist
3. Make your first commit
4. Keep the streak going! 🔥

**Good luck and happy coding!** 💻

---

For more help, check:
- [README.md](README.md) - Full repository guide
- [QUICK_START.md](QUICK_START.md) - Quick reference
- [Resources/SOLUTION_TEMPLATE.java](Resources/SOLUTION_TEMPLATE.java) - Code template
