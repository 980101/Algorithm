import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    // 소수 배열 - 소수라면, false임
    static boolean[] num = new boolean[10000001];
    
    public static void main(String[] args) throws IOException {
        int n;
        
        // N 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
         
        // N이 1일 경우 예외처리
        if (n != 1) {
            // 소수
            num[1] = true;
        
            for (int i = 2; i <= n; i++) {
                if (num[i]) continue;
            
                for (int j = 2; i * j <= n; j++) {
                    num[i*j] = true;
                }
            }
        
            // 제일 작은 소수부터 나누기
            for (int i = 2; i <= n; i++) {
            
                // N이 1이라면 끝
                if (n == 1) break;
            
                // 소수값 할당
                int tmp;
            
                if (!num[i]) tmp = i;
                else continue;
            
                // N이 1이 아니라면, 소수 출력
                while(n % tmp == 0) {
                    // 답 출력하기
                    System.out.println(tmp);
                    n /= tmp;
                }
            }
        }
    }
}
