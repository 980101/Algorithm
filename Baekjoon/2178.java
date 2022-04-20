import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    
    public static void main(String[] args) throws IOException {
        
        // n, m 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        visited = new boolean[n+1][m+1];
        
        // 미로정보 입력받기
        map = new int[n+1][m+1];
        
        for (int i = 1; i <= n; i++) {
            String tmp = br.readLine();
            
            for (int j = 1; j <= m; j++) {
                map[i][j] = tmp.charAt(j-1) - '0'; 
            }
        }
        
        // bfs
        bfs();
        
        // 답 출력하기
        System.out.println(map[n][m]);
    }
    
    public static void bfs() {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1, 1});
        
        visited[1][1] = true;
        
        while (queue.size() != 0) {
            int[] idx = queue.remove();
            
            for (int i = 0; i < 4; i++) {
                int tx = idx[0] + dx[i];
                int ty = idx[1] + dy[i];
                
                if (tx > 0 && ty > 0 && tx <= n && ty <= m) {
                    if (map[tx][ty] == 1 && !visited[tx][ty]) {
                        visited[tx][ty] = true;
                        queue.add(new int[]{tx, ty});
                        map[tx][ty] = map[idx[0]][idx[1]] + 1;
                    }
                }
            }    
        }
    }
}
