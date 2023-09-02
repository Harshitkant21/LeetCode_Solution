// Modulo Approach:

class Solution {
    public boolean canWinNim(int n) {
        // Check if the number of stones is not divisible by 4
        // If it's not divisible, return true (can win), otherwise return false (cannot win).
        return (n % 4 != 0);
    }
}

// Bitwise XOR Approach:

class Solution {
    public boolean canWinNim(int n) {
        // Use bitwise AND (&) to check if the last two bits of the binary representation of n are not both zero.
        // If they are not both zero, return true (can win), otherwise return false (cannot win).
        return (n & 3) != 0;
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
