There are two methods to solve the problem in java

  1:- By using HashMap 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store number-to-index mapping
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Fill the HashMap with numbers and their indices
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        // Iterate through the array to find the complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the HashMap and is not the same index as i
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        
        // If no solution is found, return null
        return null;
    }
}


2:- By using the iterative Method
  
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Iterate through the array with two pointers to find pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the current pair's sum is equal to the target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices of the two numbers
                }
            }
        }
        
        // If no solution is found, return null
        return null;
    }
}
