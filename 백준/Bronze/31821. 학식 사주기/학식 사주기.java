import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m_cnt = Integer.parseInt(br.readLine());
        int menu[] = new int[m_cnt + 1];
        int total = 0;

        for(int i = 0; i < m_cnt; i++){
            int m = Integer.parseInt(br.readLine());

            menu[i + 1] = m;
        }

        int p_cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < p_cnt; i++){
            int num = Integer.parseInt(br.readLine());

            total = total + menu[num];
        }

        System.out.println(total);
    }
}