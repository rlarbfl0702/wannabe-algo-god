import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        if (input == null) return;

        double k = Double.parseDouble(input);

        double commission = 25 + (k * 0.01);

        if (commission < 100) {
            commission = 100;
        } else if (commission > 2000) {
            commission = 2000;
        }

        System.out.printf("%.2f\n", commission);
    }
}