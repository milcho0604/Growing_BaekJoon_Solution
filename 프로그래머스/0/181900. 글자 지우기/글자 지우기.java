import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            list.add(String.valueOf(my_string.charAt(i)));
        }
        Arrays.sort(indices);
        for(int i=0; i<indices.length; i++){
            int temp = indices[i];
            list.set(temp, "split");
        }
        for(int i=0; i<list.size(); i++){
            if(!list.get(i).equals("split")){
                sb.append(list.get(i));
            }
        }
        
        return sb.toString();
    }
}