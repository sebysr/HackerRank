package Hourglass2DArrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hourglass2DArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max=Integer.MIN_VALUE,sum=0;
        //total number (n-(k-1))^d
        //d=2,n=6,k=3;
        	int conta=1;
            for(int h=0;h<(4);h++){
            	for(int k=0;k<(4);k++){
		            for(int i=0+h; i < (3+h); i++){
		                for(int j=0+k; j < (3+k); j++){
		                	System.out.print(arr[i][j]+"("+i+","+j+") ");
		                	sum+=arr[i][j];
		                }System.out.println("");
		            }
		            sum=sum-arr[h+1][k]-arr[h+1][k+2];
		            System.out.println("----------"+(conta++)+"----------;"+sum+"="+arr[h+1][k]+"+"+arr[h+1][k+2]);
	            	if(max<sum) {max=sum;}
	            	sum=0;
        } 
        }
        
        System.out.println(max);
    }
}
