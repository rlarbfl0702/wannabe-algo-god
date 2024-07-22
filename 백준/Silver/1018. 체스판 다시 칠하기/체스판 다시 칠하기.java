import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 체스판을 바꾸는 최솟값을 저장할 변수
        int min = Integer.MAX_VALUE;

        // 체스판 저장 배열
        String board[][] = new String[N][M];

        // 체스판에 색 저장
        for(int i = 0; i < N; i++){
            String bw = br.readLine();

            for(int j = 0; j < M; j++){
                board[i][j] = bw.split("")[j];
            }
        }

//        for(int i = 0; i < N; i++){
//            System.out.println();
//
//            for(int j = 0; j < M; j++){
//                System.out.print(board[i][j] + " ");
//
//            }
//        }

        // N이 8보다 커서 시작점의 위치가 변할 수도 있으므로
        for(int i = 0; i <= (N - 8); i++){
            // M이 8보다 커서 시작점의 위치가 변할 수도 있으므로
            for(int j = 0; j <= (M - 8); j++){

                // W로 시작하는 체스판에서 바꿔야될 수
                int w_s = 0;
                // B로 시작하는 체스판에서 바꿔야될 수
                int b_s = 0;

                // 행이 몇번째인지 알려주는 변수
                int r_s = 0;
                // 열이 몇번째인지 알려주는 변수
                int c_s = 0;

                // 행의 시작점을 i로 지정
                for(int k = i; k < i + 8; k++){
                    // 열의 시작점을 j로 지정
                    for(int l = j; l < j + 8; l++){
                        // 만약 행이 짝수번째(0포함)이고 열도 짝수번째일때
                        if((r_s % 2 == 0) && (c_s % 2 == 0)){
                            // 해당 값이 W가 아니라면
                            if(!(board[k][l].equals("W"))){
                                // w로 시작하는 체스판에서 바꿔야되는 수 + 1
                                w_s = w_s  + 1;
                            }

                            // 해당 값이 B가 아니라면
                            if(!(board[k][l].equals("B"))){
                                // b로 시작하는 체스판에서 바꿔야되는 수 + 1
                                b_s = b_s  + 1;
                            }
                        }
                        // 만약 행이 홀수번째이고 열이 짝수번째일때
                        else if((r_s % 2 == 1) && (c_s % 2 == 0)){
                            // 해당 값이 B가 아니라면
                            if(!(board[k][l].equals("B"))){
                                // w로 시작하는 체스판에서 바꿔야되는 수 + 1
                                w_s = w_s  + 1;
                            }

                            // 해당 값이 W가 아니라면
                            if(!(board[k][l].equals("W"))){
                                // b로 시작하는 체스판에서 바꿔야되는 수 + 1
                                b_s = b_s  + 1;
                            }
                        }
                        // 만약 행이 짝수번째이고(0포함) 열이 홀수번째일때
                        else if((r_s % 2 == 0) && (c_s % 2 == 1)){
                            // 해당 값이 B가 아니라면
                            if(!(board[k][l].equals("B"))){
                                // w로 시작하는 체스판에서 바꿔야되는 수 + 1
                                w_s = w_s  + 1;
                            }

                            // 해당 값이 W가 아니라면
                            if(!(board[k][l].equals("W"))){
                                // b로 시작하는 체스판에서 바꿔야되는 수 + 1
                                b_s = b_s  + 1;
                            }
                        }
                        else if((r_s % 2 == 1) && (c_s % 2 == 1)){
                            // 해당 값이 W가 아니라면
                            if(!(board[k][l].equals("W"))){
                                // w로 시작하는 체스판에서 바꿔야되는 수 + 1
                                w_s = w_s  + 1;
                            }

                            // 해당 값이 B가 아니라면
                            if(!(board[k][l].equals("B"))){
                                // b로 시작하는 체스판에서 바꿔야되는 수 + 1
                                b_s = b_s  + 1;
                            }
                        }
                        
                        // 열 카운트 + 1
                        c_s = c_s + 1;
                    }
                    // 열 카운트 초기화
                    c_s = 0;
                    
                    // 행 카운트 + 1
                    r_s = r_s + 1;
                }

                // 위에서 센 카운트들로 최솟값 갱신
                if(w_s < min){
                    min = w_s;
                }

                if(b_s < min){
                    min = b_s;
                }
            }
        }

        System.out.println(min);
    }
}
