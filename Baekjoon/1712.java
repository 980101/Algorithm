// A : 고정비용, B : 노트북 생산비(1대), C : 노트북 가격

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        
        // A, B, C 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        
        // (생산 대수) = A / C - B
        
        // 생산 대수 출력하기
        if (b >= c) {
            System.out.println(-1);
            return;
        }
        
        System.out.println(a / (c-b) + 1);
    }
}
