import java.io.*;
import java.util.*;

public class Main {

    // 트리 계산할 때, 쓸 노드
    static class Node{
        char value;
        Node left;
        Node right;

        public Node(char value){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    // 전위 순회
    public static void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 중위 순회
    public static void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value);
        inOrder(node.right);
    }

    // 후위 순회
    public static void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Node tree[] = new Node[N + 1];

        for(int i = 0; i < N; i++){
            // 구조 입력
            StringTokenizer st = new StringTokenizer(br.readLine());

            char parent_value = st.nextToken().charAt(0);
            char left_value = st.nextToken().charAt(0);
            char right_value = st.nextToken().charAt(0);

            if(tree[parent_value - 'A'] == null){
                tree[parent_value - 'A'] = new Node(parent_value);
            }
            // 왼쪽 자식이 있다면
            if(left_value != '.'){
                // 왼쪽 자식 노드를 생성하고
                tree[left_value - 'A'] = new Node(left_value);
                // 부모 노드와 연결
                tree[parent_value - 'A'].left = tree[left_value - 'A'];
            }
            // 오른쪽 자식이 있다면
            if(right_value != '.'){
                // 오른쪽 자식 노드를 생성하고
                tree[right_value - 'A'] = new Node(right_value);
                // 부모 노드와 연결
                tree[parent_value - 'A'].right = tree[right_value - 'A'];
            }
        }

        // 전위 순회
        preOrder(tree[0]);
        System.out.println();

        // 중위 순회
        inOrder(tree[0]);
        System.out.println();

        // 후위 순회
        postOrder(tree[0]);
        System.out.println();
    }
}


