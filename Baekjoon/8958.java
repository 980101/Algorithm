import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        int n, score, answer = 0;
        String result;
        
        // n 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        // 퀴즈결과 입력받기 (n번 반복)
        for (int i = 0; i < n; i++) {
            result = br.readLine();
            answer = 0;
            score = 1;
            
            for (int j = 0; j < result.length(); j++) {
                
                // 값이 O 이면, 점수 계산하기
                if (result.charAt(j) == 'O') {
                    answer += score;
                    score++;
                } else {
                    score = 1;
                }
            }
            
            System.out.println(answer);
        }
    }
}