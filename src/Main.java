import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Board board1 = new Board();
        boolean xTurn = true;
        int input = 0;
        while (!(board1.wins("x") || board1.wins("o") || !board1.boardContains(" "))) {
            board1.printBoard();
            if (xTurn) {
                System.out.println("Player X, please enter an integer from 1 to 9 to place your X on the board.");
            } else {
                System.out.println("Player O, please enter an integer from 1 to 9 to place your O on the board.");
            }
            boolean isLegal = false;
            while (!isLegal) {
                input = scan.nextInt();
                isLegal = input / 10 == 0 && board1.getSquare(input).equals(" ");
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
            if (xTurn) {
                board1.setSquare(input, "x");
            } else {
                board1.setSquare(input, "o");
            }
            xTurn = !xTurn;
        }
        if (board1.wins("x")) {
            System.out.println("Player X wins!");
        } else if (board1.wins("o")) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("Tie game!");
        }
    }
}
