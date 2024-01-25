import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LoveStory {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int j=0;j<n;j++)
        {
            int c=0;
            String GivenStr="codeforces";
            String inStr=br.readLine();

            for(int i=0;i<10;i++)
            {
                if(GivenStr.charAt(i)!=inStr.charAt(i))
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}