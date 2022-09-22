import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N>0){
            ArrayList<Integer> arr = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<10; i++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arr);
            System.out.println(arr.get(7));
            N--;
        }
    }
}