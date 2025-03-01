class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        //add num1 in new set 
        Set<Integer> newSet = new HashSet<>();
         Set<Integer> insertion = new HashSet<>();
        for(int num :nums1){
            newSet.add(num);

        }

        //check the newSet and compare the value in the set with nums2

        for(int num:nums2){
            if(newSet.contains(num)){
                insertion.add(num);
            }
        }

        // convert Set into array 

        int result[] = new int[insertion.size()];
        int index=0;

        for(int num:insertion){
           result[index++]=num;
        }

        return result;
        
    }
}