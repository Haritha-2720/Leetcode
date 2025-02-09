class Solution {
    public int divide(int dividend, int divisor) {

        int store;

         if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        store = dividend/divisor;
        return store;
        
    }

    
    
}