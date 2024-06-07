import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int l = st.length();
        int count = 0;

        for(int i=0; i<st.length(); i++){
            if(st.charAt(i) == 'A' || st.charAt(i) == 'B' || st.charAt(i)  == 'C' ){
                count +=3;
            } else if (st.charAt(i) == 'D' || st.charAt(i) == 'E' || st.charAt(i)  == 'F' ) {
                count +=4;
            } else if (st.charAt(i) == 'G' || st.charAt(i) == 'H' || st.charAt(i)  == 'I' ) {
                count +=5;
            } else if (st.charAt(i) == 'J' || st.charAt(i) == 'K' || st.charAt(i)  == 'L' ) {
                count +=6;
            } else if (st.charAt(i) == 'M' || st.charAt(i) == 'N' || st.charAt(i)  == 'O' ) {
                count +=7;
            } else if (st.charAt(i) == 'P' || st.charAt(i) == 'Q' || st.charAt(i)  == 'R' || st.charAt(i) == 'S' ) {
                count +=8;
            } else if (st.charAt(i) == 'T' || st.charAt(i)  == 'U' || st.charAt(i) == 'V') {
                count +=9;
            } else if (st.charAt(i) == 'W' || st.charAt(i)  == 'X' || st.charAt(i) == 'Y' || st.charAt(i)  == 'Z') {
                count +=10;
            }
        }
        System.out.println(count);
    }
}
