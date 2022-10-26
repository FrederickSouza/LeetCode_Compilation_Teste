class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
		int maxTemp = 0;
		
		for(int i = 0; i < nums.length ; i++) {
			//System.out.println("nums:" + nums[i] + " max:" + max + " maxTemp:" + maxTemp);
			
			maxTemp = ((nums[i] == 1) ? maxTemp+1 : 0 );
			max = (maxTemp > max ? maxTemp : max);
		}
		
		return max;
    }
}