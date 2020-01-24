import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class factorial {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
           int temp = a[i];
           int fact=1;
           for(int j=1;j<=temp;j++){
               fact = fact*j;
           }
           a[i] = fact;
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
    
   
}
