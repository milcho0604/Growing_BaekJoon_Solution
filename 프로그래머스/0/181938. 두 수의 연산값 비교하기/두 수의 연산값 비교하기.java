class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int tempA = 2 * a * b;
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        int tempB = Integer.parseInt(str1 + str2);
        if(tempA > tempB){
            answer = tempA;
        } else{
            answer = tempB;
        }
        return answer;
    }
}