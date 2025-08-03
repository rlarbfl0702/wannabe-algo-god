import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				break;
			}
			for(int j=0; j<num; j++) {
				for(int k=0; k<=j; k++) {
					sb.append('*');
				}
				sb.append('\n');
			}
		}
		
		System.out.println(sb);
		
	}

}
