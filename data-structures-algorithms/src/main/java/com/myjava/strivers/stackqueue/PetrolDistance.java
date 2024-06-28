package com.myjava.strivers.stackqueue;

public class PetrolDistance {
	int tour(int petrol[], int distance[]) {
		int totalSurplus = 0;
		int currentSurplus = 0;
		int result = 0;
		for (int i = 0; i < petrol.length; i++) {
			int surplus=petrol[i]-distance[i];
			totalSurplus+=surplus;
			currentSurplus+=surplus;
			if(currentSurplus<0)
			{
				currentSurplus=0;
				result=i+1;
			}
		}
		if(totalSurplus<0) return -1;
		return result;
	}
	// O(n^2) timecomplexity.
	int tours(int petrol[], int distance[]) {
		int n = petrol.length;
		for (int i = 0; i < petrol.length; i++) {
			int totalPetrol = 0;
			int totalDistance = 0;
			boolean isPossible = true;
			for (int j = i; j < petrol.length + i; j++) {
				totalPetrol += petrol[j % n];
				totalDistance += distance[j % n];
				if (totalPetrol < totalDistance) {
					isPossible = false;
					break;
				}
			}
			if (isPossible) {
				return i;
			}
		}
		return -1;
	}
}
