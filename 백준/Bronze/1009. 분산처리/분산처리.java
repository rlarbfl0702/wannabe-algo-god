import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            ArrayList<Integer> arr = new ArrayList<>();

            int end = a % 10;
            arr.add(end);

            while (true) {
                end = (end * a) % 10;

                if(arr.contains(end)){
                    break;
                }

                arr.add(end);
            }

            int len = arr.size();
            b = b % len;

            int result = 0;

            if(b == 0){
                result = arr.get(len - 1);
            }
            else{
                result = arr.get(b - 1);
            }

            if(result == 0){
                result = 10;
            }

            sb.append(result).append('\n');
        }

        System.out.print(sb);
    }
}
