public class LifeController {
    public static void main(String[] args) {
        LifeBoard board = new LifeBoard(20, 20);
        LifeView window = new LifeView(board);
        Life life = new Life(board);
        window.drawBoard();

        while (true) {
            if (window.getCommand() == 1) {
                life.flip(window.getRow(), window.getCol());
                window.drawBoard();
                window.update();
            } else if (window.getCommand() == 2) {
                life.newGeneration();
                window.drawBoard();
                window.update();
            } else if (window.getCommand() == 3) {
                System.exit(0);
            }
        }

    }
}
