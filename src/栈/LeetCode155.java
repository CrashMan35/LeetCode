package 栈;

import java.util.Queue;
import java.util.Stack;

public class LeetCode155 {
    private Stack<Integer> data;
    private Stack<Integer> helper;
    public LeetCode155() {
        this.data = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        data.add(x);
        if (helper.isEmpty() || helper.peek() >= x) {
            helper.add(x);
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            int top = data.pop();
            if (top == helper.peek()) {
                helper.pop();
            }
        }
    }

    public int top() {
        if (!data.isEmpty()) {
            return data.peek();
        }
        throw new RuntimeException("empty stack");
    }

    public int getMin() {
        if (!helper.isEmpty()) {
            return helper.peek();
        }
        throw new RuntimeException("empty stack");
    }

}
