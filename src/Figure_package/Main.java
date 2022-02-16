package Figure_package;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Figure m[] = new Figure[10];
        m[0] = new Point(3,7,"Red");
        m[1] = new Circle(6,9,"Blue",4);
        m[2] = new Line(-5,7,6,19,"Black");
        m[3] = new Square(1,2,6,-10,"Green");
        m[4] = new Circle(-7,-9,"Blue",10);
        m[5]= new Line(10,20,5,6,"Yellow");
        m[6] = new Point(7,1,"Black");
        m[7] = new Triangle(1,4,-6,7,12,10,"White");
        m[8] = new Triangle(1,4,1,10,7,3,"Green");
        m[9] = new Square(2,3,10,15,"Brown");
        for(Figure a: m){
            System.out.println(a.toString());
        }
        System.out.println("---------------------------------------------");
        Arrays.sort(m, new ComparatorBySquare());
        for(Figure a: m){
            System.out.println(a.toString());
        }
    }
}
