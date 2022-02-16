package Figure_package;

public class Triangle extends  Line implements Squabble, Lengthen {
    int x3,y3;

    public int getX3() {
        return x3;
    }
    public void setX3(int x3) {
        this.x3 = x3;
    }
    public int getY3() {
        return y3;
    }
    public void setY3(int y3) {
        this.y3 = y3;
    }

    public Triangle(int x1, int y1,int x2,int y2, int x3,int y3, String color) {
        super(x1, y1, x2, y2, color);
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double getLength() {
        return getLenAtoB(x1,y1,x2,y2) +getLenAtoB(x2,y2,x3,y3) + getLenAtoB(x1,y1,x3,y3);
    }

    @Override
    public double getSquare() {
        double pp = getLength();
        return Math.sqrt(pp*(pp - getLenAtoB(x1,y1,x2,y2))*(pp-getLenAtoB(x2,y2,x3,y3))*(pp-getLenAtoB(x1,y1,x3,y3)));
    }
    @Override
    public String toString(){
        return "This is a "+color+" triangle on length ="+ getLength() +" and square = " + getSquare();
    }
}
