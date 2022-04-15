import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        
        int c, n;
        int s = 0, average = 0;
        int[] scores;
        
        // c 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        c = Integer.parseInt(br.readLine());
        
        // n 과 점수들 입력받기 (c번 반복)        
        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            n = Integer.parseInt(st.nextToken());
            
            scores = new int[n];
            
            // 평균 계산
            for (int j = 0; j < n; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                average += scores[j];
            }
            
            average /= n;
            
            // 평균이 넘는 점수를 카운트
            for (int score: scores) {
                if (score > average) s += 1;
            }
            
            // 비율 계산
            double result = (s * 1.0) / n * 100;
            
            System.out.println(String.format("%.3f", result) + "%");
            
            average = 0;
            s = 0;
        }
    }
}