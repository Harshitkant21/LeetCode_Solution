class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique integers.
        HashSet<Integer> mySet = new HashSet<Integer>();
        
        // Iterate through the array 'nums'.
        for (int num : nums) {
            // If the 'add' operation returns false, it means the number is already in the set,
            // indicating a duplicate. Return true in this case.
            if (!mySet.add(num)) {
                return true;
            }
        }
        
        // If no duplicates are found during the iteration, return false.
        return false;
    }
}


// Time Complexity: O(n)
//  Space Complexity: O(n)
