import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        String s = br.readLine();

        int len = s.length();

        for(int i = 0; i < len; i++){
            if(s.split("")[i].equals("e")){
                cnt = cnt + 1;
            }
        }

        cnt = cnt * 2;

        sb.append("h");

        for(int i = 0; i < cnt; i++){
            sb.append("e");
        }

        sb.append("y");

        System.out.println(sb);
    }
}
