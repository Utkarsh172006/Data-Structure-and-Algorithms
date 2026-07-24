class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int highest = nums.length -1;
        int lowest = 0;
        while(lowest<=highest)
        {
            int mid= lowest+(highest-lowest)/2;
            if(nums[mid]==target)
            return mid;
            if(nums[mid]<=target)
            lowest = mid+1;
            if(nums[mid]>=target)
            highest = mid-1;
        }
        return lowest;  
    }
}