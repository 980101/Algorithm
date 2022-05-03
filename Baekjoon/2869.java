import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        int a, b, v, tmp;
        
        // a, b, v 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        
        // 목표 지점에 도달할 때까지 반복
        tmp = (v - a) % (a - b);
        
        if (tmp == 0) System.out.println((v - a) / (a - b) + 1);
        else System.out.println((v - a) / (a - b) + 2);
    }
}
