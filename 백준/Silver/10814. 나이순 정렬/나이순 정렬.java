import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String arr[][] = new String[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0]= sc.next();
            arr[i][1]= sc.next();
            arr[i][2]= String.valueOf(i);
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int age = Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
                if (age != 0) {
                    return age;
                } else {
                    return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                }
            }
        });

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}