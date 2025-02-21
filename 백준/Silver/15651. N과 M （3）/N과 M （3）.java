    import java.io.*;
    import java.util.*;

    public class Main{

        static int N;
        static ArrayDeque<Integer> q;
        static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            q = new ArrayDeque<>();

            DFS(0, M, q);

            System.out.println(sb);
        }

        public static void DFS(int n, int d, ArrayDeque<Integer> dq){
            if(n == d){

                ArrayDeque<Integer> ndq = dq.clone();

                for(int i = 0; i < d; i++){
                    if(!ndq.isEmpty()){
                        int p = ndq.pollFirst();

                        sb.append(p + " ");
                    }
                }
                sb.append("\n");

                return;
            }
            else{
                for(int i = 1; i <= N; i++){
                    dq.addLast(i);

                    DFS(n + 1, d, dq);

                    dq.pollLast();
                }
            }
        }
    }