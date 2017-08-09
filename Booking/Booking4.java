package Booking;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Booking4 {
    static class Call{
		int start, end;
		public Call(int start,int end){
			this.start=start;
			this.end=end;
		}
		public int getStart() {
			return start;
		}
		public int getEnd() {
			return end;
		}
		
	}

	static String[] calls;
   public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    
    int x_customer = in.nextInt();
	int n_datapoint = in.nextInt();in.nextLine();
	Call[] arr_calls=new Call[n_datapoint];
	String[] ar=new String[n_datapoint];
	for(int i=0;i<n_datapoint;i++){
		String call=in.nextLine();
		
		calls= call.split("\\s+");
		
		
		//System.out.println(calls[0]+" "+calls[1]);
		int pos1=Integer.parseInt(calls[0]);
		int pos2=Integer.parseInt(calls[1]);
		arr_calls[i]=new Call(pos1,pos2);
	}
	
	int sovr=0;
	for(int j=0;j<n_datapoint;j++){
	for(int i=0;i<n_datapoint;i++){
		if(i!=j){
			//System.err.println("i"+i+"j"+j);
		if(arr_calls[i].getEnd()>=arr_calls[j].getStart() &&
		   arr_calls[i].getEnd()<arr_calls[j].getEnd() 
				){
			/*System.out.println("i:"+i+"|j"+j+":"+arr_calls[i].getEnd()+">="+arr_calls[j].getStart()+
					"&&"+arr_calls[i].getEnd()+"<"+arr_calls[j].getEnd());*/
			sovr++;}
		}}
	
	}
	System.out.println( ((sovr-x_customer)==0 ? 0: sovr-x_customer));
}
}	
