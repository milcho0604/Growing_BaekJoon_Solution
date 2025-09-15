class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length-1;
        int[] answer = new int[len+2];
        int temp = 0;
        if(num_list[len] > num_list[len-1]){
            temp = num_list[len] - num_list[len-1];
        } else{
            temp = num_list[len] *2;
        }
        for(int i=0; i < answer.length; i++){
            if(i > len){
                answer[i] = temp;
            } else{
                answer[i] = num_list[i];                
            }
        }
        return answer;
    }
}