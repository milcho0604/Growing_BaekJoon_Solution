import java.util.*;
class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i < number.length(); i++){
            int temp = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum += temp;
        }
        answer = sum%9;
        return answer;
    }
}