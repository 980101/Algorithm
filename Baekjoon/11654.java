import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        // 문자 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char c = br.readLine().charAt(0);
        
        // 아스키 코드값 출력
        System.out.println((int)c);
    }
}