import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            sb.append("LoveisKoreaUniversity ");
        }

        System.out.println(sb);
    }
}