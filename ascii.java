import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ascii {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		char[] ch = inp.toCharArray();
		char min = 'z';
		for(int i=0;i<ch.length;i++){
			if(ch[i]<min){
				min = ch[i];
			}
		}
		System.out.println(min);
		
    }
}