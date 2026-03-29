import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int birthY = Integer.parseInt(st.nextToken());
        int birthM = Integer.parseInt(st.nextToken());
        int birthD = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int curY = Integer.parseInt(st.nextToken());
        int curM = Integer.parseInt(st.nextToken());
        int curD = Integer.parseInt(st.nextToken());

        int manAge = curY - birthY;
        if (curM < birthM) {
            manAge--;
        } else if (curM == birthM) {
            if (curD < birthD) {
                manAge--;
            }
        }

        int koreanAge = curY - birthY + 1;

        int yearAge = curY - birthY;

        System.out.println(manAge);
        System.out.println(koreanAge);
        System.out.println(yearAge);
    }
}