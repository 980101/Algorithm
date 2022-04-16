import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    
    public int solution(String[][] clothes) {
        int size, s_key = 0, answer = 1;
        boolean[] visited;
        
        // 의상 종류별, 의상 이름 정리
        HashMap<String, ArrayList<String>> sort = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            String[] item = clothes[i];
            
            // 해당 종류가 있다면,
            if (sort.containsKey(item[1])) {
                ArrayList<String> tmp_name = sort.get(item[1]);
                tmp_name.add(item[0]);
                
                sort.put(item[1], tmp_name);
            } else {    // 없다면,
                ArrayList<String> names = new ArrayList<>();
                names.add(item[0]);
                
                sort.put(item[1], names);
            }
        }
        
        // 의상 종류의 수만큼 조합 구하기
        ArrayList<Integer> s_value = new ArrayList<>();
        
        sort.forEach((key, value) -> {
            s_value.add(value.size());
        });
        
        for (int temp: s_value) {
            answer *= (temp + 1);
        }
        
        return answer - 1;
    }
}