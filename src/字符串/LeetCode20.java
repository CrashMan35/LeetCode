package 字符串;

import java.util.HashMap;
import java.util.Stack;

public class LeetCode20 {
    private HashMap<Character, Character> mapping;

    public LeetCode20() {
        this.mapping = new HashMap<>();
        this.mapping.put(')', '(');
        this.mapping.put('}', '{');
        this.mapping.put(']', '[');
    }

    public boolean isValid(String s) {
        if((s.length()&1)==1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.mapping.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != this.mapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
