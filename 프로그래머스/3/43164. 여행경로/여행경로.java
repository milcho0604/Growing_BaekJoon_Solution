import java.util.*;
class Solution {
    static boolean visited[];
    static List<String> myList = new ArrayList<>();
    static Stack<String> temp;
    static String[] answer;
    public String[] solution(String[][] tickets) {
        answer = new String[tickets.length];
        temp = new Stack<>();
        visited = new boolean[tickets.length];
        int line = 0;
        temp.add("ICN");
        dfs(line, "ICN", tickets);
        Collections.sort(myList);
//        System.out.println(myList);
//        answer = myList;
        // System.out.println(myList);
        answer = myList.toArray(new String[0]);
        // System.out.println(Arrays.deepToString(answer));
        return answer;
    }

    private static void dfs(int line, String now, String[][] tickets) {
        if (line == tickets.length) {
//            myList.add(Arrays.toString(temp));
//            myList.add(String.valueOf(temp));
            myList.add(String.join(",", temp));
//            answer = temp.toArray(new String[0]);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(now)) {
                visited[i] = true;
//                temp[i]= tickets[i][1];
                temp.add(tickets[i][1]);
                dfs(line + 1, tickets[i][1], tickets);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
    
    
}