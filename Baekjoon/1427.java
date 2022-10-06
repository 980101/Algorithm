import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    static int[] num;
    
    public static void main(String[] args) throws IOException {
        int size;
        String str;
        
        // n 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        size = str.length();
        
        num = new int[size];
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            num[i] = c - '0';
        }
        
        // 정렬하기
        insertion_sort(size);
        
        // 출력하기
        for (int i = 0; i < size; i++) {
            System.out.printf("%d", num[i]);
        }
    }
    
    public static void insertion_sort(int size) {
        int tmp, j;
        
        for (int i = 1; i < size; i++) {
            tmp = num[i];
            
            for (j = i - 1; j >= 0; j--) {
                if (num[j] < tmp) num[j+1] = num[j];
                else break;
            }
            
            num[j+1] = tmp;
        }
    }
}
