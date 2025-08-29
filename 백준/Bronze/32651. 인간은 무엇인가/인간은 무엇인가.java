import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		if(N > 100_000) {
			System.out.println("No");
		}
		else if(N%2024 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
