package nowcoder;

import java.util.Stack;

/**
 * Created by YS
 * 2020/12/16 21:55
 */

public class NC52 {
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char c :s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
                continue;
            }
            if (!stack.isEmpty()){
                if (c==')'&&stack.pop()=='(' || c==']'&&stack.pop()=='[' ||c=='}'&&stack.pop()=='{' ){
                    continue;
                }
            }
            return false;
        }
        return stack.isEmpty();
    }
}
