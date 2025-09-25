import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(136, 1000);
		map.put(142, 5000);
		map.put(148, 10000);
		map.put(154, 50000);
		
		int answer = 0;
		for(int i=0; i<N; i++) {
			
			st = new StringTokenizer(br.readLine());
			answer += map.get(Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(answer);
		
	}

}
