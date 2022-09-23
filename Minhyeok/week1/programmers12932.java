package test;

public class programmers12932 {

}class Solution {
    public long[] solution(long n) {
		String s=""+n;
		long[] answer = new long[s.length()];
		for (int i=0; i<s.length(); i++) {     
			answer[i]=(long)n%10;
			n/=10;
		}
		return answer;
	}
}
