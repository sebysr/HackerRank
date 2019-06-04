import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "3";//br.readLine();
        //String line = "quick brown Fox";//br.readLine();
        String line = "quick Brown Fox";//br.readLine();

        int N;
        //System.out.println(input);
        do{  
          N = Integer.parseInt(input);
        }while(N<0 && N>=100);
        String[] sentences=new String[N];
        sentences=line.split(" ");        
        String temp;
        for (int i = 0; i < N; i++) 
        {
            for (int j = i + 1; j < N; j++) 
            {
                if (sentences[i].compareTo(sentences[j])>0) 
                {
                    temp = sentences[i];
                    sentences[i] = sentences[j];
                    sentences[j] = temp;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.println(sentences[i]);
          }
          
    }
}

 