class Solution {
    public boolean isPalindrome(int x) {

         if(x<0){
            return false;
        }

        int store =0;

        int temp=x;

        while(x!=0){
            int c = x%10;
            store =(store*10)+c;
            x=x/10;

        }
        return store==temp;
        
    }
}