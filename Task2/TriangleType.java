/*
Write a program which gets 3 point coordinates in 2D coordinate system
in the input and prints a triangle type as a result. (Right, acute or obtuse)
*/

import java.util.*;

public class TirangleType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
        Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
        Point p3 = new Point(sc.nextDouble(),sc.nextDouble());

         /* haha for oop fintuflyushkas can be done with this
        p1.setX(sc.nextDouble()); p1.setY(sc.nextDouble());
        p2.setX(sc.nextDouble()); p2.setY(sc.nextDouble());
        p3.setX(sc.nextDouble()); p3.setY(sc.nextDouble());
         */


        //distanceFrom1to2
        double a = Math.sqrt((p2.getX() - p1.getX())*(p2.getX() - p1.getX()) +
                (p2.getY() - p1.getY())*(p2.getY() - p1.getY()));

        //distanceFrom1to3
        double b = Math.sqrt((p3.getX() - p1.getX())*(p3.getX() - p1.getX()) +
                (p3.getY() - p1.getY())*(p3.getY() - p1.getY()));

        //distanceFrom3to2
        double c = Math.sqrt((p2.getX() - p3.getX())*(p2.getX() - p3.getX()) +
                (p2.getY() - p3.getY())*(p2.getY() - p3.getY()));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        if(a + b > c && a + c > b && c + b > a) {

            if (a * a + b * b == (c * c) || b * b + c * c == (a * a) || a * a + c * c == (b * b))
                System.out.println("The type is: Right");

            else if (a * a + b * b < c * c || b * b + c * c < a * a || a * a + c * c < b * b)

                System.out.println("The type is: Obtuse");

            else
                System.out.println("The type is: Acute");

        }else{

            System.out.println("The points do not form a triangle");
        }
    }


    }


