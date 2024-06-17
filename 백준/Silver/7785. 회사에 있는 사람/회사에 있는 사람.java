import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,String> myMap = new HashMap<>();
        for(int i=0; i<n; i++){
            String name = sc.next();
            String vu = sc.next();
            myMap.put(name,vu);
            if(myMap.get(name).equals("leave")){
                myMap.remove(name);
            }
        }
        List<String> myList = new ArrayList<>();
        for(String key : myMap.keySet()){
            myList.add(key);
        }
        Collections.sort(myList, Collections.reverseOrder());
        for(int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}