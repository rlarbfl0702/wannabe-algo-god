import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        List<int[]> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        list.sort((n1, n2)->{
            if(n1[1] != n2[1]) {
                return n1[1]-n2[1];
            }
            return n1[0]-n2[0];
        });

        for(int[] l: list){
            sb.append(l[0]).append(' ').append(l[1]).append('\n');
        }
        System.out.println(sb);
    }
}