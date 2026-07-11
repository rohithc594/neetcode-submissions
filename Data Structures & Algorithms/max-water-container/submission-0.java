class Solution {
    public int maxArea(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int maxArea = 0;
        while(start<end){
            int width = end - start;
            int area = width * Math.min(nums[start] , nums[end]);
            maxArea = Math.max(area , maxArea);
            if(nums[start] < nums[end]){
                start++;
            }else end--; 
            
        }
        return maxArea;
    }
}
