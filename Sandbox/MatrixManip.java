
public class MatrixManip {
	/**
	 * Adds the matrix m2 to the matrix m1 (the matrices are assumed to be have the
	 * same size)
	 */
	public static void add(int[][] m1, int[][] m2) {
		// Fyll i egen kod
		for (int r = 0; r < m1.length; r++) {
			for (int c = 0; c < m1[r].length; c++) {
				m1[r][c] += m2[r][c];
				// tilldela elementet m[r][c] ett värde
			}
		}
	}

	/** Calculates the trace of the matrix. */
	public static int trace(int[][] m) {
		// Fyll i egen kod
		int traceSum = 0;

		for (int r = 0; r < m.length; r++) {
			traceSum += m[r][r];
		}
		return traceSum;
	}

	public static int sum(int[][] m) {
		int sum = 0;
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {
				sum += m[r][c];
			}
		}
		return sum;
	}

	public static int[] sumRow(int[][] m) {
		int[] sum = new int[m.length];
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {
				sum[r] += m[r][c];
			}
		}
		return sum;
	}
}
