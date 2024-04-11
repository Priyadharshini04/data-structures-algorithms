package com.myjava.strivers.greedy;

import java.util.Arrays;
import java.util.Comparator;

// https://www.codingninjas.com/studio/problems/fractional-knapsack_975286.
public class FractionalKnapsack {

	// Hint: Value per weight.
	public static double maximumValue(Pair[] pairs, int totalWeight) {
		double maxValues = 0.0;
		Arrays.sort(pairs, new ItemComparator());

		double weightTotal = 0;
		double valueTotal = 0;
		double remainingWeight = 0.00;
		double calculatedValue = 0.00;
		for (int i = 0; i < pairs.length; i++) {
			remainingWeight = 0.00;
			weightTotal += pairs[i]._weight;
			valueTotal += pairs[i]._value;
			calculatedValue = 0.00;
			if (weightTotal > totalWeight) {
				weightTotal -= pairs[i]._weight;
				valueTotal -= pairs[i]._value;
				remainingWeight = totalWeight - weightTotal;
				calculatedValue = remainingWeight * pairs[i]._value / pairs[i]._weight;
			}
			if ((weightTotal + remainingWeight) == totalWeight) {
				if (maxValues < valueTotal + calculatedValue) {
					maxValues = valueTotal + calculatedValue;
				}

			}
		}
		if (maxValues == 0.00 && (valueTotal + calculatedValue) > maxValues) {
			maxValues = valueTotal + calculatedValue;
		}
		return maxValues;
	}

	public static double fractionalKnapsack(Pair[] arr, int W) {
		int n = arr.length;
		Arrays.sort(arr, (a, b) -> {
			double aValPerKg = (double) a._value / a._weight;
			double bValPerKg = (double) b._value / b._weight;
			if (aValPerKg > bValPerKg) {
				return -1;
			} else if (aValPerKg < bValPerKg) {
				return 1;
			}
			return 0;
		});
		double total = 0;
		for (int i = 0; i < n; i++) {
			if (W >= arr[i]._weight) {
				total = (total + arr[i]._value);
				W -= arr[i]._weight;
			} else {
				double val = (((double) (W * arr[i]._value)) / (double) arr[i]._weight);
				total += val;
				break;
			}
		}
		return total;
	}
}

class ItemComparator implements Comparator<Pair> {

	@Override
	public int compare(Pair o1, Pair o2) {
		double firstItemVal = (double) o1._value / o1._weight;
		double secondItemVal = (double) o2._value / o2._weight;
		if (firstItemVal < secondItemVal) {
			return 1;
		}
		if (firstItemVal > secondItemVal) {
			return -1;
		}
		return 0;
	}

}

class Pair {
	int _weight;
	int _value;
	boolean _picked = false;

	public Pair(int weight, int value) {
		_weight = weight;
		_value = value;
		_picked = false;
	}

}