package 字符串;

public class LeetCode344 {
    public void reverseString(String s) {
        char[] words = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char tmp = words[left];
            words[left++] = words[right];
            words[right--] = tmp;
        }
    }
}
