package com.myjava.strivers.dp;

public class ClimbingStairs_L70 {
	
	public static int climb(int totalSteps) {
		//return calClimb(new int[totalSteps+1],totalSteps);
		int[] dp=new int[totalSteps+1];
		if(totalSteps<0) return 0;
		if(totalSteps==1) return 1;
		if(totalSteps==2) return 2;
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=totalSteps;i++)
		{
			dp[i]=dp[i-2]+dp[i-1];
		}
		return dp[totalSteps];
	}
	
	public static int calClimb(int[] dp,int steps)
	{
		if(steps<0) return 0;
		if(steps==1) return 1;
		if(steps==2) return 2;
		if(dp[steps]!=0) return dp[steps];
		dp[steps-1] = calClimb(dp,steps-1);
		dp[steps-2] = calClimb(dp,steps-2);
		return dp[steps-1]+dp[steps-2];
		
	}

	public static int climbBruteForce(int totalSteps) {
		if(totalSteps==0) return 1;
		if(totalSteps==1) return 1;
		int left = climb(totalSteps-1);
		int right = climb(totalSteps-2);
		return left+right;
	}
}
