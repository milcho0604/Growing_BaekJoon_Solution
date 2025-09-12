class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        int tempA = Integer.parseInt(str1 + str2);
        int tempB = Integer.parseInt(str2 + str1);
        if(tempA >tempB){
            answer = tempA;
        } else{
            answer = tempB;
        }
        
        return answer;
    }
}