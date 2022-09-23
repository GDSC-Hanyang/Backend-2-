import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class programmers12930 {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        StringBuffer sb = new StringBuffer() ;
        StringTokenizer st;
        String s = br.readLine() ;
        int temp = 0 ;
        String up = s.toUpperCase() ;
        String low = s.toLowerCase() ;
        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ') ;
                temp = 0 ;
            } else {
                if (temp % 2 ==0) {
                    sb.append(up.charAt(i)) ;
                    temp ++ ;
                } else {
                    sb.append(low.charAt(i)) ;
                    temp ++ ;
                }
            }
        }
        String answer = sb.toString() ;
        System.out.println(answer);
    }
}
