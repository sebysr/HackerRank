/* package whatever; // don't place package name! */

import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        //System.out.println(input);
        String iterationNumber=input.split(" ")[0];
        String word=input.split(" ")[1];
        for(int i =1; i<=Integer.parseInt(iterationNumber);i++){
          System.out.println(i+" "+word);
        }
    }
}