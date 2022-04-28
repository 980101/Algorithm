import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] records) {
        String[] answer = {};

        ArrayList<String> list = new ArrayList<>();

        String name;

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < records.length; i++) {   
            String[] record = records[i].split(" ");

            if (record.length == 3) map.put(record[1], record[2]);
        }

        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(" ");

            name = map.get(record[1]);

            switch(record[0]) {
                case "Enter" :
                    list.add(name + "님이 들어왔습니다.");
                    break;
                case "Leave" :
                    list.add(name + "님이 나갔습니다.");
                    break;
                default :
                    break;
            }
        }

        answer = new String[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
