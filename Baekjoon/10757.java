import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        // a, b 입력받기
        BigInteger a, b;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        a = new BigInteger(st.nextToken());
        b = new BigInteger(st.nextToken());
        
        // a + b 출력하기
        System.out.println(a.add(b));
    }
}
