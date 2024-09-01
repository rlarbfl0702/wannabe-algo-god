import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            String command = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String numbers = br.readLine();

            int start = 0;
            int end = n;
            boolean isReversed = false;
            boolean flag = false;
            
            if (n > 0) {
                String[] numArr = numbers.substring(1, numbers.length() - 1).split(",");
                for(int i=0; i<command.length(); i++) {
                    if(command.charAt(i) == 'R') {
                        isReversed = !isReversed;
                    }
                    else {
                        if(start == end){
                            flag = true;
                            break;
                        }
                        if(isReversed) {
                            end--;
                        }
                        else {
                            start++;
                        }
                    }
                }
                if(flag) {
                    sb.append("error").append('\n');
                }
                else {
                    sb.append('[');
                    if(isReversed) {
                        for(int i=end-1; i>=start; i--) {
                            sb.append(numArr[i]);
                            if(i != start) {
                                sb.append(',');
                            }
                        }
                    }
                    else {
                        for(int i=start; i<end; i++) {
                            sb.append(numArr[i]);
                            if(i != end-1) {
                                sb.append(',');
                            }
                        }
                    }
                    sb.append(']').append('\n');
                }
            }
            else {
                if (command.contains("D")) {
                    sb.append("error\n");
                } else {
                    sb.append("[]\n");
                }
            }
        }
        System.out.println(sb);
    }
}