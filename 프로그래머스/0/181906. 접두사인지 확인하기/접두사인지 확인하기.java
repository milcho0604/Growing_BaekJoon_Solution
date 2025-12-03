class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.length() < is_prefix.length()){
            return 0;
        }
        for(int i=0; i<is_prefix.length(); i++){
            String a = String.valueOf(my_string.charAt(i));
            String b = String.valueOf(is_prefix.charAt(i));
            if(a.equals(b)){
                answer = 1;
            } else{
                answer = 0;
                return 0;
                
            }
        }
        return answer;
    }
}