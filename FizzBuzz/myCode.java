/* package whatever; // don't place package name! */

import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int num;
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
          String input = br.readLine();
          //System.out.println(input);
          num=Integer.parseInt(input);
        }while(num<0 && num>107);
      
        for(int i=1;i<=num;i++){
          if(i%3==0 && i%5==0)
            System.out.println("FizzBuzz");
          else if(i%3==0)
            System.out.println("Fizz");
          else if(i%5==0)  
            System.out.println("Buzz");
          else
            System.out.println(i);
        }
    }
}