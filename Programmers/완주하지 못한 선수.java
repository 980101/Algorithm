import java.util.HashMap;
import java.util.Set;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String name, answer = "";
        
        // participant의 데이터를 hashmap으로 저장
        HashMap<String, Integer> p = new HashMap<>();
        
        for (String player : participant) { 
            p.put(player, p.getOrDefault(player, 0) + 1);
        }
        
        // hashmap에 완주자가 있는지 체크
        for (String player : completion) {
            p.put(player, p.get(player) - 1);
        }
        
        // 출력
        Set<String> keys = p.keySet();
        
        for (String key: keys)  {
            if (p.get(key) != 0) answer = key;
        }
        
        return answer;
    }
}