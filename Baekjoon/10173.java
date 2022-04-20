import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        String str;
        
        ArrayList<String> answers = new ArrayList<>();
        
        // 문자열 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        str = br.readLine();
        
        while (!str.equals("EOI")) {
            
            if (str.toUpperCase().matches(".*NEMO.*")) answers.add("Found");
            else answers.add("Missing");
            
            str = br.readLine();
        }
        
        for (String s: answers) {
            System.out.println(s);
        }
    }
}
