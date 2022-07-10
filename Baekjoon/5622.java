import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    static char list[][] = {{'A', 'B', 'C', '0'},
                     {'D', 'E', 'F', '0'},
                     {'G', 'H', 'I', '0'},
                     {'J', 'K', 'L', '0'},
                     {'M', 'N', 'O', '0'},
                     {'P', 'Q', 'R', 'S'},
                     {'T', 'U', 'V', '0'},
                     {'W', 'X', 'Y', 'Z'}};
        
    public static void main(String[] args) throws IOException {
        int answer = 0;
        String str;
        
        // 문자열 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        str = br.readLine();
        
        // 첫 번째 자리 수부터 해당되는 숫자 찾기
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            
            answer += search(tmp);
            answer += 1;
        }
        
        System.out.println(answer);
    }
    
    public static int search(char c) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if (list[i][j] == c) return i + 2;
            }
        }
        return 0;
    }
}
