class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        int [] finalArray = null;
        boolean found = false;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(i!=j && nums[i]+nums[j]==target){
                    found = true;
                    finalArray = new int []{i,j};
                    break;
                }
            }
            if(found)
            break;
        }
        return finalArray;
        
    }
}
