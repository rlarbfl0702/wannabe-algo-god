    import java.io.*;
    import java.util.*;

    public class Main{

        public static int N;
        public static int M;
        public static int arr[];
        public static ArrayList<Integer> result;
        public static boolean visited[];
        public static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N];

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int i = 0; i < N; i++){
                int a = Integer.parseInt(st2.nextToken());

                arr[i] = a;
            }

            Arrays.sort(arr);

            result = new ArrayList<>();
            visited = new boolean[N];

            DFS(0, M);

            System.out.println(sb);
        }

        public static void DFS(int n, int d){
            if(n == d){
                for(int i : result){
                   sb.append(i + " ");
                }

                sb.append("\n");

                return;
            }
            else{
                for(int i = 0; i < N; i++){
                    if(!visited[i]){
                        visited[i] = true;
                        result.add(arr[i]);

                        DFS(n + 1, d);

                        visited[i] = false;
                        result.remove(result.size() - 1);
                    }
                }
            }
        }
    }