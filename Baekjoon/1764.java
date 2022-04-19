import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        int n, m, answer = 0;
        ArrayList<String> list = new ArrayList<>();
        
        // n (듣지 못한 자), m (보지 못한 자) 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 이름 입력받기 (n번 반복, hashmap 저장)
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), i);
        }
        
        // 이후 이름이 hashmap에 있는지 체크
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            
            // 있다면, 답 +1과 이름 저장
            if (map.containsKey(name)) {
                answer++;
                list.add(name);
            }
        }
        
        // 출력하기
        System.out.println(answer);
        
        Collections.sort(list);
        
        for(String name: list) {
            System.out.println(name);
        }
    }
}
