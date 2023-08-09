class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>(); // Create a stack to store opening brackets
        
        // Iterate through each character in the given string
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i); // Current character
            
            if (isOpenBracket(cur)) { // Check if the current character is an opening bracket
                res.push(cur); // Push opening bracket onto the stack
            } else { // Current character is a closing bracket
                if (res.isEmpty()) {
                    return false; // No matching opening bracket, string is invalid
                } else if (!isMatching(res.peek(), cur)) {
                    return false; // Opening and closing brackets don't match, string is invalid
                } else {
                    res.pop(); // Matching pair found, remove opening bracket from stack
                }
            }
        }
        
        return res.isEmpty(); // If stack is empty, all brackets are validly matched
    }
    
    // Helper function to check if a character is an opening bracket
    public boolean isOpenBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }
    
    // Helper function to check if two characters form a matching pair of brackets
    public boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');
    }
}
