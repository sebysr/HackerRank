/* package whatever; // don't place package name! */

import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().replaceAll("\\s+", "");
        //System.out.println(input);
        int sentencesNumber=Integer.parseInt(input);
        String[] sentences=new String[sentencesNumber];
        for(int i=0;i<sentencesNumber;i++){
          sentences[i]=br.readLine();
        }
        String reverse = new String();
        String reverseAll = new String();
        for(int j=0;j<sentencesNumber;j++){
          reverseAll="";
          String[] parts=sentences[j].split(" ");
          for(int k=0;k<parts.length;k++){
            for(int i = parts[k].length() - 1; i >= 0; i--){
                reverse = reverse + parts[k].charAt(i);
            }
            if(reverseAll.length()==0)
              reverseAll=reverse;
            else
              reverseAll=reverseAll+" "+reverse;
            reverse="";
          }
          System.out.println(reverseAll);  
        }
    }
}