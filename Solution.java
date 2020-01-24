import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Point p1 = new Point();
        Point p2 = new Point();
        Scanner sc = new Scanner(System.in);
        p1.x = sc.nextInt();
        p1.y = sc.nextInt();
        p2.x = sc.nextInt();
        p2.y = sc.nextInt();
        double res = findDistance(p1,p2);
        System.out.format("%.3f",res);
    }
    
    public static double findDistance(Point p1, Point p2)
    {
        double temp = Math.sqrt(((p2.x-p1.x)*(p2.x-p1.x))+((p2.y-p1.y)*(p2.y-p1.y)));
		return temp;
    }
}

class Point
{
    int x;
    int y;
}