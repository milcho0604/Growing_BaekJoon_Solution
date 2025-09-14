import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i < num_list.length; i++){
            if(num_list[i]%2 == 0){
                sb1.append(num_list[i]);
            } else{
                sb2.append(num_list[i]);
            }
        }
        String str1 = String.valueOf(sb1);
        String str2 = String.valueOf(sb2);
        int n = Integer.parseInt(str1);
        int m = Integer.parseInt(str2);
        answer = n+m;
        return answer;
    }
}