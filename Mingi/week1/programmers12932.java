package Week02.sol;

public class programmers12932 {
	 public int[] solution(long n) {
	        n = 12345;
	        String input = String.valueOf(n);
	        
	        String[] arr = input.split("");
			int[] answer = new int[arr.length];
			for(int i = arr.length - 1,j=0;i >= 0;i--,j++) {
				int num = Integer.valueOf(arr[i]);
	            answer[j] = num;
			}
	        
	        
	        return answer;
	    }
}
