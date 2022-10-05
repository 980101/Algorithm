import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        int result3 = 0;
        double result1 = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] nums = new int[n];
        int[] result = new int[n];
        int[] cnt = new int[8001];
        
        ArrayList<Integer> arr = new ArrayList<>();
        

        // 카운트 정렬
        // 횟수 계산
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            
            nums[i] = tmp;
            result1 += tmp;
            
            tmp += 4000;            
            cnt[tmp]++;
            
            if (cnt[tmp] > result3) {
                result3 = cnt[tmp];
            }
        }
        
        // 누적 값 계산
        if (cnt[0] == result3) arr.add(-4000);
        
        for (int i = 1; i < 8001; i++) {
            if (cnt[i] == result3) {
                arr.add(i - 4000);
            }
            
            cnt[i] += cnt[i-1];
        }
        
       // 정렬하기
        for (int i = n-1; i >= 0; i--) {
            int idx = nums[i] + 4000;
            
            cnt[idx]--;
            result[cnt[idx]] = idx - 4000;
        }
        
        System.out.println(Math.round(result1 / n));
        System.out.println(result[n/2]);
        if (arr.size() > 1) System.out.println(arr.get(1));
        else System.out.println(arr.get(0));
        System.out.println(result[n-1] - result[0]);
    }
}
