import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            if(s.equals("Algorithm")){
                sb.append(204 + "\n");
            }
            else if(s.equals("DataAnalysis")){
                sb.append(207 + "\n");
            }
            else if(s.equals("ArtificialIntelligence")){
                sb.append(302 + "\n");
            }
            else if(s.equals("CyberSecurity")){
                sb.append("B" + 101 + "\n");
            }
            else if(s.equals("Network")){
                sb.append(303 + "\n");
            }else if(s.equals("Startup")){
                sb.append(501 + "\n");
            }
            else if(s.equals("TestStrategy")){
                sb.append(105 + "\n");
            }
        }

        System.out.println(sb);
    }
}
