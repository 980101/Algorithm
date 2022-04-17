import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // n (정점의 개수), m (간선의 개수), v(시작할 정점의 번호) 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        
        boolean[] visited = new boolean[n+1];
        
        List<Integer>[] line = new ArrayList[n+1];
        
        for (int i = 1; i <= n; i++) {
            line[i] = new ArrayList<Integer>();
        }
        
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            
            line[i1].add(i2);
            line[i2].add(i1);
        }
        
        for (int i = 1; i <= n; i++) {
            Collections.sort(line[i]);
        }
        
        visited[v] = true;
        System.out.print(v + " ");
        dfs(v, line, visited);
        
        for (int i = 1; i <= n; i++) {
            visited[i] = false;
        }
        
        System.out.println();
        
        bfs(v, line, visited);
        System.out.println();
    }
    
    public static void bfs(int start, List<Integer>[] line, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<Integer>();
        
        queue.add(start);
        visited[start] = true;
        
        while (queue.size() != 0) {
            start = queue.remove();
            System.out.print(start + " ");
            for (int next: line[start]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
    
    public static void dfs(int start, List<Integer>[] line, boolean[] visited) {
        for (int next: line[start]) {
            if (!visited[next]) {
                System.out.print(next + " ");
                visited[next] = true;
                dfs(next, line, visited);
            }
        }
    }
}