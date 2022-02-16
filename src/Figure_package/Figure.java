package Figure_package;

import org.jetbrains.annotations.NotNull;

public abstract class Figure {
    int x1, y1;

    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public int getY1() {
        return y1;
    }
    public void setY1(int y) {
        this.y1 = y;
    }
    public String getColor() {
        return color;
    }
    public void setColor(@NotNull String color) {
        if(color.length()!=0)
            this.color = color;
        else
            this.color="Black";
    }

    String color;
    public abstract String toString();
}
