import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Distance {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Scanner sc = new Scanner(System.in);
        p1.x = sc.nextInt();
        p1.y = sc.nextInt();
        p2.x = sc.nextInt();
        p2.y = sc.nextInt();
        p3.x = sc.nextInt();
        p3.y = sc.nextInt();
        Point temp = findDistance(p1,p2,p3);
        System.out.println(temp.x);
		System.out.println(temp.y);

    }
    public static Point findDistance(Point p1, Point p2, Point p3)
    {
        double r1 = Math.sqrt((p1.x*p1.x)+(p1.y*p1.y));
        double r2 = Math.sqrt((p2.x*p2.x)+(p2.y*p2.y));
        double r3 = Math.sqrt((p3.x*p3.x)+(p3.y*p3.y));

        if(r1>r2 && r1>r3){
            return p1;
            //System.out.format("%.1f",p1.x);
            //System.out.print("\n");
            //System.out.format("%.1f",p1.y);
        }
        else if(r2>r1 && r2>r3){
            return p2;
            //System.out.format("%.1f",p2.x);
            //System.out.print("\n");
            //System.out.format("%.1f",p2.y);        
            }
        else{
            return p3;
            //System.out.format("%.1f",p3.x);
            //System.out.print("\n");
            //System.out.format("%.1f",p3.y);         
            }
 

    }
    
    
}

class Point
{
    double x;
    double y;
}