package com.myjava.strivers.dp;

public class EnergyFrog_GFG {

	public static int getMinEnery(int[] energies) {
		//return getMinJumpEnergy(energies, energies.length-1, 0);
//		if(energies.length<=1) return 0;
//		if(energies.length==2) return Math.abs(energies[1]-energies[0]);
//		if(energies.length==3) return Math.min(Math.abs(energies[2]-energies[0]), Math.abs(energies[1]-energies[0])+Math.abs(energies[1]-energies[2]));
//		return getMinJumpEnergy(energies,energies.length-1,new int[energies.length]);
		if(energies.length<=1) return 0;
		int[] dp=new int[energies.length];
		dp[0]=Integer.MAX_VALUE;
		dp[1]=Math.abs(energies[1]-energies[0]);
		if(energies.length==2) return dp[1];
		dp[2]=Math.min(Math.abs(energies[2]-energies[0]), Math.abs(energies[1]-energies[0])+Math.abs(energies[1]-energies[2]));
		for(int i=3;i<energies.length;i++)
		{
			int left=dp[i-1]+Math.abs(energies[i]-energies[i-1]);
			int right=dp[i-2]+Math.abs(energies[i]-energies[i-2]);
			dp[i]=Math.min(left, right);
		}
		return dp[energies.length-1];
	}

	private static int getMinJumpEnergy(int[] energies, int i,int dp[]) {
		if(i==0) return Integer.MAX_VALUE;
		if(i==1) {
			dp[1]=Math.abs(energies[1]-energies[0]);
			return dp[1];
		}
		if(i==2)
		{
			dp[2]=Math.min(Math.abs(energies[2]-energies[0]), Math.abs(energies[1]-energies[0])+Math.abs(energies[1]-energies[2]));
			return dp[2];
		}
		if(dp[i]!=0) return dp[i];
		int left=getMinJumpEnergy(energies, i-1,dp)+Math.abs(energies[i]-energies[i-1]);
		int right=getMinJumpEnergy(energies, i-2,dp)+Math.abs(energies[i]-energies[i-2]);
		dp[i]=Math.min(left, right);
		return dp[i];
	}
	
	private static int getMinJumpEnergy(int[] energies, int i,int total) {
		if(i==0) return total;
		if(i==1) {
			return total+Math.abs(energies[1]-energies[0]);
		}
		int left=getMinJumpEnergy(energies, i-1,total+Math.abs(energies[i]-energies[i-1]));
		int right=getMinJumpEnergy(energies, i-2,total+Math.abs(energies[i]-energies[i-2]));
		return Math.min(left, right);
	}

}
