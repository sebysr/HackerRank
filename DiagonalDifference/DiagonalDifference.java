package DiagonalDifference;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {


    static void abs_sum(int n, int[][] a){
        int sum=0,diff=0;
        for(int a_i=0; a_i < n; a_i++){
            sum+=a[a_i][a_i];
        }
        int i=0;
        for(int a_i=n-1; a_i >=0; a_i--){
            diff+=a[i][a_i];
            i++;
        }
        System.out.println(Math.abs(sum-diff));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        abs_sum(n,a);
    }
}
