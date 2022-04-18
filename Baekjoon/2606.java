import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    static int answer = 0;
    
    public static void main(String[] args) throws IOException {
        int n, m;
        
        // n (컴퓨터 수), m (간선 수) 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[n+1];
        
        List<Integer>[] line = new ArrayList[n+1];
        
        for (int i = 1; i <= n; i++) {
            line[i] = new ArrayList<Integer>();
        }
        
        // 간선 쌍 입력받기
        StringTokenizer st;
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            
            line[i1].add(i2);
            line[i2].add(i1);
        }
        
        // bfs
        bfs(1, line, visited);
        
        // 연결된 컴퓨터 수 출력하기
        System.out.println(answer-1);
    }
    
    public static void bfs(int start, List<Integer>[] line, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<Integer>();
        
        visited[start] = true;
        queue.add(start);
        
        while(queue.size() != 0) {
            start = queue.remove();
            answer++;
            
            for (int next: line[start]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }             
            }
        }
    }
}