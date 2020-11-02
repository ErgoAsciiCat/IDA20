public class LifeBoard {
    int rows, cols, gen;
    boolean[][] grid;

    /**
     * Skapar en spelplan med rows rader och cols kolonner. Spelplanen är från
     * början tom, dvs alla rutorna är tomma och generationsnumret är 1.
     */
    public LifeBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        gen = 1;
        grid = new boolean[rows][cols];

    }

    /**
     * Ger true om det finns en individ i rutan med index row, col, false annars.
     * Om index row, col är utanför spelplanen returneras false
     */
    public boolean get(int row, int col) {
        if (row >= rows || row < 0 || col >= cols || col < 0) return false;
        return grid[row][col];
    }

    /**
     * Lagrar värdet val i rutan med index row, col
     */
    public void put(int row, int col, boolean val) {
        grid[row][col] = val;
    }

    /**
     * Tar reda på antalet rader
     */
    public int getRows() {
        return rows;
    }

    /**
     * Tar reda på antalet kolonner
     */
    public int getCols() {
        return cols;
    }


    /**
     * Tar reda på aktuellt generationsnummer
     */
    public int getGeneration() {
        return gen;
    }

    /**
     * Ökar generationsnumret med ett
     */
    public void increaseGeneration() {
        gen++;
    }
}