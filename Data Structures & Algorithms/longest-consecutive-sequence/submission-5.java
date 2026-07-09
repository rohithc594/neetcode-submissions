class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int currlen = 1;
        int maxlen = 1;
        if(n==0)return 0;
        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1])continue;

            if(nums[i] == nums[i-1]+1) currlen++;
            else{
                maxlen = Math.max(maxlen , currlen);
                currlen =1;
            }
        }
        return Math.max(maxlen , currlen);
    }
}
