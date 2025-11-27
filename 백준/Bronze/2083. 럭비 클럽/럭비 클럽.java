import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String s = br.readLine();

            if(s.equals("# 0 0")){
                break;
            }

            String name = s.split(" ")[0];
            int age= Integer.parseInt(s.split(" ")[1]);
            int weight = Integer.parseInt(s.split(" ")[2]);

            if(age > 17 || weight >= 80){
                sb.append(name + " " + "Senior" + "\n");
            }
            else{
                sb.append(name + " " + "Junior" + "\n");
            }
        }

        System.out.println(sb);
    }
}
