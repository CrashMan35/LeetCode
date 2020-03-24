package 剑指offer;

public class offer05 {
    public String replaceSpace(String s) {
        int blank = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                blank++;
            }
        }
        StringBuffer newStr = new StringBuffer(s.length() + 2 * blank);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                newStr.append("%20");
            } else {
                newStr.append(s.charAt(i));
            }
        }
        return newStr.toString();
    }
}
