import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        String str = br.readLine();

        for(int i=0; i<str.length(); i++) {
            if(arr[str.charAt(i)-'a'] == -1) {
                arr[str.charAt(i)-'a'] = i;
            }
        }
        for(int i=0; i<26; i++) {
            sb.append(arr[i]).append(' ');
        }
        sb.append('\n');
        System.out.println(sb);
    }
}