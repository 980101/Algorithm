class Solution {
    public int solution(String s) {
        int start, end, len, answer = 1000;
        String prev, tmp, result;
        int cnt;
        
        for (int i = 0; i < s.length(); i++) {  // 자르는 문자의 수
            
            prev = s.substring(0, i + 1);
            
            len = i + 1;
            
            start = len; 
            end = start + len;
            
            cnt = 1;
            result ="";
            
            while (end <= s.length()) { // 반복 횟수
                tmp = s.substring(start, end);
                
                // 이전 문자열과 같은지 체크
                if (prev.equals(tmp)) {
                    // 같다면, cnt ++
                    cnt++;
                } else {
                    // 다르다면, cnt = 0 이고 문자열 저장
                    
                    if (cnt == 1) result += prev;
                    else result += Integer.toString(cnt) + prev;
                    
                    prev = tmp;
                    
                    cnt = 1;
                }
                
                end += len;
                start += len;

            }
            
            if (cnt == 1) result += prev;
            else result += Integer.toString(cnt) + prev;
            
            end -= len;
            
            if (end < s.length()) result += s.substring(end, s.length());
            
            answer = answer > result.length() ? result.length() : answer;
        }
        
        return answer;
    }
}
