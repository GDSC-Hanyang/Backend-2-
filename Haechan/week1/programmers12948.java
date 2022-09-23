import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class programmers12948 {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        StringBuffer sb = new StringBuffer() ;
        StringTokenizer st;
        String s = br.readLine() ;

        char[] chr = s.toCharArray() ;
        if (chr.length > 3 && chr.length < 21){
            for (int i = 1; i < chr.length-5; i++) {
                chr[i] = '*';
            }
            System.out.println(chr);
        }
    }
}
