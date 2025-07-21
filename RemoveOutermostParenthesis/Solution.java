package RemoveOutermostParenthesis;

import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer ans = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }
            if(stack.size() > 1){
                ans.append(ch);
            }
            if(ch == ')' && stack.peek() == '('){
                stack.pop();
            }
        }
        return ans.toString();
    }
}
