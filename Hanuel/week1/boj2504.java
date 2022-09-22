import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> s = new Stack<>();
        int ans = 0;
        int tmp = 1;

        for(int i=0; i<input.length(); i++){
            char x = input.charAt(i);
            if(x=='(') {
                s.push(x);
                tmp *= 2;
            } else if (x=='[') {
                s.push(x);
                tmp *= 3;
            } else if (x==')') {
                if ((s.isEmpty()) || (s.peek()=='[')) {
                    ans = 0;
                    break;
                }
                if (input.charAt(i-1)=='(') {
                    ans += tmp;
                }
                s.pop();
                tmp = tmp/2;
            } else {
                if ((s.isEmpty()) || (s.peek()=='(')) {
                    ans = 0;
                    break;
                }
                else if (input.charAt(i-1)=='[') {
                    ans += tmp;
                }
                s.pop();
                tmp = tmp/3;
            }
        }
        if (s.isEmpty()) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}