import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        int h, m;
        
        // h, m 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        // 시간계산하기
        // 1. h를 m으로 환산
        if (h == 0) h = 24;
        
        m += (h * 60);
        
        // 2. m - 45
        m -= 45;
        
        // h:m 형태로 환산
        h = m / 60;
        m = m % 60;
        
        // 출력하기
        if (h >= 24) h -= 24;
        
        System.out.printf("%d %d", h, m);
    }
}
