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
        sqr1 = new Square(" ");
        sqr2 = sqr1;
        sqr3 = sqr1;
        sqr4 = sqr1;
        sqr5 = sqr1;
        sqr6 = sqr1;
        sqr7 = sqr1;
        sqr8 = sqr1;
        sqr9 = sqr1;
    }

    public String getSquare(int position) {
        if (position == 1) {
            return sqr1.getSquareFill();
        } else if (position == 2) {
            return sqr2.getSquareFill();
        } else if (position == 3) {
            return sqr3.getSquareFill();
        } else if (position == 4) {
            return sqr4.getSquareFill();
        } else if (position == 5) {
            return sqr5.getSquareFill();
        } else if (position == 6) {
            return sqr6.getSquareFill();
        } else if (position == 7) {
            return sqr7.getSquareFill();
        } else if (position == 8) {
            return sqr8.getSquareFill();
        } else {
            return sqr9.getSquareFill();
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
        for (int r = 1; r <= 5; r++) {
            if (r % 2 == 1) {
                System.out.println(" " + getSquare((int)(1.5*r - 2)) + " | " + getSquare((int)(1.5*r - 1)) + " | " + getSquare((int)(1.5*r)) + " ");
            } else {
                System.out.println("---|---|---");
            }
        }
    }

    public boolean winsByRow(String val) {
        for (int r = 1; r <= 3; r++) {
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
                if (getSquare(5).equals(val)) {
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

    public boolean wins(String val) {
        if (winsByRow(val) || winsByColumn(val) || winsByDiagonal(val)) {
            return true;
        }
        return false;
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
