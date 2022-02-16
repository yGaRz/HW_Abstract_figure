package Figure_package;

public class Point extends Figure{
    public Point(int x1, int y1, String color) {
        this.x1 = x1;
        this.y1 = y1;
        this.color = color;
    }
    @Override
    public String toString() {
        return "This is a "+color+" point on: " + x1 +","+ y1;
    }
}
