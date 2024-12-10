import java.io.*;
import java.util.*;

public class Main {

    // 배열을 저장할 TreeSet, 중복 저장을 하면 안되고
    // 정렬을 해야되므로 TreeSet을 사용
    public static TreeSet<int[]> dic;
    // 해당 숫자를 방문했는지 처리할 배열
    public static boolean visited[];
    // 숫자를 저장할 배열
    public static int arr[];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 숫자 입력받기
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st2.nextToken());

            arr[i] = n;
        }

        // 사전순으로 수열을 출력해야되므로 정렬
        Arrays.sort(arr);

        // 조합 저장할 TreeSet
        dic = new TreeSet<>((a, b) -> {
            for(int i = 0; i < a.length; i++){
                if(a[i] != b[i]){
                    return Integer.compare(a[i], b[i]);
                }
            }
            return 0;
        });

        // 방문처리할 배열
        visited = new boolean[N];

        // 조합을 저장할 배열
        int list[] = new int[M];

        DFS(0, M, list);

        for(int i[] : dic){
            for(int j : i){
                sb.append(j + " ");
            }

            sb.append("\n");
        }

        System.out.println(sb);

    }

    public static void DFS(int n, int d, int array[]){
        // 만든 조합의 길이가 M크기에 도달한다면
        // 해당 조합을 TreeSet에 저장
        if(n == d){
            dic.add(array.clone());

            return;
        }
        else{
            for(int i = 0; i < arr.length; i++){
                // 만약 해당 숫자를 방문하지 않았다면
                if(!visited[i]){

                    // 조합을 저장할 배열에 해당 숫자를 저장하고
                    array[n] = arr[i];
                    // 방문처리
                    visited[i] = true;

                    DFS(n + 1, d, array);

                    // DFS를 돌리고 나서 해당 숫자의 방문처리를 다시 false로 바꿈
                    visited[i] = false;
                }
            }
        }
    }
}
