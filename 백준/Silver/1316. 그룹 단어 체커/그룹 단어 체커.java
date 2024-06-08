import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++){
            if(dis()== true){
                count ++;
            }
        }
        System.out.println(count);
    }

    public static boolean dis() throws IOException {
        boolean[] bl = new boolean[26]; // default false
        int before = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char after = str.charAt(i); // 하나씩 검사하기 위해
            if (before != after) { // before와 after가 다른 경우에만 조건문 실행(검사)
                if(bl[after - 'a'] == false){   // 논리 : 처음나오는 단어라면 무조건 false임. -> a의 아스키 코드는 97.
                    bl[after - 'a'] = true;     // 여기서 after의 문자를 c라고 가정하면, c-a = 99-97 = 2임. 여기서 2는
                    before = after;             // bollean배열 안에 들어있는 26개 인덱스에서 2번 인덱스(0,1,2)를 말함.
                                                // bl[2] = c이므로 c == default false이므로 bl[c]를 true로 변경해줌
                                                // 이 과정을 통해 c는 방문했던 것으로 인식. true
                }else return false;

            }
        }
        return true;
    }

}

