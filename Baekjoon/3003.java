import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        // 킹, 퀸, 룩, 비숏, 나이트, 폰의 개수
        // 입력받기
        int tmp;
        String chess, answer = "";
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        chess = br.readLine();
        
        StringTokenizer st = new StringTokenizer(chess, " ");
        
        tmp = Integer.parseInt(st.nextToken());
        answer += (1 - tmp) + " ";
        
        tmp = Integer.parseInt(st.nextToken());
        answer += (1 - tmp) + " ";
        
        tmp = Integer.parseInt(st.nextToken());
        answer += (2 - tmp) + " ";
        
        tmp = Integer.parseInt(st.nextToken());
        answer += (2 - tmp) + " ";
        
        tmp = Integer.parseInt(st.nextToken());
        answer += (2 - tmp) + " ";
        
        tmp = Integer.parseInt(st.nextToken());
        answer += (8 - tmp);
        
        // 답 출력하기
        System.out.println(answer);
    }
}
