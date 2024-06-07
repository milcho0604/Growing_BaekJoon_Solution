import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String st = br.readLine();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == 'c' && i < st.length() - 1) {
                if (st.charAt(i + 1) == '=' || st.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (ch == 'd' && i < st.length() - 1) {
                if (i < st.length() - 2 && st.charAt(i + 1) == 'z' && st.charAt(i + 2) == '=') {
                    i += 2;
                } else if (st.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (ch == 'l' && i < st.length() - 1) {
                if (st.charAt(i + 1) == 'j') {
                    i++;
                }

            } else if (ch == 'n' && i < st.length() - 1) {
                if (st.charAt(i + 1) == 'j') {
                    i++;
                }

            } else if (ch == 's' && i < st.length() - 1) {
                if (st.charAt(i + 1) == '=') {
                    i++;
                }

            } else if (ch == 'z' && i < st.length() - 1) {
                if (st.charAt(i + 1) == '=') {
                    i++;
                }

            }
            count++;
        }
        System.out.println(count);
    }
}
