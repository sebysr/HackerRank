package Booking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeltaEncoding {

	   public static void main(String[] args) {
		   //Data una lista di numeri.
		   //25626 25757 24367 24267 16 100 2 7277
		   int[] numeri;
		   /*Output
		   Output a delta encoding for the sequence. In a delta encoding, the first element is
		   reproduced as-is. Each subsequent element is represented as the numeric difference
		   from the element before it. E.g. for the sequence above, the delta encoding would be:
		   25626 131 -1390 -100 -24251 84 -98 7275*/
		   //=> 25626 -128 131 -128 -1390 -100 -128 -24251 84 -98 -128 7275

		   Scanner in = new Scanner(System.in);//.toLowerCase()
		   /*while ( in.hasNextInt() ) { 
			   numero = in.nextInt(); 
		   }*/
		   String str= in.nextLine();
		   String[] numbers=str.split(" ");
   
		   int[] deltaArray=new int[numbers.length];
		   int i=0;deltaArray[0]=Integer.parseInt(numbers[0]);
		   
		   //System.err.println(numbers.length);
		   for(i=1;i<numbers.length;i++)
		   {
			   
			   deltaArray[i]=Integer.parseInt(numbers[i])-Integer.parseInt(numbers[i-1]);
			   //System.err.print(deltaArray[i]+" ");
		   }
		   
		   System.out.print(deltaArray[0]+" ");
		   for( i=1;i<numbers.length;i++){
			   if(deltaArray[i]<-128 || deltaArray[i]>128)
				   System.out.print("-128 "+deltaArray[i]+" ");
			   else System.out.print(deltaArray[i]+" ");
			   
		   }
		    
		    in.close();
	   }
}
