/**
 * Created by alejandropuente on 3/30/16.
 */

//import org.junit.Test; //Will allow to write test cases

import java.util.Scanner;
import java.util.*;

public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    public static Rectangle createRectangle(double h, double w){
        return new Rectangle(h ,w);
    }
    public static Rectangle createSquare(double side){
        return new Rectangle (side, side);
    }
    //public void set_values(double, double)

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return (2 * height) + (2 * width);
    }


    public static void main(String[] args) {

        double x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter height");
        x = s.nextDouble();
        System.out.println("please enter width");
        y = s.nextDouble();
        Rectangle Rect = new Rectangle(x, y);


        System.out.println("Area: " + Rect.area());
        System.out.println("Perimeter: " + Rect.perimeter());

    }
}