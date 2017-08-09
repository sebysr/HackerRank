package MiniMaxSum;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {
    
    public static void main(String[] args) {
        long min=Long.MAX_VALUE,max=0,somma=0;
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        for(int arr_i=0; arr_i < 5; arr_i++){
            somma+=arr[arr_i];
            if(min>=arr[arr_i]) min=arr[arr_i];
            if(max<=arr[arr_i]) max=arr[arr_i];
        }
        
        System.out.print(somma-max); //min value possible
        System.out.print(" "+(somma-min)); //max value possible
    }
}
