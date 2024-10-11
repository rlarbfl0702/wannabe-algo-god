import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int eng[] = new int[26];

        Arrays.fill(eng, -1);

        for(int i = 0; i < word.length(); i++){
            int num = word.charAt(i);

            if(eng[num - 97] == -1){
                eng[num - 97] = i;
            }
        }

        for(int i : eng){
            System.out.print(i + " ");
        }
    }
}