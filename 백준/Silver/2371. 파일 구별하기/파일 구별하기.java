import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 파일의 순서와 파일값을 저장할 HashMap
        HashMap<Integer, Integer> file = new HashMap<>();

        // 파일끼리 비교했을때 다름을 구분할 수 있는 길이를 저장할 arrayList
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 몇번째 수인지 판별할 변수
            int cnt = 1;

            while(true){
                int n = Integer.parseInt(st.nextToken());

                // -1이 들어오면 탈출
                if(n == -1){
                    break;
                }

                // i가 0이라면
                // 아직 파일이 아무것도 들어오지 않은 것이므로
                // 해당 카운트에 파일 값을 저장
                if(i == 0){
                    file.put(cnt, n);
                }
                // 아니라면
                // 원래 value값과 현재 value값이 같은지 비교하고
                // 같으면 해당 순번에서 파일을 구분할 수 없으므로
                // 다음 cnt로 넘어감
                // 만약 다르다면 지금까지의 cnt를 arrayList에 저장하고
                // 다음 파일로 넘어가서 파일 값을 비교
                else{
                    // 만약 처음파일을 입력하는게 아닌데
                    // 해당 cnt값에 해당하는 파일 값이 없다면
                    if(!file.containsKey(cnt)){
                        // 해당 cnt값에 value를 새로 저장하고
                        // 새로 저장받은 길이까지 전 파일과 구별을 할 수 없다는
                        // 뜻이므로
                        file.put(cnt, n);

                        // arr에 해당 cnt 길이를 저장하고 탈출
                        arr.add(cnt);
                        break;
                    }

                    // 만약 저장되어 있는 파일의 cnt에 해당하는 value값과
                    // 현재 파일의 cnt에 해당하는 번쨰의 값이 다르다면
                    // 해당 번째에서 파일을 구분할 수 있다는 뜻이므로 
                    // arr에 해당 cnt 길이를 저장하고 탈출
                    if(file.get(cnt) != n){
                        arr.add(cnt);
                        break;
                    }
                }

                cnt = cnt + 1;
            }
        }

        // 결과값 저장할 변수
        int result = 0;

        // arrayList에 저장된 값 중 제일 큰 값이 모든 파일을 구별할 수
        // 있게 해주는 순번 값
        for(int i : arr){
            if(result <= i){
                result = i;
            }
        }

        System.out.println(result);
    }
}
