import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int arr[] = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            int n = Integer.parseInt(s.split("")[i]);

            arr[i] = n;
        }

        Arrays.sort(arr);


        String result = "";

        for(int i = arr.length - 1; i >= 0; i--){
            result = result + arr[i];
        }

        System.out.println(result);
    }
}
