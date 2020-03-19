package 字符串;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class LeetCode387 {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character word = s.charAt(i);
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
