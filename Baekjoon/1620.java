import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        int n, m;
        
        // n (포켓몬 이름), m (맞춰야 하는 문제 수) 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        HashMap<String, String> map = new HashMap<>();
        
        // 포켓몬 이름 입력받기 (n번 반복)
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            String number = Integer.toString(i);
            
            map.put(name, number);
            map.put(number, name);
        }
        
        // 문제 맞추기
        for (int i = 0; i < m; i++) {
            String quiz = br.readLine();
            
            System.out.println(map.get(quiz));
        }
    }
}
