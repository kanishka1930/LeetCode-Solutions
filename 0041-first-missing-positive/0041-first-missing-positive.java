class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        //step1-place numbers at their correct index

        for(int i =0; i < n; i++){
            
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){

                int correctIndex = nums[i] - 1;

                int temp =  nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        //step2- find the first missing positive 
        for(int i = 0; i < n;i++){
             if(nums[i] != i + 1){
                return i + 1;

             }
        }
       // step3- all numbers are in current positions

        return n + 1;
        
    }
}