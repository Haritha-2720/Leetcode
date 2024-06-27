class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] mapp =new int[2];
        mapp[0] = mapp[1]= -1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    mapp[0] =i;
                    mapp[1] =j;
                }
            }
        }
        return mapp;
        
    }
}