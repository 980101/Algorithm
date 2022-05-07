import java.io.*;

class Main {
    
    static int[][] resident = new int[15][15];
    
    public static void main(String[] args) throws IOException {
        int t, k, n;
        
        for (int i = 0; i <= 14; i++) {
            resident[0][i] = i;
            resident[i][0] = 0;
        }
        
        // t 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        t = Integer.parseInt(br.readLine());
        
        // k(층수), n(호수) 입력받기 (t번 반복) 
        for (int i = 0; i < t; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            
            for (int a = 1; a <= k; a++) {
                for (int b = 1; b <= n; b++) {
                    resident[a][b] = resident[a-1][b] + resident[a][b-1];
                }
            }
            
            System.out.println(resident[k][n]);
        }
    }
}
