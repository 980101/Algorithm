import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        
        int max = 0;
        String answer = "";
        char[][] chars = new char[5][15];
        
        // 문자열 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 각 문자 추출 및 2차원배열에 저장
        for (int i = 0; i < 5; i++) {

            String str = br.readLine();
            
            int size = str.length();
            
            if (max < size) max = size;
            
            for (int j = 0; j < 15; j++) {
                if (j < size) {
                    chars[i][j] = str.charAt(j);
                } else {
                    chars[i][j] = '!';
                }    
            }
        }
        
        // 출력하기
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (chars[j][i] == '!') continue;
                
                answer += chars[j][i];
            }
        }
        
        System.out.println(answer);
    }
}
