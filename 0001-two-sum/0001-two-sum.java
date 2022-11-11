class Solution {
    public int[] twoSum(int[] nums, int target) {
    	for (int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target)
					return new int[] {i,j};
			}
		}
		//txt
        System.out.println("nenhum encontrado");
        //se isso for pro github, conferir bug ao clicar em Solution, sem Submit
		return new int[] {0, 0};
	}
}