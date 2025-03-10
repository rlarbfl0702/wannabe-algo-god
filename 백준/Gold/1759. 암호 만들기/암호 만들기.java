import java.io.*;
import java.util.*;

public class Main {

    public static int L, C;
    public static StringBuilder sb = new StringBuilder();
    public static char letters[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        letters = new char[C];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < C; i++){
            char c = st2.nextToken().charAt(0);

            letters[i] = c;
        }

        Arrays.sort(letters);

        char result[] = new char[L];

        DFS(0, 0, 0, 0, result);

        System.out.println(sb.toString());
    }

    public static void DFS(int s, int d, int moCnt, int jaCnt, char password[]) {
        if(d == L){
            if(moCnt >= 1 && jaCnt >= 2){
                for(char i : password){
                    sb.append(i);
                }
                sb.append("\n");
            }

            return;
        }
        else{
            for(int i = s; i < C; i++){

                char c = letters[i];

                // 현재 깊이에 해당 문자 저장
                password[d] = c;

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    // 현재 위치에서 한 칸뒤부터 문자 조합하고 깊이를 + 1
                    // 현재 위치의 단어가 모음일 경우, 모음 개수 + 1
                    DFS(i + 1, d + 1, moCnt + 1, jaCnt, password);
                }
                else{
                    // 현재 위치의 단어가 자음일 경우, 자음 개수 + 1
                    DFS(i + 1, d + 1, moCnt, jaCnt + 1, password);
                }
            }
        }
    }
}
