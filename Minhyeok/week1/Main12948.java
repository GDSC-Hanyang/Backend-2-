package test;

import java.util.Arrays;
import java.util.Scanner;
public class Main12948 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		String pn=sc.next();
		String answer="";
		int l=pn.length();
		for (int i=0; i<l-4;i++){
			answer+="*";	
		}
		String last= pn.substring(l-4,l);
		answer+=last;		
		System.out.println(answer);		
	}

}
