class Solution {
    public int tribonacci(int n) {
        // Initialize variables to store tribonacci sequence values.
        int a = 0; // First tribonacci number
        int b = 1; // Second tribonacci number
        int c = 1; // Third tribonacci number
        int d = 0; // Temporary variable to calculate the next tribonacci number
        
        // Check for base cases: n = 0 and n = 1
        if (n == 0 || n == 1) {
            return n;
        }
        // Check for base case: n = 2
        else if (n == 2) {
            // Special handling for n = 2, as the tribonacci sequence starts with 0, 1, 1, ...
            // So, we return 1 for n = 2.
            return 1;
        }
        else {
            // Calculate tribonacci numbers iteratively from n = 3 to n.
            for (int i = 3; i <= n; i++) {
                d = a + b + c; // Calculate the next tribonacci number
                a = b;         // Update a to the next value in the sequence
                b = c;         // Update b to the next value in the sequence
                c = d;         // Update c to the next value in the sequence
            }
        }
        // Return the calculated tribonacci number for n.
        return d;
    }
}


##// Time Complexity: O(n)
##// Space Complexity: O(1)
