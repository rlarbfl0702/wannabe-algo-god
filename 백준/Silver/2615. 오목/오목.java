import java.io.*;
import java.util.*;

public class Main{

    public static int map[][];
    public static int dx[] = {0, 1, 1, -1};
    public static int dy[] = {1, 0, 1, 1};
    public static ArrayList<Node> start;

    public static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new int[19][19];
        start = new ArrayList<>();

        for(int i = 0; i < 19; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 19; j++){
                int n = Integer.parseInt(st.nextToken());

                map[i][j] = n;

                // 흰돌, 검은돌 시작 위치 지점을 저장
                if(n != 0){
                    start.add(new Node(i, j));
                }
            }
        }

        boolean TF = false;

        for(Node node : start){
            int sx = node.x;
            int sy = node.y;

            for(int i = 0; i < 4; i++){
                boolean correct = check(i, map[sx][sy], sx, sy);

                if(correct){
                    TF = true;
                    System.out.println(map[sx][sy]);
                    System.out.println((sx + 1) + " " + (sy + 1));
                    break;
                }
            }

            if(TF){
                break;
            }
        }

        if(!TF){
            System.out.println(0);
        }
    }

    public static boolean check(int direction, int color, int x, int y){
        int c = 1;

        int nx = x + dx[direction];
        int ny = y + dy[direction];

        while(isValid(nx, ny) && map[nx][ny] == color){
            nx = nx + dx[direction];
            ny = ny + dy[direction];
            c++;
        }

        // 반대 방향으로도 탐색
        nx = x - dx[direction];
        ny = y - dy[direction];

        while(isValid(nx, ny) && map[nx][ny] == color){
            nx = nx - dx[direction];
            ny = ny - dy[direction];
            c = c + 1;
        }

        if(c != 5){
            return false;
        }

        int prex = x - dx[direction];
        int prey = y - dy[direction];

        // 6개 이상 연속된 경우 false
        if(isValid(prex, prey) && map[prex][prey] == color){
            return false;
        }

        return true;
    }

    public static boolean isValid(int x, int y){
        return x >= 0 && x < 19 && y >= 0 && y < 19;
    }
}
