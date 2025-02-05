import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if((a == 0) && (b == 0) && (c == 0)){
                break;
            }

            int most = Math.max(a, Math.max(b, c));

            if(most == a){
                if(most < b + c){
                    if((a == b) && (a == c)){
                        sb.append("Equilateral" + "\n");
                    }
                    else if(((a == b) && (a != c)) || ((a != b) && (a == c)) || ((a != b) && (b == c))){
                        sb.append("Isosceles" + "\n");
                    }
                    else if((a != b) && (a != c) && (b != c)){
                        sb.append("Scalene" + "\n");
                    }
                }
                else{
                    sb.append("Invalid" + "\n");
                }
            }
            else if(most == b){
                if(most < a + c){
                    if((a == b) && (a == c)){
                        sb.append("Equilateral" + "\n");
                    }
                    else if(((a == b) && (a != c)) || ((a != b) && (a == c)) || ((a != b) && (b == c))){
                        sb.append("Isosceles" + "\n");
                    }
                    else if((a != b) && (a != c) && (b != c)){
                        sb.append("Scalene" + "\n");
                    }
                }
                else{
                    sb.append("Invalid" + "\n");
                }
            }
            else if(most == c){
                if(most < a + b){
                    if((a == b) && (a == c)){
                        sb.append("Equilateral" + "\n");
                    }
                    else if(((a == b) && (a != c)) || ((a != b) && (a == c)) || ((a != b) && (b == c))){
                        sb.append("Isosceles" + "\n");
                    }
                    else if((a != b) && (a != c) && (b != c)){
                        sb.append("Scalene" + "\n");
                    }
                }
                else{
                    sb.append("Invalid" + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}
