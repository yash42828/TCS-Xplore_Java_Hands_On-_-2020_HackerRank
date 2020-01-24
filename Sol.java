import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BigInteger a[] = new BigInteger[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i] = sc.nextBigInteger();
        }
        //BigInteger fact = new BigInteger("1");
        for(int i=0;i<5;i++){
           int temp = a[i].intValue();
           //int fact=1;
           Integer fact1 = Integer.valueOf(1);
           BigInteger fact = BigInteger.valueOf(fact1.intValue());
           for(int j=1;j<=temp;j++){
               fact = fact.multiply(BigInteger.valueOf(j));
           }
           a[i] = fact;
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
    
   
}
