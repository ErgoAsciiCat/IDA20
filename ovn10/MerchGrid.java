import java.util.*;

public class MerchGrid {

    public int step;
    public int[][] grid;
    public int Y;
    public int X;
    public Random rand;

    MerchGrid(int x) {
        this.grid = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || j == 0 || i == x - 1 || j == x - 1) {
                    grid[i][j] = -1;
                }
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        this.rand = new Random();
        this.step = 1;
    }

    public void chooseFree(int dir) {
        switch (dir) {
            case 0 -> {
                if (grid[X][Y - 1] == 0) {
                    grid[X][Y - 1] = step++;
                    Y -= 1;
                } else chooseFree(dir = rand.nextInt(4));
            }
            case 1 -> {
                if (grid[X - 1][Y] == 0) {
                    grid[X - 1][Y] = step++;
                    X -= 1;
                } else chooseFree(dir = rand.nextInt(4));
            }
            case 2 -> {
                if (grid[X][Y + 1] == 0) {
                    grid[X][Y + 1] = step++;
                    Y += 1;
                } else chooseFree(dir = rand.nextInt(4));
            }
            case 3 -> {
                if (grid[X + 1][Y] == 0) {
                    grid[X + 1][Y] = step++;
                    X += 1;
                } else chooseFree(dir = rand.nextInt(4));
            }
        }
    }

    public boolean freeSpace(int x, int y) {
        if (grid[X][Y - 1] == 0) return true;
        if (grid[X - 1][Y] == 0) return true;
        if (grid[X][Y + 1] == 0) return true;
        if (grid[X + 1][Y] == 0) return true;
        return false;
    }

    public void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (i == 0 || j == 0 || i == grid.length - 1 || j == grid.length - 1) {
                    grid[i][j] = -1;
                }
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
//grid[x][y + 1] == 0 || grid[x + 1][y] == 0 || grid[x][y - 1] == 0 || grid[x - 1][y] == 0;
    }
}
