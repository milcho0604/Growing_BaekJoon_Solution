import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char answer[] = new char[a.length()];
        for(int i=0; i< a.length(); i++){
            char ch = a.charAt(i);
            if(Character.isUpperCase(ch)){
                answer[i] = Character.toLowerCase(ch);
            } else{
                answer[i] = Character.toUpperCase(ch);
            }
        }
        System.out.println(answer);
    }
}