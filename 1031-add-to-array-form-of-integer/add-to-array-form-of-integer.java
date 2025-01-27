import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new LinkedList<>();
        
        // Traverse the array from the right (least significant digit)
        for (int i = num.length - 1; i >= 0; --i) {
            num[i] += k;            // Add k to the current digit
            k = num[i] / 10;        // Update the carry for the next digit
            num[i] %= 10;           // Keep only the last digit
        }

        // Add the carry to the result if any
        while (k > 0) {
            result.add(0, k % 10);  // Add the last digit of k to the front
            k /= 10;                // Remove the last digit from k
        }

        // Add the digits from the num array to the result list
        for (int i = 0; i < num.length; i++) {
            result.add(num[i]);
        }

        return result;
    }
}
