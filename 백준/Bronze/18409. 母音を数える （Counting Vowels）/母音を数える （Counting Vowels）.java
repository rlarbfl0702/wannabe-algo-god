import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        char[] charArr = {'a', 'i', 'u', 'e', 'o'};

        br.readLine();
        String str = br.readLine();

        for(int i=0; i<charArr.length; i++) {
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == charArr[i]) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}