import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int result = 0;

        for(int i = 0; i < s.length(); i++){
            int c_num = s.charAt(i);

            if(c_num >= 65 && c_num <= 67){
                result = result + 3;
            }
            else if(c_num >= 68 && c_num <= 70){
                result = result + 4;
            }
            else if(c_num >= 71 && c_num <= 73){
                result = result + 5;
            }
            else if(c_num >= 74 && c_num <= 76){
                result = result + 6;
            }
            else if(c_num >= 77 && c_num <= 79){
                result = result + 7;
            }
            else if(c_num >= 80 && c_num <= 83){
                result = result + 8;
            }
            else if(c_num >= 84 && c_num <= 86){
                result = result + 9;
            }
            else if(c_num >= 87 && c_num <= 90){
                result = result + 10;
            }
        }


        System.out.println(result);
    }
}