class Solution {
    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        //step-1:find the pivot

        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        //step-2:find a number greaternthan pivot and swap

        if(i >= 0 ){
            int j = nums.length - 1;

            while(nums[j] <= nums[i]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //step-3: reverse the portion after pivot

        int left = i + 1;
        int right = nums.length - 1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        
            left++;
            right--;
        }
        
    }
}