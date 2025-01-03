class Solution {
    public int[] getConcatenation(int[] nums) {

        int a=nums.length*2;
        int[] store = new int[a];

        for(int i=0;i<nums.length;i++){
            store[i]=nums[i];
            store[i+nums.length]=nums[i];
        }
        return store;
    }
    
}