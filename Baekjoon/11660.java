import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        int n, m, answer;
        int[][] prefixSum;
        
        // n, m 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        // 2차원 누적합 생성
        prefixSum = new int[n+1][n+1];
        
        for (int i = 1; i <= n; i++) {
            int tmp;
            
            st = new StringTokenizer(br.readLine(), " ");
            
            for (int j = 1; j <= n; j++) {
                tmp = Integer.parseInt(st.nextToken());
                
                prefixSum[i][j] = prefixSum[i-1][j] + prefixSum[i][j-1] - prefixSum[i-1][j-1] + tmp;
            }
        }

        // 구간합 계산 및 출력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            answer = prefixSum[x2][y2] - prefixSum[x2][y1-1] - prefixSum[x1-1][y2] + prefixSum[x1-1][y1-1];
            
            System.out.println(answer);
        }
    }
}
