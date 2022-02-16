package Figure_package;

public class Line extends Point implements Lengthen {
    int x2,y2;

    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Line(int x1,int y1,int x2,int y2, String color){
        super(x1, y1, color);
        this.x2 = x2;
        this.y2 = y2;
    }
    public static double getLenAtoB(int Ax,int Ay, int Bx,int By){
        return Math.sqrt(Math.pow((Ax - Bx),2) + Math.pow((Ax - Bx),2));
    }

    @Override
    public String toString() {
        return "This is a "+color+" line on: " + x1 +","+ this.y2 +" to "+ x2+","+y2+ " length ="+ getLength();
    }

    @Override
    public double getLength() {
        return getLenAtoB(x1,y1,x2,y2);
    }
}
