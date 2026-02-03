import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if(str.equals("end")) {
                break;
            }
            else if(str.equals("animal")) {
                sb.append("Panthera tigris");
            }
            else if(str.equals("tree")) {
                sb.append("Pinus densiflora");
            } else if (str.equals("flower")) {
                sb.append("Forsythia koreana");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
