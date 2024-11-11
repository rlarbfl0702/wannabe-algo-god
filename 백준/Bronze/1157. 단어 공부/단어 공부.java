import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int alp[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            int n = s.charAt(i);

            if(n <= 90){
                alp[n - 65] = alp[n - 65] + 1;
            }
            else{
                alp[n - 97] = alp[n - 97] + 1;
            }
        }

        int alp2[] = Arrays.copyOf(alp, 26);

        Arrays.sort(alp2);

        boolean is = false;

        if(alp2[25] == alp2[24]){
            is = true;
        }

        char result = ' ';

        if(is){
            result = '?';
        }
        else{
            for(int i = 0; i < 26; i++){
                if(alp2[25] == alp[i]){
                    result = (char)(i + 65);
                }
            }
        }

        System.out.println(result);
    }
}