import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Arrays.sort(reserve);
        for(int i : lost){
            lostSet.add(i);
        }
        for(int i=0; i<reserve.length; i++){
            if(lostSet.contains(reserve[i])){
                lostSet.remove(reserve[i]);
                reserve[i]= -1;
            }
        }
        for(int i=0; i<reserve.length; i++){
            if(reserve[i] == -1) continue;
            if(lostSet.contains(reserve[i]-1)){
                lostSet.remove(reserve[i]-1);
            } else if (lostSet.contains(reserve[i]+1)) {
                lostSet.remove(reserve[i]+1);
            }
        }
        return(n- lostSet.size());
    }
}