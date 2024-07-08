import java.io.*;
import java.util.*;

// hashmap 사용
// 데이터를 저장할때 key와 value가 짝을 이루어 저장됨
// 키 값으로 hash 함수를 실행한 결과를 통해 저장위치를 결정
// 추가, 삭제, 특히 검색이 빠름

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 포켓몬 도감 수
        int list = Integer.parseInt(st.nextToken());
        // 맞춰야 되는 문제 수
        int test = Integer.parseInt(st.nextToken());

        // Hashmap에 key값과 value 값을 사용하여 저장
        // 이름으로 찾는 경우와 번호로 찾는 경우 두가지가 있기 때문에 두번 저장
        HashMap<String, Integer> poket = new HashMap<String, Integer>(list);
        HashMap<Integer, String> poket2 = new HashMap<Integer, String>(list);

        for(int i = 1; i < list + 1; i++){
            // 도감에 등록될 포켓몬 이름
            String s = br.readLine();

            // 도감에 등록
            poket.put(s, i);
            poket2.put(i, s);
        }

        for(int i = 0; i < test; i++){
            String s = br.readLine();

            // 테스트하는 문제가 번호인지 이름인지 알기 위해서
            // 첫 문자를 떼서 아스키코드로 비교하기 위해 변환
            int ch = (int)s.charAt(0);

            // 아스키코드로 비교해서 대문자일 경우,
            // 도감에서 key 값인 이름으로 value 값인 번호 찾아서 저장
            if((65 <= ch) && (ch <= 90)){
                int n = poket.get(s);
                sb.append(n + "\n");
            }
            // 첫 문자가 대문자가 아닐 경우,
            else{
                // 문자열로 받았으므로 int로 변환
                int num = Integer.parseInt(s);
                // 도감에서 key 값인 번호로 value 값인 해당 포켓몬 이름을 찾아 저장
                String po = poket2.get(num);
                sb.append(po + "\n");
            }
        }

        System.out.println(sb);
    }
}