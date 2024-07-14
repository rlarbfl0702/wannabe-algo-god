import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 중복된 단어들은 들어가면 안되므로
        Set<String> hash = new HashSet<String>();

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            hash.add(s);
        }

        // 정렬된 단어들을 저장할 배열
        String arr[] = new String[hash.size()];

        int cnt = 0;

        // set을 다시 배열로 전환
        for(String i : hash){
            arr[cnt] = i;

            cnt = cnt + 1;
        }

        // 저장된 배열을 문자열 길이로 오름차순 정렬
        Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length());

        // 문자열 길이대로 정렬됐으니 이제 사전 순으로 정렬
        // i번째 문자열을 기준으로
        for(int i = 0; i < arr.length; i++){
            // i번 디음 문자열과 비교
            for(int j = i + 1; j < arr.length; j++){
                // 비교했을 때, i번째 문자열과 길이가 같다면
                if(arr[i].length() == arr[j].length()){
                    // 그 두 문자열끼리
                    for(int k = 0; k < arr[i].length(); k++){
                        // 앞에서 부터 문자의 아스키코드를 비교해서 만약 i번째 문자열의
                        // 문자 아스키코드가 더 크다면 두 문자열의 위치를 바꿈
                        if(arr[i].charAt(k) > arr[j].charAt(k)){
                            String str = arr[i];

                            arr[i] = arr[j];
                            arr[j] = str;

                            break;
                        }

                        // 기준 문자의 아스키코드가 더 작다면 비교할 문자열을
                        // 다음 문자열로 교체
                        if(arr[i].charAt(k) < arr[j].charAt(k)){
                            break;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < hash.size(); i++){
            System.out.println(arr[i]);
        }
    }
}
