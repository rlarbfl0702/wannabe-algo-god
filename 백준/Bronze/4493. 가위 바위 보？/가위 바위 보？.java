import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int p1S = 0;
            int p2S = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char p1 = st.nextToken().charAt(0);
                char p2 = st.nextToken().charAt(0);

                if(p1 == 'R') {
                    if(p2 == 'P') {
                        p2S++;
                    }
                    else if(p2 == 'S') {
                        p1S++;
                    }
                }
                else if(p1 == 'P') {
                    if(p2 == 'S') {
                        p2S++;
                    }
                    else if(p2 == 'R') {
                        p1S++;
                    }
                }
                else {
                    if(p2 == 'R') {
                        p2S++;
                    }
                    else if(p2 == 'P') {
                        p1S++;
                    }
                }
            }
            if(p1S > p2S) {
                sb.append("Player 1").append('\n');
            }
            else if(p2S > p1S) {
                sb.append("Player 2").append('\n');
            }
            else {
                sb.append("TIE").append('\n');
            }
        }
        System.out.println(sb);
    }
}