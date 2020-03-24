package 剑指offer;

import java.util.Stack;

public class offer09 {
    Stack<Integer> s1 ;
    Stack<Integer> s2 ;
    int size;
    public offer09() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        size = 0;
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            return -1;
        }
        return s2.pop();
    }
}
