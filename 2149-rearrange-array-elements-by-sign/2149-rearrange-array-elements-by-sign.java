class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int [nums.length];
        int start = 0, end = 1, i = 0;
        while(i < nums.length){
            if(nums[i] > 0 && start < arr.length){
                arr[start] = nums[i];
                start += 2;
                i++;
            }
            else{
                arr[end] = nums[i];
                end += 2;
                i++;
            }
        } 
        return arr;
    }
}