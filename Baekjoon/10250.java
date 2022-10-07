import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        int t, h, w, n;
        int room;
        
        // t 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        t = Integer.parseInt(br.readLine());
        
        // h, w, n 입력받기 (t번 반복)
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            
            // room은 YYXX 형태
            
            // YY = n % h (이때 0이면, h[높이]로 치환)
            // XX = n / h + 1 (이때 10보다 작으면 앞에 0을 붙임)
            
            if (n % h == 0) {
                room = h * 100;
                room += n / h;
            } else {
                room = (n % h) * 100;
                room += (n / h) + 1;
            }
            
            System.out.println(room);
        }
    }
}
