
class Solution {
    public void nextPermutation(int[] nums) {

        int n= nums.length;
        int index=-1;

        for(int i= n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }

        }

        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }

        int j = n-1;
        while(j>index && nums[j]<=nums[index]){
            j--;
        }
        swap (nums,index,j);
        reverse(nums,index+1,n-1);
    }
    private void reverse(int nums[] ,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private void swap(int nums[],int i,int j){
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    }