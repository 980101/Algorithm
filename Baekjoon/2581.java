import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    // 소수 체크 - 소수는 false 값
    static boolean[] num = new boolean[10001];
    
    public static void main(String[] args) throws IOException {
        int m, n, min = 10001, sum = 0;
        
        // 소수 판별
        num[1] = true;
        
        for (int i = 2; i <= 5000; i++) {
            if (num[i]) continue;
            
            for (int j = 2; i * j <= 10000; j++) {
                num[i*j] = true;
            }
        }
        
        // M, N 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        
        for (int i = m; i <= n; i++) {
            if (!num[i]) {
                sum += i;
                
                if (min > i) min = i;
            }
        }
        
        // 최솟값 및 합계 출력
        if (sum <= 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
