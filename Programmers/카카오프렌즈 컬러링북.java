import java.util.Queue;
import java.util.LinkedList;

class Solution {
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    static int[][] picture;
    static boolean[][] visit;
    
    public int[] solution(int m, int n, int[][] info) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        // picture 값을 2차원 배열에 저장
        
        // 탐색
        int value, result;
        visit = new boolean[m][n];
        picture = info;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                value = picture[i][j];
                
                if (value != 0 && !visit[i][j]) {
                    
                    result = search(m, n, i, j);
                    
                    if (result > 0) numberOfArea++;
                    
                    if (result > maxSizeOfOneArea) maxSizeOfOneArea = result;
                    
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }
    
    public static int search(int m, int n, int i, int j) {
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        
        int cnt = 1;
        int value = picture[i][j];
        
        visit[i][j] = true;
        
        while (queue.size() != 0) {
            int[] idx = queue.remove();
            
            for (int t = 0; t < 4; t++) {
                int x = idx[0] + dx[t];
                int y = idx[1] + dy[t];
                
                if (x >= 0 && y >= 0 && x < m && y < n) {
                    if (!visit[x][y] && picture[x][y] == value) {
                        visit[x][y] = true;
                        cnt++;
                        queue.add(new int[]{x, y});
                    }
                }
            }   
        }
        
        return cnt;
    }
}
