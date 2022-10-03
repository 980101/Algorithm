import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[] scores;
    
    public static void main(String[] args) throws IOException {
        int n, k;
        
        // N, k 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        scores = new int[n];
        
        // 성적 정렬하기 (내림차순)
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        
        bubble_sort(n);
        
        // k - 1 번째 점수 출력하기
        System.out.println(scores[k-1]);
    }
    
    public static void bubble_sort(int size) {
        int tmp;
        
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (scores[i] < scores[j]) {
                    tmp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tmp;
                }
            }
        }
    }
}
