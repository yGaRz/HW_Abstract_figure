package Figure_package;

public class Circle extends Point implements Squabble, Lengthen {
    int r;
    public int getR() {
        return r;
    }
    public void setR(int r) {
        if(r<0)
            this.r = 0;
        else
            this.r = r;
    }

    public Circle(int x1, int y1, String color, int R) {
        super(x1, y1, color);
        setR(R);
    }

    @Override
    public String toString() {
        return "This is a "+color+" circle on length ="+ getLength() +" and square = " + getSquare();
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(getR(),2);
    }

    @Override
    public double getLength() {
        return 2* Math.PI * getR();
    }
}
