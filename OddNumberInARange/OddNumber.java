package test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddNumber {
	/*
	 * Giving 2 int number to make a range of numbers. 
	 * l is the minor value and r the max. 
	 * n € [l,r]
	 * Find all odd number inside this range.
	 */

	    static int[] oddNumbers(int l, int r) {
	    	int dim=(int) (Math.round((r-l)/2.0)+(l%2)*(r%2)); //understand if r or l are odd
	    	int[] res=new int[dim];int j=0;
	    	for(int i=l;i<=r;i++){
	    		if(i%2!=0){
	    			res[j]=i;
	    			j++;
	    		}
	    	}
	    	return res;
	    }
	    
	    public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        //final String fileName = System.getenv("OUTPUT_PATH");
	        //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int[] res;
	        int _l;int _r;
	        _l = Integer.parseInt(in.nextLine().trim());
	        
	        _r = Integer.parseInt(in.nextLine().trim());
	        
	        res = oddNumbers(_l, _r);
	        for(int res_i=0; res_i < res.length; res_i++) {
	        //    bw.write(String.valueOf(res[res_i]));
	        	System.out.println(res[res_i]);
	        //    bw.newLine();
	        }
	        
	        //bw.close();
	    }
}

