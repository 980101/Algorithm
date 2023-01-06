import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        int n, m;    // 수의 개수, 출력 횟수
        int a, b;    // 시작 구간, 끝 구간
        int[] arr;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[n+1];
        
        // 누적합 구하기
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 1; i <= n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            arr[i] = arr[i-1] + tmp;
        }
        
        // 구간합 출력하기
        int[] answer = new int[m+1];
        
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            answer[i] = arr[b] - arr[a-1];
        }
        
        for (int i = 1; i <= m; i++) {
            System.out.println(answer[i]);
        }
    }
}
