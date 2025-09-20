import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigDecimal A = new BigDecimal(st.nextToken());
        BigDecimal B = new BigDecimal(st.nextToken());

        BigDecimal result = A.divide(B, 1000, RoundingMode.HALF_UP);

        System.out.println(result.toPlainString());
    }
}
