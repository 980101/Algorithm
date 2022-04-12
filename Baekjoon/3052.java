import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        int num, answer = 0;
        boolean[] rest = new boolean[42];
            
        // 10개의 수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < 10; i++) {
            num = Integer.parseInt(br.readLine());
            
            // 42로 나눈 나머지 계산 및 카운트
            if (!rest[num%42]) {
                answer++;
            }
            
            rest[num%42] = true;
        }
            
        // 결과 출력
        System.out.println(answer); 
    }
}