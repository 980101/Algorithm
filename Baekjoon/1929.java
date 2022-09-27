import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        int m, n;
        
        // M, N 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        
        // 소수 판별
        for (int i = m; i <= n; i++) {
            check_prime(i);
        }
    }
    
    public static void check_prime(int num) {
        if (num == 1) return;
        
        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) return;
        }
        
        System.out.println(num);
    }
}
