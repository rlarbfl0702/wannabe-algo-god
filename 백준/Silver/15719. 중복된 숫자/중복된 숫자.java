import java.io.*;

public class Main {
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1 << 16]; // 64KB 버퍼
    static int len = 0, ptr = 0;

    // 버퍼에서 바이트 하나 읽기
    static int readByte() throws IOException {
        if (ptr >= len) {
            len = in.read(buffer);
            ptr = 0;
            if (len <= 0) return -1;
        }
        return buffer[ptr++];
    }

    // 정수 입력 파서
    static int readInt() throws IOException {
        int c, n = 0;
        do { c = readByte(); } while (c <= ' ' && c != -1); // 공백 스킵
        boolean neg = false;
        if (c == '-') { neg = true; c = readByte(); }
        while (c > ' ') {
            n = n * 10 + (c - '0');
            c = readByte();
        }
        return neg ? -n : n;
    }

    public static void main(String[] args) throws Exception {
        int N = readInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += readInt();
        }
        long expected = (long)(N - 1) * N / 2;
        System.out.println(sum - expected);
    }
}
