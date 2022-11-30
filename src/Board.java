public class Board {

    private Square sqr1;
    private Square sqr2;
    private Square sqr3;
    private Square sqr4;
    private Square sqr5;
    private Square sqr6;
    private Square sqr7;
    private Square sqr8;
    private Square sqr9;

    public Board() {
        sqr1 = new Square();
        sqr2 = new Square(" ");
        sqr3 = new Square();
        sqr4 = new Square(" ");
        sqr5 = new Square();
        sqr6 = new Square(" ");
        sqr7 = new Square();
        sqr8 = new Square(" ");
        sqr9 = new Square();
    }

    public String getSquare(int position) {
        if (position == 1) {
            return sqr1.toString();
        } else if (position == 2) {
            return sqr2.toString();
        } else if (position == 3) {
            return sqr3.toString();
        } else if (position == 4) {
            return sqr4.toString();
        } else if (position == 5) {
            return sqr5.toString();
        } else if (position == 6) {
            return sqr6.toString();
        } else if (position == 7) {
            return sqr7.toString();
        } else if (position == 8) {
            return sqr8.toString();
        } else {
            return sqr9.toString();
        }
    }

    public void setSquare(int position, String newVal) {
        if (position == 1) {
            sqr1.setSquareFill(newVal);
        } else if (position == 2) {
            sqr2.setSquareFill(newVal);
        } else if (position == 3) {
            sqr3.setSquareFill(newVal);
        } else if (position == 4) {
            sqr4.setSquareFill(newVal);
        } else if (position == 5) {
            sqr5.setSquareFill(newVal);
        } else if (position == 6) {
            sqr6.setSquareFill(newVal);
        } else if (position == 7) {
            sqr7.setSquareFill(newVal);
        } else if (position == 8) {
            sqr8.setSquareFill(newVal);
        } else {
            sqr9.setSquareFill(newVal);
        }
    }

    public void printBoard() {
        for (int r = 0; r < 15; r += 3) {
            if (r % 2 == 0) {
                for (int v = 2; v < 7; v++) {
                    if (v % 2 == 0) {
                        System.out.print(" " + getSquare(r/2 + v/2) + " ");
                    } else {
                        System.out.print("|");
                    }
                }
                System.out.println();
            } else {
                System.out.print("---|---|---\n");
            }
        }
    }

    public boolean winsByRow(String val) {
        for (int r = 1; r <= 7; r += 3) {
            if (getSquare(r).equals(val)) {
                if (getSquare(r + 1).equals(val)) {
                    if (getSquare(r + 2).equals(val)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean winsByColumn(String val) {
        for (int r = 1; r <= 3; r++) {
            if (getSquare(r).equals(val)) {
                if (getSquare(r + 3).equals(val)) {
                    if (getSquare(r + 6).equals(val)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean winsByDiagonal(String val) {
        if (getSquare(1).equals(val)) {
            if (getSquare(5).equals(val)) {
                if (getSquare(9).equals(val)) {
                    return true;
                }
            }
        }
        if (getSquare(3).equals(val)) {
            if (getSquare(5).equals(val)) {
                if (getSquare(7).equals(val)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String winner() {
        if (winsByRow("x") || winsByColumn("x") || winsByDiagonal("x")) {
            return "X";
        } else if (winsByRow("o") || winsByColumn("o") || winsByDiagonal("o")) {
            return "O";
        }
        return "none";
    }

    public boolean boardContains(String val) {
        for (int s = 1; s <= 9; s++) {
            if (getSquare(s).equals(val)) {
                return true;
            }
        }
        return false;
    }


}
