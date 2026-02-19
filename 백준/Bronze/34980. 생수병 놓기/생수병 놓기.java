import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s1 = br.readLine();
        String s2 = br.readLine();

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < N; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 == 'w'){
                cnt1 = cnt1 + 1;
            }

            if(c2 == 'w'){
                cnt2 = cnt2 + 1;
            }
        }

        if(s1.equals(s2)){
            System.out.println("Good");
        }
        else{
            if(cnt1 > cnt2){
                System.out.println("Oryang");
            }
            else if(cnt1 == cnt2){
                System.out.println("Its fine");
            }
            else{
                System.out.println("Manners maketh man");
            }
        }
    }
 }