import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int answer = 0;
		char c = str.charAt(0);
		
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);
			if(c == 'A' || c == 'a' || c == 'b' || c == 'D' || c == 'd'|| c == 'e'|| c == 'g'|| c == 'O'|| c == 'o'|| c == 'P'|| c == 'p'|| c == 'Q'|| c == 'q'|| c == 'R' || c == '@' )
				answer++;
			else if(c == 'B')
				answer += 2;
		}
		System.out.println(answer);
	}

}
