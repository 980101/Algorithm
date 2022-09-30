import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    static boolean[] num = new boolean[10001];
    
    public static void main(String[] args) throws IOException {
        int t, tmp;
        
        // 소수 판별 배열
        num[1] = true;
        
        for (int i = 2; i <= 10000; i++) {
            if (num[i]) continue;
            
            for (int j = 2; i * j <= 10000; j++) {
                num[i*j] = true;
            }
        }
        
        // t 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            tmp = Integer.parseInt(br.readLine());
            
            int a = 0, b = 0, gap = 10000;
            
            for (int j = 2; j <= tmp / 2; j++) {
                
                // 첫 번째 숫자의 소수 판별
                if (num[j]) continue;
                
                int p = tmp - j;
                
                // 두 번째 숫자의 소수 판별
                if (num[p]) continue;
                
                if (p - j < gap) {
                    gap = p - j;
                    a = j;
                    b = p;
                }
            }
            
            System.out.printf("%d %d\n", a, b);
        }
    }
}
