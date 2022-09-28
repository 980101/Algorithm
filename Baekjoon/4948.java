import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
    
public class Main {
    // 소수 배열 - 소수라면, false
    static boolean[] num = new boolean[246913];
    
    public static void main(String[] args) throws IOException {
        int tmp, answer;
        
        // 소수 배열
        num[1] = true;
        
        for (int i = 2; i <= Math.sqrt(246912); i++) {
            if (num[i]) continue;
            
            for (int j = 2; i * j <= 246912; j++) {
                num[i*j] = true;
            }
        }
        
        // 0이 입력될 때 까지
        // n 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        tmp = Integer.parseInt(br.readLine());
        
        while (tmp != 0) {
            // n ~ 2n 사이의 소수 찾기
            answer = 0;
            
            for (int i = tmp+1; i <= 2*tmp; i++) {
                if (!num[i]) answer++;
            }
            
            System.out.println(answer);
            
            tmp = Integer.parseInt(br.readLine());
        }
    }
}
