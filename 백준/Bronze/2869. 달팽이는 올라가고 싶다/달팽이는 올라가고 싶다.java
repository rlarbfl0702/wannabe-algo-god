import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 올라가는 길이
        int up = Integer.parseInt(st.nextToken());
        // 내려가는 길이
        int down = Integer.parseInt(st.nextToken());
        // 나무 길이
        int tree = Integer.parseInt(st.nextToken());

        // 날짜 카운트
        int cnt = 1;
        // 남은 길이
        int len = 0;

        // 하루는 무조건하므로 나무길이에서 하루에 올라가는 길이를 빼줌
        len = tree - up;

        // 남은 나무 길이가 있다면
        if(len >= 0){
            // 남은 나무 길이를 하루에 올라갈 수 있는 길이(올라가는 길이 - 내려가는 길이) 만큼 나눔
            // 만약 나머지가 없다면 하루씩 딱 떨어지므로 그 몫만큼 카운트에 더해줌
            if(len % (up - down) == 0){
                len = len / (up - down);
            }
            // 만약 나머지가 있다면 하루 더 올라가야되므로 나눈 몫에 + 1을 해줌
            else{
                len = len / (up - down) + 1;
            }

            cnt = cnt + len;
        }

        System.out.println(cnt);
    }
}
