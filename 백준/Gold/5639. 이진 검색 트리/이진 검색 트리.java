import java.io.*;
import java.util.*;

public class Main {

    static int preOrder[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> tree = new ArrayList<>();

        String s;

        // 입력이 들어오지 않으면 입력받기 종료
        while((s = br.readLine()) != null && !s.isEmpty()){
            int N = Integer.parseInt(s);

            tree.add(N);
        }

        // ArrayList를 배열로 변환
        preOrder = new int[tree.size()];

        // 리스트 값을 배열에 복사
        for(int i = 0; i < tree.size(); i++){
            preOrder[i] = tree.get(i);
        }

        order(0, preOrder.length - 1);

        System.out.println(sb);
    }

    public static void order(int s, int e){
        // 시작 인덱스가 끝 인덱스보다 크면 반환
        if(s > e){
            return;
        }

        // 현재 서브트리의 루트 값
        int root = preOrder[s];
        // 오른쪽 서브트리의 시작 인덱스를 찾기 위한 초기값
        int s_index = s + 1;

        // 오른쪽 서브트리의 시작 인덱스를 찾음
        while(s_index <= e && preOrder[s_index] < root){
            s_index = s_index + 1;
        }

        // 왼쪽 서브트리를 재귀적으로 탐색
        order(s + 1, s_index - 1);
        // 오른쪽 서브트리를 재귀적으로 탐색
        order(s_index, e);

        sb.append(root + "\n");
    }
}
