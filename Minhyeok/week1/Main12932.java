package test;

import java.util.Arrays;
import java.util.Scanner;


public class Main12932 {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	long n=sc.nextLong();
    	String s=""+n;
		long[] answer = new long[s.length()];
		for (int i=0; i<s.length(); i++) {            
			answer[i]=(long)n%10;
			n/=10;
		}
		System.out.println(Arrays.toString(answer));
    }
    	
}