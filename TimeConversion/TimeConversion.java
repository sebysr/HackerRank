package TimeConversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s){
        // Complete this function
        String tot= new String();
        String[] ar;
        tot="";
        if(s.endsWith("AM")){
            s=s.replaceAll("AM","");
            ar= s.split(":");
            if(ar[0].equals("12"))
                ar[0]="00";
            for(int i=0;i<ar.length;i++)
            tot=tot+ar[i]+":";
            return tot.substring(0,tot.length()-1);
        } else
        //if(s.endsWith("PM"))
        {
            s=s.replaceAll("PM","");
        
        ar= s.split(":");
        if(!ar[0].equals("12"))
        	ar[0]=""+((Integer.parseInt(ar[0])+Integer.parseInt("12"))%24);
        for(int i=0;i<ar.length;i++)
            tot=tot+ar[i]+":";
        return tot.substring(0,tot.length()-1);
        }
       // return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
