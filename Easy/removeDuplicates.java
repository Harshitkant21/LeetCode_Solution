class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; // Get the length of the input array
        
        if (n <= 0) {
            return n; // If the array is empty or has only one element, no duplicates to remove
        }
        
        int j = 0; // Initialize a pointer for the modified array
        
        // Iterate through the array to find and remove duplicates
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i]; // Store non-duplicate value at the current position
                j++; // Move the pointer for the modified array
            }
        }
        
        nums[j++] = nums[n - 1]; // Store the last element in the modified array
        
        return j; // Return the new length of the modified array (with duplicates removed)
    }
}
