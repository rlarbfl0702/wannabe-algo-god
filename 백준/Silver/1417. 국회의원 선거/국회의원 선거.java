import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int arr[] = new int[T - 1];

        int dasom = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i = 0; i < T - 1; i++){
            int n = Integer.parseInt(br.readLine());

            arr[i] = n;
        }

        if(T <= 1){
            System.out.println(0);
        }
        else{
            while(true){

                Arrays.sort(arr);

                if(dasom > arr[T - 2]){
                    break;
                }

                arr[T - 2] = arr[T - 2] - 1;

                dasom = dasom + 1;
                result = result + 1;
            }

            System.out.println(result);
        }
    }
}
