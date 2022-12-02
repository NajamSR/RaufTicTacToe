/** The Square class represents a single square in the tic-tac-toe board, with a specified fill */
public class Square {
    private String fill;

    /** constructor if no parameters are entered */
    public Square() {
        fill = " ";
    }

    /** constructor if one parameter is entered */
    public Square(String fill) {
        this.fill = fill;
    }

    /** setter method */
    public void setSquareFill(String newSquare) {
        fill = newSquare;
    }

    /** toString method, also used as a getter method */
    public String toString() {
        String returnString = fill;
        return returnString;
    }
}