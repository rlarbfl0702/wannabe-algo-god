import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num%2!=0) answer++;
		}
		
		System.out.println(answer);
	}

}
