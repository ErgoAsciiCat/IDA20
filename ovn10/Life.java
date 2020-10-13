

public class Life {
    LifeBoard grid;

    Life(LifeBoard grid) {
        this.grid = grid;
    }

    void newGeneration() {
        boolean[][] nextGen = new boolean[grid.getRows()][grid.getCols()];
        /*for (int i = 0; i < grid.getRows(); i++) {
            for (int k = 0; k < grid.getCols(); k++) {
                nextGen[i][k] = grid.get(i, k);
            }
        }
        System.out.println(Arrays.deepToString(nextGen));*/
        grid.increaseGeneration();
        for (int i = 0; i < grid.getRows(); i++) {
            for (int k = 0; k < grid.getCols(); k++) {
                if ((grid.get(i, k)) && (getNeighbours(i, k) < 2))
                    nextGen[i][k] = false;

                    // Cell dies due to over population
                else if ((grid.get(i, k)) && (getNeighbours(i, k) > 3))
                    nextGen[i][k] = false;

                    // A new cell is born
                else if ((grid.get(i, k)) && (getNeighbours(i, k) == 3) || getNeighbours(i,k) == 2)
                    nextGen[i][k] = true;

                    // Remains the same
                else
                    nextGen[i][k] = grid.get(i, k);
            }
        }
        for (int i = 0; i < grid.getRows(); i++) {
            for (int k = 0; k < grid.getCols(); k++) {
                grid.put(i, k, nextGen[i][k]);
            }
        }

    }


    void flip(int row, int col) {
        boolean val = !grid.get(row, col);
        grid.put(row, col, val);
    }

    private int getNeighbours(int row, int col) {
        int neighbours = 0;
        for (int k = -1; k <= 1; k++) {
            for (int i = -1; i <= 1; i++) {
                if (grid.get(k + row, i + col)) neighbours++;
            }
        }
        neighbours--; //subtrahera originalcellen
        return neighbours;
    }
}
