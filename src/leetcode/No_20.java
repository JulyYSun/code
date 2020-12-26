package leetcode;

import java.util.Stack;

/**
 * Created by YS
 * 2020/11/28 11:04
 */

public class No_20 {
    public boolean isValid(String s) {
        if(s.length()%2==0){
            Stack<Character> stack=new Stack<>();
            for(char c:s.toCharArray()){
                if(c=='('||c=='['||c=='{')
                    stack.push(c);
                else {
                    if(!stack.isEmpty()&&c==')' && stack.peek()=='(')
                        stack.pop();
                    else if (!stack.isEmpty()&&c=='}' && stack.peek()=='{')
                        stack.pop();
                    else if (!stack.isEmpty()&&c==']' && stack.peek()=='[')
                        stack.pop();
                    else
                        return false;
                }
            }
            return stack.isEmpty();
        }
        return false;
    }
}
