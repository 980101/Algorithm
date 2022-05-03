import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int days, num;
        
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};
        
        // 작업이 완료되는 날[day]의 수 계산
        // 및 queue에 enqueue
        Queue<Integer> que = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            days = 1;
            
            while (true) {
                if (100 - progresses[i] <= speeds[i] * days) break;
                
                days++;
            }
            
            que.add(days);
        }
        
        // queue가 빌 때까지 반복
        days = que.poll(); num = 1;
        
        while(que.size() > 0) {
            
            // 맨 앞의 값보다 같거나 작은 경우는 dequeue
            if (days < que.peek()) {
                days = que.poll();
                list.add(num);
                
                num = 1;
            } else {
                que.poll();
                num++;
            }
        }
        
        list.add(num);
        
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
