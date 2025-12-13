/**
 * ========================================
 * SOLUTION TEMPLATE - Copy and Use This
 * ========================================
 * 
 * Problem: [Enter problem name/statement]
 * Difficulty: Easy / Medium / Hard
 * Platform: LeetCode / HackerRank / GeeksforGeeks / Other
 * Problem Link: [Insert link here]
 * Date Solved: YYYY-MM-DD
 * 
 * PROBLEM DESCRIPTION:
 * [Brief 1-2 line description of what the problem asks]
 * 
 * APPROACH/STRATEGY:
 * 1. First approach: [Explain approach]
 * 2. Key observations: [What makes this problem solvable]
 * 3. Algorithm steps: [Step-by-step explanation]
 * 
 * COMPLEXITY ANALYSIS:
 * Time Complexity: O(?)  // Explain why
 * Space Complexity: O(?) // Explain why
 * 
 * EXAMPLE:
 * Input: [example input]
 * Output: [example output]
 * Explanation: [how solution works on example]
 * 
 * ========================================
 */

public class SolutionTemplate {
    
    /**
     * Main solution method
     * 
     * @param input - input parameter
     * @return solution result
     */
    public static Object solveProblem(Object input) {
        // Your solution code here
        
        return null; // Replace with actual return
    }
    
    /**
     * Helper method if needed
     */
    public static void helperMethod() {
        // Helper logic
    }
    
    /**
     * Main method for testing
     */
    public static void main(String[] args) {
        // Test case 1
        // System.out.println(solveProblem(input1));
        
        // Test case 2
        // System.out.println(solveProblem(input2));
        
        // Test case 3
        // System.out.println(solveProblem(input3));
    }
}

/**
 * ========================================
 * COMMON PATTERNS TO REMEMBER
 * ========================================
 * 
 * 1. TWO POINTERS:
 *    - Use when problem mentions "two sum", sorted array, or reverse
 *    - Left pointer starts at 0, right at n-1
 *    - Move based on condition
 * 
 * 2. SLIDING WINDOW:
 *    - Fixed window: Calculate first window, then slide
 *    - Variable window: Expand right, contract left as needed
 *    - Maintain window properties using HashMap/Set
 * 
 * 3. PREFIX/SUFFIX SUM:
 *    - Pre-compute running sums for faster queries
 *    - Useful for range sum queries
 * 
 * 4. BINARY SEARCH:
 *    - Sort if not sorted
 *    - Look for leftmost/rightmost position
 *    - Be careful with mid calculation: mid = left + (right - left) / 2
 * 
 * 5. RECURSION/BACKTRACKING:
 *    - Define base case clearly
 *    - Make recursive call
 *    - Backtrack/clean up if needed
 * 
 * 6. DYNAMIC PROGRAMMING:
 *    - Define dp[i] state clearly
 *    - Find recurrence relation
 *    - Fill table bottom-up or use memoization
 * 
 * 7. GRAPH PROBLEMS:
 *    - Build adjacency list
 *    - Use BFS (queue) or DFS (stack/recursion)
 *    - Track visited nodes
 * 
 * 8. TREE PROBLEMS:
 *    - Preorder/Inorder/Postorder traversal
 *    - Level-order (BFS) for level-based problems
 *    - Recursion on left and right subtrees
 * 
 * ========================================
 */
