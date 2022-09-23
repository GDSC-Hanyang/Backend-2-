package test;
import java.util.Stack;
public class programmers12930 {
	
	class Solution {
	    public String solution(String a) {    
			Stack<String> stack= new Stack<>();
			int alen= a.length();
			for (int i=0; i<alen; i++) {
				char each= a.charAt(i);		
				String eachh=Character.toString(each);
				stack.push(eachh);
			}
			
			int cnt=0;
			for (int i=0; i<alen; i++) {
				if(stack.peek().equals(" ")) {
					cnt++;
					stack.pop();
				}
				else {
					break;
				}
			}
			String srr[]=a.split(" ");
			int slen= srr.length;
			Stack<String> stack1= new Stack<>();
			Stack<String> stack2= new Stack<>();
			for (int i=0; i<slen; i++) {
				String ist=srr[i];			
				for (int j=0; j<ist.length(); j++) {
					char jch=ist.charAt(j);
					int num=(int)jch;
					
					if (j%2==0){
						if(96<num && num<123) {
							num-=32;
							char rp= (char)num;
							String rpp="";
							rpp= Character.toString(rp);
							stack1.push(rpp);
						}
						else {
							String rpp="";
							rpp= Character.toString(jch);
							stack1.push(rpp);
						}
					}
					else {
						if(64<num && num<91) {
							num+=32;
							char rp= (char)num;
							String rpp="";
							rpp= Character.toString(rp);
							stack1.push(rpp);
						}
						else {
							String rpp="";
							rpp= Character.toString(jch);
							stack1.push(rpp);
						}
					}								
				}
				String join= String.join("", stack1);
				stack2.push(join);
				stack1.clear();
			}
			String join= String.join(" ", stack2);
			for(int i=0; i<cnt; i++) {
				join+=" ";
			}
			return(join);
	    }
	}

}
