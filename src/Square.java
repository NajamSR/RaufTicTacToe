public class Square {
    private String fill;


    public Square() {
        fill = " ";
    }
    public Square(String fill) {
        this.fill = fill;
    }



    public void setSquareFill(String newSquare) {
        fill = newSquare;
    }

    public String toString() {
        String returnString = fill;
        return returnString;
    }

}
