package Booking;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountPolygons {

	public static class Polygons{
		int a,b,c,d;
		int countSquare,countRect,countOthers;
		
		public Polygons() {
			countSquare=0;
			countRect=0;
			countOthers=0;
		}

		public void addNewPolygon(int a, int b, int c, int d) {
			// TODO Auto-generated method stub
			if (a <= 0 || b <= 0 || c <= 0 | d <= 0) {
			      this.countOthers++;
			      return;
			    }

			    if (a == c && b == d) {
			      if (a == b) {
			        this.countSquare++;
			      } else {
			        this.countRect++;
			      }
			    } else {
			      this.countOthers++;
			    }
		}

		public int getCountSquare() {
			return countSquare;
		}

		public int getCountRect() {
			return countRect;
		}

		public int getCountOthers() {
			return countOthers;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		Scanner in = new Scanner(System.in);
		Polygons p = new Polygons();;
	    
	    while (in.hasNextInt()) {
	      int a = in.nextInt();
	      int b = in.nextInt();
	      int c = in.nextInt();
	      int d = in.nextInt();

	      p.addNewPolygon(a,b,c,d);
	    }
	    System.out.println(p.getCountSquare() + " " +
	                       p.getCountRect() + " " +
	                       p.getCountOthers());
	}
}	