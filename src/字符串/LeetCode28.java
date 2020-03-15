package 字符串;

public class LeetCode28 {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        int ne = needle.length(), ha = haystack.length();
        for (int i = 0; i < ha - ne +1; i++) {
            if (haystack.substring(i, i + ne).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
