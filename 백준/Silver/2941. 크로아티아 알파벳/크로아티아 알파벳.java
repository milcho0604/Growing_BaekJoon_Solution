import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String st = br.readLine();
        int len = st.length();

        for (int i = 0; i < len; i++) {
            char ch = st.charAt(i);
            if (ch == 'c' && i < len - 1) {
                if (st.charAt(i + 1) == '=' || st.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (ch == 'd' && i < len - 1) {
                if (i < len - 2 && st.charAt(i + 1) == 'z' && st.charAt(i + 2) == '=') {
                    i += 2;
                } else if (st.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (ch == 'l' && i < len - 1) {
                if (st.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (ch == 'n' && i < len - 1) {
                if (st.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (ch == 's' && i < len - 1) {
                if (st.charAt(i + 1) == '=') {
                    i++;
                }
            } else if (ch == 'z' && i < len - 1) {
                if (st.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
