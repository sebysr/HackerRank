package Staircase;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       
        String[][] matrix = new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=n-1-j) //i==n-1 || j==n-1 ||
                    matrix[i][j]="#";
                else 
                    matrix[i][j]=" ";
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    
}
