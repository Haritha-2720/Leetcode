class Solution {
    public int reverse(int x) {
        long store = 0;
        while (x != 0) {
            store = store * 10 + x % 10;
            x = x / 10;
            if (store > Integer.MAX_VALUE || store < Integer.MIN_VALUE) {
                return 0;
            }

        }
        return (int) store;

    }

}