class Solution {
    public double myPow(double x, int n) {

        boolean negative = n < 0;
        long power = Math.abs((long) n);

        double ans = 1;

        while (power > 0) {

            if (power % 2 == 1) {
                ans = ans * x;
            }

            power = power / 2;

            if (power > 0) {
                x = x * x;
            }
        }

        if (negative) {
            return 1.0 / ans;
        }

        return ans;
    }
}