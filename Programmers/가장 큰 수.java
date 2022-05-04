import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        // numbers를 문자열 배열로 변경
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }
        
        // 정렬 - 두 가지 경우를 비교
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });
        
        // 0인 경우, 예외처리
        if (arr[0].equals("0")) return "0";
        
        // 출력
        for (String s: arr) answer += s;
        
        return answer;
    }
}
