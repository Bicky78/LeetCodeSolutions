class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] b=new int[2];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if((nums[i]+nums[j])==target){
                        b[0]=i;
                        b[1]=j;
                        return b;
                    }
                }
            }
        }
        return b;
    }
}