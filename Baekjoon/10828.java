import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    
    public static int[] s;
    public static int size = 0;
    
    // push
    public static void push(int item) {
        s[size] = item;
        size++;
    }
    
    // pop
    public static void pop() {
        if (size == 0) {
            System.out.println(-1);
        } else {
            int v = s[size-1];
            s[size-1] = 0;
            size--;
            System.out.println(v);
        }
    }
    
    // size
    public static void size() {
        System.out.println(size);
    }
    
    // isEmpty
    public static void isEmpty() {
        if (size == 0) System.out.println(1);
        else System.out.println(0);
    }
    
    // top
    public static void top() {
        if (size == 0) System.out.println(-1);
        else System.out.println(s[size-1]);
    }
    
    public static void main(String[] args) throws IOException {
        int n;
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        s = new int[n+1];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            switch(st.nextToken()) {
                case "push" :
                    int value = Integer.parseInt(st.nextToken());
                    push(value);
                    break;
                case "pop" :
                    pop();
                    break;
                case "size" :
                    size();
                    break;
                case "empty" :
                    isEmpty();
                    break;
                case "top" :
                    top();
                    break;
            }
        }
    }
}
