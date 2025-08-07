import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        TreeSet<Integer> tree = new TreeSet<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());

            tree.add(n);
        }

        int size = tree.size();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            int t = tree.pollFirst();

            arr[i] = t;
        }

        Arrays.sort(arr);

        for(int i = 0; i < size; i++){
            sb.append(arr[i] + " ");
        }

        System.out.println(sb);
    }
}
