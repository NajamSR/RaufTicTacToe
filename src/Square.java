public class Square {
    private String fill;

    public Square(String fill) {
        this.fill = fill;
    }

    public String getSquareFill() {
        return fill;
    }

    public void setSquareFill(String newSquare) {
        fill = newSquare;
    }

    public void printSquare() {
        System.out.print(fill);
    }
}
