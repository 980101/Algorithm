import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        
        // 윷짝 상태 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        // 상태 체크
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int sum = 0;
            
            for (int j = 0; j < 4; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                
                sum += tmp;
            }
            
            // 출력
            if (sum == 0) {   
                System.out.println("D");    // 윷
            } else if (sum == 1) {
                System.out.println("C");    // 걸
            } else if (sum == 2) {
                System.out.println("B");    // 개
            } else if (sum == 3) {
                System.out.println("A");    // 도
            } else {
                System.out.println("E");    // 모
            }
        }
    }
}
