package 字符串;

public class LeetCode14 {
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix == "") {
                    return "";
                }
            }
        }
        return prefix;

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0||strs==null) {
            return "";
        }
        return longestCommonPrefix(strs, 0, strs.length-1);

    }

    private static String longestCommonPrefix(String[] strs, int left, int right) {
        if (left == right) {
            return strs[left];
        } else {
            int mid = (left + right) / 2;
            String lcpLeft = longestCommonPrefix(strs, left, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, right);
            return commonPrefix(lcpLeft, lcpRight);
        }

    }

    private static String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }


    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String lcp = longestCommonPrefix(strs);
        System.out.println(lcp);
    }
}
