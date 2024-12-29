import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            String st = sc.next();
            for(int j=0; j<st.length(); j++){
                for (int k =0; k<m; k++){
                    System.out.print(st.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
