import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		h.put("Never gonna give you up", 0);
		h.put("Never gonna let you down", 0);
		h.put("Never gonna run around and desert you", 0);
		h.put("Never gonna make you cry", 0);
		h.put("Never gonna say goodbye", 0);
		h.put("Never gonna tell a lie and hurt you", 0);
		h.put("Never gonna stop", 0);
		
		int N = Integer.parseInt(br.readLine());
		
		boolean TF = false;
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			
			if(!TF) {
				if(!h.containsKey(s)) {
					TF = true;
				}	
			}
		}
		
		if(TF) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
