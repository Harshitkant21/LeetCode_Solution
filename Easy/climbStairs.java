//First approach is recursive approach

class Solution {
    // This function calculates the number of distinct ways to climb 'n' stairs
    public int climbStairs(int n) {
        // Base case: If there are 0 stairs, there is 0 way to climb.
        if (n == 0) {
            return 0;
        }
        // Base case: If there is 1 stair, there is only 1 way to climb (by taking one step).
        if (n == 1) {
            return 1;
        }
        // Base case: If there are 2 stairs, there are 2 ways to climb (1-1 or 2 steps at once).
        if (n == 2) {
            return 2;
        }
        // For 'n' stairs, the number of ways to climb is the sum of ways for (n-1) stairs and (n-2) stairs,
        // as you can either take one step from (n-1) stairs or two steps from (n-2) stairs.
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}

// Time Complexity: O(2^n)
// Space Complexity: O(n)


//Second approach is bottom-up approach

class Solution {
    public int climbStairs(int n) {
        // Initialize variables to store the Fibonacci numbers for n = 1 and n = 2.
        int a = 1; // Represents the number of ways to climb 1 step.
        int b = 2; // Represents the number of ways to climb 2 steps.
        int c = 0; // Temporary variable to calculate the number of ways to climb n steps.

        // Base cases: If n is 1 or 2, return n, as there's only one way to climb 1 step and two ways to climb 2 steps.
        if (n == 1 || n == 2) {
            return n;
        } else {
            // Loop through from the third step up to the nth step.
            for (int i = 2; i < n; i++) {
                // Calculate the number of ways to climb i+1 steps (stored in c) by adding the number of ways to climb i-1 steps (a) and i steps (b).
                c = a + b;
                
                // Update the values of a and b for the next iteration.
                a = b;
                b = c;
            }
        }

        // Return the number of ways to climb n steps.
        return c;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

* Another way is to use Dynamic Programming. That will be updated shortly.
