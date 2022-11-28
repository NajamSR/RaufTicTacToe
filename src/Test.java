public class Test {
    public static void main(String[] args) {
        Board board2 = new Board();
        board2.setSquare(7, "x");
        board2.setSquare(3, "o");
        board2.setSquare(8, "o");
        board2.setSquare(1, "x");
        board2.setSquare(9, "o");
        board2.setSquare(5, "x");
        board2.setSquare(8, " ");
        board2.setSquare(2, "x");
        System.out.println(board2.getSquare(1));
        System.out.println(board2.getSquare(2));
        System.out.println(board2.getSquare(3));
        System.out.println(board2.getSquare(4));
        System.out.println(board2.getSquare(5));
        System.out.println(board2.getSquare(6));
        System.out.println(board2.getSquare(7));
        System.out.println(board2.getSquare(8));
        System.out.println(board2.getSquare(9));
        board2.printBoard();

    }
}
