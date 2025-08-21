public class TicTacToe {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();
        GameHandler gameHandler = new GameHandler();

        int[][] field = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        boolean moveX = false;

        while(!gameHandler.haveWinner(field) && !gameHandler.isDraw(field)){
            outputHandler.showField(field);

            System.out.print("Ход " + ((moveX = !moveX) ? "X" : "O") + " ");

            int number = inputHandler.inputInteger();
            field[(number - 1) / 3][(number - 1) % 3] = moveX ? 'X' : 'O';
        }

        outputHandler.showField(field);
        System.out.println(gameHandler.isDraw(field) ? "Ничья!" : ("Победил " + (moveX ? "X" : "O")));
    }
}