class Solution {
    public int[] twoSum(int[] nums, int target) {

        int store[] =new int[2];

        store[0]=-1;
        store[1]=-1;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    store[0]=i;
                    store[1]=j;
                }
            }
            
        }
        return store;
        
    }
}