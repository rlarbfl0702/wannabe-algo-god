import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 10;
        for(int i=10; i<100; i++) {
            int tmp1 = i/10 + i%10*10;
            int tmp2 = i/10 + i%10;
            if(tmp1%4 == 0 && tmp2%6==0 && i/10!=8 && i%10!=8) {
                answer = i;
            }
        }
        System.out.println(answer);

    }
}
