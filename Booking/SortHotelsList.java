package Booking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortHotelsList {

	   public static void main(String[] args) {
		   Map<String,Integer> list=new HashMap<String,Integer>();
		   Scanner in = new Scanner(System.in);//.toLowerCase()
		    String key_words=in.nextLine();
		    String[] key_word=key_words.split("\\s+");
		    int M = in.nextInt();in.nextLine(); //which is the number of reviews
		    String[] reviews=new String[2*M];
		    int count;
		    for(int i=0;i<M;i++){
		    	count=0;
		    	///System.out.println(i);
		    	//alternates an hotel ID and a review belonging to that hotel.
			    String s1=in.nextLine(); //ID
			    String s2=in.nextLine();//review 
			   
			    for(String s:key_word){ 
			    	if(s2.contains(s))
			    		count++;
			    }
			    if(list.get(s1)!=null)
			    	list.put(s1,count+list.get(s1));
			    else
			    	list.put(s1,count);
		    }
		    //Input
		    //breakfast beach citycenter location metro view staff price
		    //Output
		    //A list of hotel IDs sorted, in descending order, by how many mentions they have of the
		    //words specified in the input.
		    
		    System.out.println("TOTAL LIST\n"+list.keySet().toString()+":"+list.values().toString());
		    
		    in.close();
	   }
}
