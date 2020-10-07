package moodle;

public class checkVector {

	public static int min(int[] v) {
		// Fyll i egen kod
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < v.length; i++) {
			if (v[i] <= min)
				min = v[i];
		}
		return min;
	}

	public static int minIndex(int[] v) {
		int minNbr = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < minNbr) {
				minNbr = v[i];
				index = i;
			}
		}
		return index;
	}

	public static int max(int[] v) {
		int maxNbr = Integer.MIN_VALUE;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > maxNbr) {
				maxNbr = v[i];
			}
		}
		return maxNbr;
	}

	public static int maxIndex(int[] v) {
		int maxNbr = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > maxNbr) {
				maxNbr = v[i];
				index = i;
			}
		}
		return index;
	}

	public static int sum(int[] v) {
		// Fyll i egen kod
		int sum = 0;
		for (int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		return sum;
	}

	public static boolean isEqual(int[] v1, int[] v2) {
		// Fyll i egen kod
		if (v1.length != v2.length)
			return false;

		for (int i = 0; i < v1.length; i++) {
			if (v1[i] != v2[i])
				return false;
		}
		return true;
	}

	public static boolean isSorted(int[] v) {
		// Fyll i egen kod
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] > v[i + 1])
				return false;
		}
		return true;

	}

	/**
	 * Returns the index of the first occurrence of word in the array strings list,
	 * or -1 if the array does not contain word.
	 */
	public static int indexOf(String[] strings, String word) {
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equals(word))
				return i;
		}
		return -1;
	}

}