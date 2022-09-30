package Week02.sol;

public class programmers12930 {
	 public String solution(String s) {
	        s = "TRY HELLO WORLD";
	        String answer = "";
	        
	        char[] arr = new char[s.length()];
			for(int i = 0;i < s.length();i++) {
				if(i % 2 != 0) {
					String s_upper = s.toLowerCase();
					arr[i] = s_upper.charAt(i);
				} else {
					String s_lower = s.toUpperCase();
					arr[i] = s_lower.charAt(i);
				}
				answer += Character.toString(arr[i]);
			}
	        
	        return answer;
	    }
}
