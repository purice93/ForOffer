package top10.task07;
public class Solution {
    public int Fibonacci(int n) {
        int i;
        int a = 0, b = 1, c=0;
        if (n <= 1) {
            return n;
        } else {
            for (i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
