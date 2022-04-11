import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        int min = 1000000, max = -1000000;
        
        // n 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        // 숫자 입력받기 (n번 반복)
        int[] nums = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        
        // 최소, 최대값 찾기 및 출력
        System.out.printf("%d %d", min, max);
    }
}