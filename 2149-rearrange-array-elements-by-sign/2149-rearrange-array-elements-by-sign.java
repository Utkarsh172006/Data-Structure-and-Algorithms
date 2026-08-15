class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int [nums.length];
        int start = 0, end = 1;;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 && start < arr.length){
                arr[start] = nums[i];
                start += 2;
            }
            if(nums[i] < 0 && end < arr.length){
                arr[end] = nums[i];
                end += 2;
            }
        } 
        return arr;
    }
}