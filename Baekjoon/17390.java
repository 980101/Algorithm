import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    
    public static void main(String[] args) throws IOException {
        int n, q;    // 수열의 길이, 질문 개수
        int l, r;    // 시작 구간, 끝 구간
        int[] arr;    // 수열
        int[] answer;    // 답
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        n = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        
        // 수열 입력받기
        arr = new int[n+1];
        
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        // 누적합 구하기
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        
        // 구간합 구하기
        answer = new int[q+1];
        
        for (int i = 1; i <= q; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            l = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            
            answer[i] = arr[r] - arr[l-1];
        }
        
        // 출력하기
        for (int i = 1; i <= q; i++) {
            System.out.println(answer[i]);
        }
    }
}
