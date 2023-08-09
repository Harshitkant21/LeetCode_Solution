class Solution {
    public boolean isPalindrome(int x) {
        // Store the original number in a temporary variable
        int temp = x;
        
        // Initialize a variable to store the reversed number
        int reversed = 0;
        
        // Loop through each digit of the number
        while (temp > 0) {
            // Get the last digit of the number
            int rem = temp % 10;
            
            // Add the last digit to the reversed number after shifting digits
            reversed = reversed * 10 + rem;
            
            // Remove the last digit from the temporary variable
            temp /= 10;
        }
        
        // Compare the reversed number with the original number
        if (reversed == x) {
            return true; // If they're equal, the number is a palindrome
        } else {
            return false; // If not, the number is not a palindrome
        }
    }
}
