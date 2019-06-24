import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the strangeGrid function below.
     */
    static long strangeGrid(long r, long c) {
        /*
         * Write your code here.
         */
        
        long num = (r==1) ? 10  : r*5 ;
        // if r is even, numbers in row are odd
        if(r%2==0){
            num--;
        }
        else{ //if r is odd, numbers in row are even
            num=(r+1)*5;
            num-=2;
        }
        return num-((5-c)*2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] rc = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        long c,r;
        do{
            r = Integer.parseInt(rc[0]);
        }while(r>2*1000000000);
        do{
            c = Integer.parseInt(rc[1]);
        }while(c>6);

        long result = strangeGrid(r, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
