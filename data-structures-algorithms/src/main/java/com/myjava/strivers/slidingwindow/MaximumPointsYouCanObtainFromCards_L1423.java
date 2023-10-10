package com.myjava.strivers.slidingwindow;

// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
public class MaximumPointsYouCanObtainFromCards_L1423 {

	public static int maxScore(int[] cardPoints, int k) {
		int maxScore = 0;
		int total=0;
		int minTotal=Integer.MAX_VALUE;
		int left=0;
		int cnt=0;
		int minSubArrayLen=cardPoints.length-k;
		for(int i=0;i<=cardPoints.length;i++)
		{
			if(cnt==minSubArrayLen && left<cardPoints.length)
			{
				if(minTotal>total)
				{
					minTotal=total;
				}
				total-=cardPoints[left++];
				cnt--;
			}
			if(i<cardPoints.length)
			{
			total+=cardPoints[i];
			maxScore+=cardPoints[i];
			cnt++;
			}
		}
		return maxScore-minTotal;
	}
	
	
	// Not works for all the cases.
	public static int maxScores(int[] cardPoints, int k) {
		int maxScore = 0;
		int left = 0;
		int right = cardPoints.length - 1;
		int leftScore = 0;
		int rightScore = 0;
		int i = 0,j=right, pick=k;
		while(pick>0) {
			leftScore+=cardPoints[i];
			rightScore+=cardPoints[j];
			i++;
			j--;
			pick--;
		}
		i=i-1;
		j=j+1;
		boolean leftMost = leftScore>=rightScore;
		if (leftMost) {
			maxScore +=leftScore;
			while (i >=0 && pick >= 0 && pick<=k && right>=0) {
				if(cardPoints[i]<cardPoints[right])
				{
					maxScore -= cardPoints[i--];
					maxScore += cardPoints[right--];
					pick++;
				}
				else {
					pick--;
				}
			}
		} else {
			maxScore +=rightScore;
			while (j < cardPoints.length && pick >= 0 && pick<=k && left<cardPoints.length) {
				if(cardPoints[j]<cardPoints[left])
				{
					maxScore -= cardPoints[j++];
					maxScore += cardPoints[left++];
					pick++;
				}
				else {
					pick--;
				}
			}
		}
		return maxScore;
	}

}
