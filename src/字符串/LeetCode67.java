package 字符串;

public class LeetCode67 {
    public String addBinary1(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
    public static String addBinary2(String a, String b) {
        int n = a.length(), m = b.length();
        if (n < m) {
            return addBinary2(b, a);
        }
        int maxLength = Math.max(n, m);

        StringBuilder result = new StringBuilder();
        int carry = 0, j = m - 1;
        for (int i=n-1;i>-1;i--) {
            if (a.charAt(i) == '1') {
                carry++;
            }
            if (j > -1 && b.charAt(j--) == '1') {
                carry++;
            }
            if (carry % 2 == 1) {
                result.append('1');
            } else {
                result.append('0');
            }
            carry/=2;
        }
        if (carry == 1) {
            result.append('1');
        }
        result.reverse();
        return result.toString();

    }

    public static void main(String[] args) {
        String a = "1111";
        String b = "10";
        String addResult = addBinary2(a, b);
        System.out.println(addResult);
    }
}
