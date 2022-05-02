import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 두 수가 세자리 수가 아닐 경우도 포함하는 코드

class Main {
    public static void main(String[] args) throws IOException {
        String a, b;
        String reversedA = "", reversedB = "";
        
        // 두 수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        a = st.nextToken(); b = st.nextToken(); 
        
        // 두 수의 위치를 반전
        
        for (int i = a.length() - 1; i > -1; i--) {
            reversedA += a.charAt(i);
        }
        
        for (int i = b.length() - 1; i > -1; i--) {
            reversedB += b.charAt(i);
        }
        
        // 크기 비교 및 큰수 출력    
        if (Integer.parseInt(reversedA) > Integer.parseInt(reversedB)) {
            System.out.println(Integer.parseInt(reversedA));
        } else {
            System.out.println(Integer.parseInt(reversedB));
        }
    }
}
