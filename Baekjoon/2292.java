import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        int n, tmp = 1, cnt = 1;
        
        // n 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        // 1 layer 마다 +6
        
        // 출력하기
        if (n == 1) {
            System.out.println(1);
            return;
        }
        
        while (tmp < n) {
            tmp += cnt * 6;
            cnt++;
        }
        
        System.out.println(cnt);
    }
}
