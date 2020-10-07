package moodle;


public class SudokuGrid {
	private int[][] sg;

	/** Constructd an empty sudoku. */
	public SudokuGrid() {

		this.sg = new int[9][9];
	}

	/**
	 * Sets the value value in the box (row, col). All arguments are assumed to have
	 * a value between 1 and 9.
	 */
	public void put(int row, int col, int value) {
		sg[row - 1][col - 1] = value;
		System.out.println(sg[row - 1][col - 1]);

	}

	/**
	 * Clears the the box (row,col). All arguments are assumed to have a value
	 * between 1 and 9.
	 */
	public void clear(int row, int col) {
		sg[row - 1][col - 1] = 0;
	}

	/**
	 * Returns the value in the box (row,col), zero if the box is empty. All
	 * arguments are assumed to have a value between 1 and 9.
	 */
	public int get(int row, int col) {
		return sg[row - 1][col - 1];
	}

	/**
	 * Determines if the box (row, col) is empty.. All arguments are assumed to have
	 * a value between 1 and 9.
	 */
	public boolean empty(int row, int col) {
		if (sg[row - 1][col - 1] == 0) {
			return true;
		}
		return false;
	}

	public boolean allSet() {
		for (int r = 0; r < sg.length; r++) {
			for (int c = 0; c < sg[r].length; c++) {
				if (sg[r][c] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkRow(int row) {
		boolean[] chk = new boolean[9];
		for (int col : sg[row]) {

			for (int x = 1; x <= 9; x++) {

				if (sg[row - 1][col] == x) {

					System.out.println(x);
					if (chk[x - 1] == true) {
						return false;
					} else if (sg[row - 1][col] == 0) {
						continue;
					} else {
						chk[x - 1] = true;
					}
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		SudokuGrid sg = new SudokuGrid();
		int[] nbrs = { 2, 5, 7, 1, 9, 8, 3, 5, 6 };
		for (int k = 1; k <= 9; k++) {
			sg.put(5, k, nbrs[k - 1]);
		}
		System.out.println(sg.checkRow(5));

	}

}
