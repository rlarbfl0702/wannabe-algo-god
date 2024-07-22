import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // N개의 카드를 저장하는 배열
        HashMap<Integer, Integer> n_arr = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // N개의 숫자를 입력받아서 저장
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            // n인 key가 있는지 확인
            if(n_arr.containsKey(n)){
                // n의 value 값을 저장
                int v = n_arr.get(n);

                // 다시 키를 저장할 때 value 값에 1이 더해진 걸 새로 저장
                n_arr.put(n, v + 1);
            }
            // 없다면 n을 key값, 1을 value 값으로 저장
            else{
                n_arr.put(n, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());

        // M개의 카드를 저장하는 배열
        int m_arr[] = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // M개의 숫자를 입력받아서 저장
        for(int i = 0; i < M; i++){
            int m = Integer.parseInt(st2.nextToken());

            m_arr[i] = m;
        }

        // 결과값 저장할 배열
        int result[] = new int[M];

        // m_arr에 있는 값들이 m_arr에 key값으로 있다면 해당 위치에
        // value값 저장
        for(int i = 0; i < m_arr.length; i++){
            result[i] = n_arr.getOrDefault(m_arr[i], 0);
        }

        for(int i = 0; i < result.length; i++){
            sb.append(result[i] + " ");
        }

        System.out.println(sb);
    }
}
