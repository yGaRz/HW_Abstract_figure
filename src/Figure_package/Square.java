package Figure_package;

public class Square extends Line implements Squabble, Lengthen {

    public Square(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, x2, y2, color);
    }

    @Override
    public String toString() {
        return "This is a "+color+" square on length ="+ getLength() +" and square = " + getSquare();
    }

    @Override
    public double getSquare() {
        return Math.abs(x1-x2) * Math.abs(y1-y2);
    }

    @Override
    public double getLength() {
        return Math.abs(y1-y2)*2 + Math.abs(x1-x2)*2;
    }
}
