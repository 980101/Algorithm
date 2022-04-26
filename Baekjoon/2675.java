import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        int n, r;
        String s, p, tmp;
        
        // n 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        // r 및 s 입력받기 (n 번 반복)
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            r = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            
            // 새로운 문자열 p를 출력하기
            
            p = "";
            
            for (int j = 0; j < s.length(); j++) {
                
                for (int z = 0; z < r; z++) {
                    p += s.charAt(j);
                }
            }
            
            System.out.println(p);
        }
    }
}
