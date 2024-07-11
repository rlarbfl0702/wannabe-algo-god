import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] grades = new int[N];
        int max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            grades[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, grades[i]);
        }

        double answer = 0;
        for(int grade: grades) {
            answer += grade;
        }
        System.out.println(answer/max*100/N);
        
    }
}
