package StringCompare;

import java.util.Scanner;
import java.util.stream.IntStream;

	public class StringCompare {
		
		 public static void main(String[] args) {
		       String[] a={"superman","def"}; //
		       String[] b={"mansuper","ghf"}; //
		       // res[3,3]
		       
		       int[] res=new int[a.length];
		       
		       for(int i=0;i<a.length;i++){
		    	   res[i]=differenze(a[i],b[i]) ;
		       }
		       
		       for(int i=0;i<a.length;i++){
		    	   System.out.println(res[i]);
		       }
		    }

		private static int differenze(String stringa1, String stringa2) {
			// TODO Auto-generated method stub
			int diff=0,ugu=0;		
			for(int i=0;i<stringa2.length();i++)
				if(stringa2.indexOf((String) stringa1.substring(i,i+1))==-1)
					diff++;
			return diff;
		}
		
}
