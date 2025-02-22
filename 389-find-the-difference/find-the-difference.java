class Solution {
    public char findTheDifference(String s, String t) {

        char str=0;


        for(char str1 : s.toCharArray()){

            str^=str1;
        }

        for(char str2 : t.toCharArray()){

            str^=str2;
        }

        return str;
        
    }
}