package 剑指offer;

public class offer10_2 {
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        int a=1,b=2;

        for (int i = 2; i <= n; i++) {
            int result = (a + b)%1000000007;
            a=b;
            b = result;
        }
        return a;
    }
}
