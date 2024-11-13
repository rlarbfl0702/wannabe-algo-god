import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int result = 0;

        for(int test = 0; test < T; test++){
            String s = br.readLine();

            boolean alp[] = new boolean[26];

            result = result + 1;

            for(int i = 0; i < s.length(); i++){
                int n = s.charAt(i);

                if(!alp[n - 97]){
                    alp[n - 97] = true;
                }
                else{
                    if(i > 0){
                        if(s.charAt(i - 1) != s.charAt(i)){
                            result = result - 1;
                            break;
                        }
                    }
                }

            }
        }

        System.out.println(result);
    }
}