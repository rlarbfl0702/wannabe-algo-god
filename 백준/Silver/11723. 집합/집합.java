import  java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean arr[] = new boolean[21];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cal = st.nextToken();

            if(cal.equals("add")){
                int x = Integer.parseInt(st.nextToken());

                if(arr[x] == false){
                    arr[x] = true;
                }
            }
            if(cal.equals("remove")){
                int x = Integer.parseInt(st.nextToken());

                if(arr[x] == true){
                    arr[x] = false;
                }
            }
            if(cal.equals("check")){
                int x = Integer.parseInt(st.nextToken());

                if(arr[x] == true){
                    sb.append(1 + "\n");
                }
                else{
                    sb.append(0 + "\n");
                }
            }
            if(cal.equals("toggle")){
                int x = Integer.parseInt(st.nextToken());

                if(arr[x] == true){
                    arr[x] = false;
                }
                else{
                    arr[x] = true;
                }
            }
            if(cal.equals("all")){
                for(int j = 0; j < 21; j++){
                    arr[j] = true;
                }
            }
            if(cal.equals("empty")){
                for(int j = 0; j < 21; j++){
                    arr[j] = false;
                }
            }
        }

        System.out.println(sb);
    }
}
