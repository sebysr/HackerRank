package OddEvenString;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Split a string in two with character in odd and even position
public class StringOddEven {
    public static String printString(String s){
        String s_even=new String();
        String s_odd =new String();
        for(int i=0;i<s.length();i++){
				if(i%2==0){
					s_even+=s.substring(i,i+1);
				}
                else{
                    s_odd+=s.substring(i,i+1);
                }
        }       
        return s_even+" "+s_odd;
        
    }
        
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); String[] ar=new String[n];
        for(int i=0;i<n;i++)
            ar[i]=in.next();
        for(int i=0;i<n;i++)
            System.out.println(printString(ar[i]));
    }
}