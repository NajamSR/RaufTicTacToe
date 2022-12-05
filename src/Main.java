import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* prints rules */
        System.out.println("Hello, and welcome to tic-tac-toe!\n");
        System.out.println("The game is played on a 3-by-3 board, like so...");
        Board sampleBoard = new Board();
        sampleBoard.printBoard();
        System.out.println("...with each player taking turns putting either an X or an O on the board.\n");
        System.out.println("The players will do this by typing an integer from 1 to 9. Each number corresponds to a certain square on the board.");
        System.out.println("For example, if player X inputs a 2, the board position updates to this...");
        sampleBoard.setSquare(2, "x");
        sampleBoard.printBoard();
        System.out.println("Then if player O types a 7, the board position updates to this...");
        sampleBoard.setSquare(7, "o");
        sampleBoard.printBoard();
        System.out.println("Each player alternates typing in letters until either all 9 squares on the board are filled,");
        System.out.println("or one player gets 3 in the same row, column, or diagonal. That person wins!\n");
        System.out.println("So, without further ado, let's get started!\n\n");

        /* declare variables */
        Scanner scan = new Scanner(System.in);
        Board board1 = new Board();
        boolean xTurn = true;
        board1.printBoard(); // prints the initial board, which is blank
        int input;


        /* goes through the turns for each player */
        while (board1.winner().equals("none") && board1.boardContains(" ")) {
            if (xTurn) {
                System.out.println("Player X, please enter an integer from 1 to 9 to place your X on the board.");
            } else {
                System.out.println("Player O, please enter an integer from 1 to 9 to place your O on the board.");
            }
            boolean isLegal;
            /* This loop asks the user for input, and the loop ends when the user has entered a legal move. If not, the program tells the
             * user what they did wrong and tells them to try again. */
            while (true) {
                input = scan.nextInt();
                isLegal = input > 0 && input < 10 && board1.getSquare(input).equals(" ");
                if (isLegal) {
                    break;
                }
                if (input < 1 || input > 9) {
                    System.out.println("Not an integer from 1 to 9. Try again.");
                }
                if (!board1.getSquare(input).equals(" ")) {
                    System.out.println("That square is already full. Try again.");
                }
            }
            board1.carryOutTurn(xTurn, input);
            xTurn = !xTurn; // reverses whose turn it is
        }

        /* prints winner of game */
        if (board1.winner().equals("none")) {
            System.out.println("Tie game!");
        } else {
            System.out.println("Player " + board1.winner() + " wins!");
        }
    }
}