class Solution {
    public int divide(int D, int d) {
       
        if (D == Integer.MIN_VALUE && d == -1) {
            return Integer.MAX_VALUE;
        }

        
        if (D == d) {
            return 1;
        }

        
        boolean isNegative = (d > 0) ^ (D > 0);

        
        long dividend = Math.abs((long) D);
        long divisor = Math.abs((long) d);

        long quotient = 0;
        while (dividend >= divisor) {
            long tempDivisor = divisor;
            long multiple = 1;

            
            while (dividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            
            dividend -= tempDivisor;
            quotient += multiple;
        }

        
        return isNegative ? (int) -quotient : (int) quotient;
    }
}
