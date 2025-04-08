// Leetcode -- 20
// Question -- Valid parentheses
// Identifying the string conatins valid paratheses or not.

// Methods
// Here i am using the stack data structure.
// stack.peek() -- it will return the topmost element in the stack
// stack.push() -- it will push the element to the stack
// stack.pop() -- it will pop the element in the stack
// stack.empty() -- ientify the stack is empty or not.

// Time complexity - O(n^2)

// Code
import java.util.Stack;

class Valid_parentheses {
    public static void main(String[] args) {
        String str = "({[]{})";
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                st.push(str.charAt(i));
            } else {
                if (st.empty()) {
                    System.out.println(false);
                    return;
                }
                if (st.peek() == '(' && str.charAt(i) == ')' || st.peek() == '[' && str.charAt(i) == ']' ||
                        st.peek() == '{' && str.charAt(i) == '}') {
                    st.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            }

        }
        if (!st.empty()) {
            System.out.println(false);
        }
        System.out.println(true);
        return;
    }
}
