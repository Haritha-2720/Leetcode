class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){         // samller than 9
                digits[i]++;
                return digits;
            }
            digits[i]=0;  //equal to 9
        }

        int arr[]=new int[n+1]; //greater tha 9

        arr[0]=1;

        return arr;
    }
      
}
