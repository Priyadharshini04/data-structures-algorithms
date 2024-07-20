
public class BarellesTarget {
	public static int plates[] = new int[] { 55, 45, 35, 25, 15, 10 };
	public static int barbell = 45;

	public static void main(String[] args) {
		System.out.println(loadBarbell(125));
	}

	public static int loadBarbell(int target) {
		int newTarget = target - barbell; // 135- 45=90
		if (newTarget < 0)
			return -1;
		else if (newTarget == 0)
			return 0;

		for (int i = 0; i < plates.length; i++) {
			if (plates[i] * 2 > newTarget)
				continue;
			int platesCount = 0;
			int currTarget = newTarget; // 90
			for (int j = i; j < plates.length; j++) {
				int currentCount = currTarget / plates[j]; // 2
				currentCount = currentCount % 2 != 0 ? currentCount - 1 : currentCount;
				currTarget -= (currentCount * plates[j]);
				platesCount += currentCount;
				if (currTarget == 0)
					return platesCount;
			}

		}
		return -1; // return type "int".
	}
}
