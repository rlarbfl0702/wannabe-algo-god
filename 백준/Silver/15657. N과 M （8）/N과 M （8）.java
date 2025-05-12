import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int M;
    public static int arr[];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 수를 저장할 배열
        arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 수 입력
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st2.nextToken());

            arr[i] = n;
        }

        // 숫자의 조합을 증가하는 순으로 출력하기 위해서
        // 숫자를 저장한 배열을 정렬
        Arrays.sort(arr);

        int result[] = new int[M];

        DFS(0, M, 0, result);

        System.out.println(sb);
    }

    public static void DFS(int n, int d, int s, int array[]){
        if(n == d){
            for(int i : array){
                sb.append(i + " ");
            }

            sb.append("\n");

            return;
        }

        for(int i = s; i < N; i++){
            // 조합을 M개의 수로 만들어야되므로
            // M 크기의 array 배열 n번째에 i번째 수를 저장
            array[n] = arr[i];

            // 그리고 숫자를 하나 추가했으므로 n + 1과 d,
            // 숫자를 시작할 순번과 숫자를 저장할 배열로 DFS를 다시 돌림
            DFS(n + 1, d, i, array);
        }
    }
}
