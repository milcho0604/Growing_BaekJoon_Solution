class Solution {
    public int[] solution(int n, int k) {
        // List<Integer> list = new ArrayList<>();
        int len = n/k;
        int answer[] = new int[len];
        int temp = 0;
        for(int i=1; i<=n; i++){
            if(i%k == 0){
                answer[temp] = i;
                temp++;
            }
        }
        
        return answer;
    }
}