import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int year = 2024;
        int month = 8;

        int totalMonths = (month - 1) + (N - 1) * 7;
        
        year += totalMonths / 12;
        month = (totalMonths % 12) + 1;

        System.out.println(year + " " + month);
    }
}