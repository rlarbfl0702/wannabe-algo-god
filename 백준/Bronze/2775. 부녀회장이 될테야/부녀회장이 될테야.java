import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int apt[] = new int[n + 1];
            int apt2[] = new int[n + 1];

            apt2[1] = 1;

            for(int j = 1; j <= n; j++){
                apt[j] = j;
            }

            // 해당 층이 될때마다 반복해야되므로
            for(int j = 1; j <= k; j++){
                // 한 층에 호수가 여러개이므로 호마다 계산
                for(int l = 2; l <= n; l++){
                    // 한 호수에 대해 아래층 인원수로 계산
                    for(int m = 1; m <= l; m++){
                        apt2[l] = apt2[l] + apt[m];
                    }
                }

                if(j == k) {
                  break;
                }
                else{
                    for(int l = 1; l <= n; l++){
                        apt[l] = apt2[l];
                        if(l == 1){
                            apt2[l] = 1;
                        }
                        else{
                            apt2[l] = 0;
                        }
                    }
                }
            }

            System.out.println(apt2[n]);
        }
    }
}
