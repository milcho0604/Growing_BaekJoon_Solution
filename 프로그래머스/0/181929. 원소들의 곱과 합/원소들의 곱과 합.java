class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int axi = 0;
        int multi = 1;
        for(int i=0; i<num_list.length; i++){
            axi += num_list[i];
            multi *= num_list[i];
        }
        axi *= axi;
        System.out.println(axi);
        System.out.println(multi);
        if(axi > multi){
            answer =1;
        } else{
            answer =0;
        }
        return answer;
    }
}