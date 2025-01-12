class Solution {
    public boolean isPalindrome(int x) {

        int store =0;

        int temp =x;

        if(x<0){
            return false;
        }

        while(x!=0){
            int split = x%10;

            store =(store*10)+split;

            x=x/10;
        }
        return store == temp;
        
    }
}