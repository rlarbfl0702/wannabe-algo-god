import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double W = Double.parseDouble(br.readLine());
        double H = Double.parseDouble(br.readLine());

        double BMI = W / (H * H);

        if(BMI > 25.0){
            System.out.println("Overweight");
        }
        else if(BMI >= 18.5 && BMI <= 25.0){
            System.out.println("Normal weight");
        }
        else if(BMI < 18.5){
            System.out.println("Underweight");
        }
    }
}
