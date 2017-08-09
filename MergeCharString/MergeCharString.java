package MergeCharString;

import java.util.Scanner;

public class MergeCharString {

	public static String merge(String a, String b){
		String mergeStrings=new String();
		int lengthA = a.length();
		int lengthB = b.length();
		for(int i=0;i<lengthA || i<lengthB  ;i++){
			if((i+1)>lengthA) return mergeStrings+=b.substring(i,lengthB);
			if((i+1)>lengthB) return mergeStrings+=a.substring(i,lengthA);
			mergeStrings+=a.substring(i,i+1);
			mergeStrings+=b.substring(i,i+1);


		}return mergeStrings;}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		System.out.println(merge(sc.nextLine(),sc.nextLine()));

	}
}