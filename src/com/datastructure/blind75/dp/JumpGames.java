package com.datastructure.blind75.dp;

public class JumpGames {

	
	//Theory -https://www.youtube.com/watch?v=Yan0cv2cLy8
	//code-https://github.com/neetcode-gh/leetcode/blob/main/java/0055-jump-game.java
	public static void main(String[] args) {
		
		int nums[]={2,3,1,14};
		System.out.println(canJump(nums));

	}
	//	time 0(n) space -0(1)
	private static boolean canJump(int[] nums) {
		int goal=nums.length-1;
		for(int i=nums.length-2;i>=0;i--){
			
			if(nums[i]+i>=goal)
				goal=i;
		}
		return goal==0;
	}

}
