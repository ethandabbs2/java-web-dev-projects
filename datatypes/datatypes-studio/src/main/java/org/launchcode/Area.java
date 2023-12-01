package org.launchcode;
import java.util.Scanner;

public class Area {

    static class AreaOfCircle
    {
        public static void main(String[] args)
        {

            Scanner s= new Scanner(System.in);

            System.out.println("Enter the radius:");
            double r= s.nextDouble();
            Double area = Circle.getArea(r);
            //double  area=(r*r) * Math.PI;

            System.out.println("Area of Circle is: " + area);
        }
    }
}
