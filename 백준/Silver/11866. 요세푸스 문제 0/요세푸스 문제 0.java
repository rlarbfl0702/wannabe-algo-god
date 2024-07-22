import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자를 저장할 arrayList
        List<Integer> round = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 순서대로 숫자를 집어넣음
        for(int i = 1; i <= N; i++){
            round.add(i);
        }

        // 시작위치
        int start = 0;

        while(true){
            // 만약 시작위치에서 K번째 뒤가 최대 사람수를 넘겼다면
            if(start + (K - 1) > (round.size() - 1)){
                // 다시 앞으로 가서 빼고 남은 수 만큼 카운트
                start = (start + (K - 1)) % round.size();
            }
            else{
                // 최댓값을 넘어가지 않는다면 K번째 뒤를 시작점으로 옮김
                start = start + (K - 1);
            }

            // 결과를 저장할 arrayList에 바뀐 시작점에 있는 사람을 저장
            result.add(round.get(start));
            // 결과 값에 저장됐으면 원래 arrayList에서도 제거해줌
            round.remove(start);

            if(round.isEmpty()){
                break;
            }
        }

        sb.append("<");

        for(int i = 0; i < N; i++){
            if(i == N - 1){
                sb.append(result.get(i) + ">");
            }
            else{
                sb.append(result.get(i) + ", ");
            }
        }

        System.out.println(sb);
    }
}
