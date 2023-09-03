// I utilise bit manipulation using XOR in this code. 

class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;  // Initialize a variable to store the result.

        // Iterate through the entire array.
        for (int i = 0; i < nums.length; i++) {
            // Use bitwise XOR (^) to cancel out duplicates.
            // When XORing a number with itself, it becomes 0.
            // The result will be the single number.
            x ^= nums[i];
        }

        // Return the single number found in the array.
        return x;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
