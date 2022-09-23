import java.util.ArrayList;
import java.util.Scanner;

public class programmers12932 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in); //숫자 입력받는 공간

        ArrayList arr = new ArrayList() ;
        long test = sc.nextInt() ;
        long temp = test ;

        for (int i=0; i<10; i++ ) {
            test = test%10 ;
            arr.add(i, test) ;
            temp = temp/10 ;
            test = temp ;

            if (temp == 0 ) {
                break ;
            }
        }
        System.out.print(arr);
    }
}
