import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int x, n, a, b, tmp;
        
        // X, N 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        x = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        
        // a, b 입력받기 + 총 금액 계산하기 (N번 반복)
        tmp = 0;
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            tmp += a * b;
        }
        
        // X와 비교 후, 결과 출력
        if (tmp == x) System.out.println("Yes");
        else System.out.println("No");
    }
}
