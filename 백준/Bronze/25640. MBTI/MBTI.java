import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        String mbti = br.readLine();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            boolean flag = false;
            for (int j = 0; j < 4; j++) {
                if(mbti.charAt(j) != input.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}