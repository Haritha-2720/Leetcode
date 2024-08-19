class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] arr = new int[nums.length];

        int postive =0;

        int negative =1;

        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[postive]=nums[i];
                postive=postive+2;
            }
            else{
                arr[negative]=nums[i];
                negative=negative+2;
            }

        }
        return arr;
        
    }
}