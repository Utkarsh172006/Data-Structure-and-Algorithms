class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if(nums.length == 0) return 0;

        for(int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        
        int cnt = 0;
        int longest = 1;
        for(int first : set){                       //traversing the hashset
            if(!set.contains(first - 1)){
                int count = 1;
                int x = first;


                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
            
        }
        return longest;
    }
}