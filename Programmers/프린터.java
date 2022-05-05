import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    
    static Object[] nums;
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 우선순위 큐 및 알파벳 큐 생성 - 동시 동작
        Queue<Integer> priority = new LinkedList<>();
        Queue<Character> name = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            priority.add(priorities[i]);
        }
        
        for (int i = 0; i < priorities.length; i++) {
            name.add((char)(i + 65));
        }
        
        // location의 숫자[우선순위, p] 및 알파벳 저장 
        int p = priorities[location];
        char c = (char)(location + 65);
        
        // 우선순위 큐의 top값과 p 비교
        while (priority.size() != 0) {
            int tmp = priority.poll();
            char c_tmp = name.poll();
            
            nums = priority.toArray();
            
            // 뒤에 더 큰 값이 있는지 체크
            if (checkBigger(tmp)) {
                // 있으면, 우선순위 큐 및 알파벳 큐에 enqueue
                priority.add(tmp);
                name.add(c_tmp);
            } else {
                // 없으면, answer + 1
                answer++;
                
                // 이때 location 값인지 체크
                if (c_tmp == c) break;
            }
        }
            
        return answer;
    }
    
    public static boolean checkBigger(int n) {
        boolean re = false;
        
        Arrays.sort(nums);
        
        for (int i = nums.length - 1; i > -1; i--) {
            if ((int)nums[i] > n) return true;
        }
        
        return re;
    }
}
