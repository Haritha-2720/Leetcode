class Solution {
    public int[] twoSum(int[] nums, int target) {

        int max[]=new int[2];

        max[0]=-1;
        max[1]=-1;

        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==target){
                    max[0]=i;
                    max[1]=j;
                }

            }

        }
        return max;
        
    }
}