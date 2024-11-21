import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] strings = new String[5];
        for (int i = 0; i < 5; i++) {
            strings[i] = br.readLine();
        }

        int maxLength = 0;
        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }

        for (int i = 0; i < maxLength; i++) {
            for (String s : strings) {
                if (i < s.length()) {
                    sb.append(s.charAt(i));
                }
            }
        }

        System.out.println(sb);
    }
}
