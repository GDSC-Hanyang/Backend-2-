package Week02.sol;

public class programmers12948 {
	public String solution(String phone_number) {
        phone_number = "027778888";
        String[] intArray = phone_number.split("");
		String[] answer_Arr = new String[phone_number.length()];
		for(int i=intArray.length - 1, j = 0;i>=0;i--,j++) {
			if(j < 4) {
				answer_Arr[j] = intArray[i]; 
			} else {
				answer_Arr[j] = "*";
			}
		}
		
		// 나온 출력값 문자열 변환 후 역순 출력
		String answer_str = String.join("", answer_Arr);
		StringBuffer sb = new StringBuffer(answer_str);
		String answer = sb.reverse().toString();
        return answer;
    }
}
