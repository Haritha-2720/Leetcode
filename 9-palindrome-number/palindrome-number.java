class Solution {
    public boolean isPalindrome(int x) {
     if(x<0 || x!=0 && x%10 ==0 ) return false;
    int saveNum=0;
    while(x>saveNum){
        saveNum = saveNum*10 + x%10;
        x/=10;
    }
    return (x==saveNum || x==saveNum/10);
}
}