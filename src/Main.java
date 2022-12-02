import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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