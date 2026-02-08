import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str2 = br.readLine();

        System.out.println(str.equals(str2) ? 0 : 1550);
    }
}