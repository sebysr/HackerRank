/* package whatever; // don't place package name! */

import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M,N;
        do{
        String input = br.readLine();
        //System.out.println(input);
         N = Integer.parseInt(input.split(" ")[0].replaceAll("\\s+", ""));
         M = Integer.parseInt(input.split(" ")[1].replaceAll("\\s+", ""));
        }while((N<0 && N>20000) && (M<0 && M>15000));
        
        String nlines = br.readLine();
        String[] nValues=new String[N];
        for(int i=0;i<N;i++)
          nValues[i]=nlines.split(" ")[i];
        String[] mlines=new String[M];
        for(int i=0;i<M;i++)
          mlines[i] = br.readLine();
        int boole;
        for(int i=0;i<M;i++){
          boole=0;
          for(int j=0;j<N;j++){
            if(mlines[i].equals(nValues[j])){
              System.out.println("True");
              boole=1;
              break;
            }   
          }
          if(boole==0)
            System.out.println("False");
        }
            
    }
}