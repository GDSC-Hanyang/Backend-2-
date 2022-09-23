package test;

public class programmer12948 {
	class Solution {
	    public String solution(String pn) {
	        int l= pn.length();
	        String answer= "";
	        for (int i=0; i<l-4; i++){
	            answer+="*";
	        }
	        String last = pn.substring(l-4,l);
	        answer+=last;
	        return answer;
	    }
	}
}
