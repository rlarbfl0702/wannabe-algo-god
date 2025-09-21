import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String person;
		int d = 0;
		int p = 0;
		boolean isFin = false;
		
		for(int i=0; i<N; i++) {
			person = br.readLine();
			if(!isFin) {
				if(person.equals("D")) {
					d++;
				}
				else {
					p++;
				}
				if(Math.abs(d-p) >= 2) {
					isFin = true;
				}
			}
		}
		System.out.println(d+":"+p);
	}

}
