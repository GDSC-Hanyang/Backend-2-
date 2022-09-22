class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        int concealedLength = length - 4;
        
        for(int i = 0; i < length; i++) {
            if(i > concealedLength - 1) {
                answer += phone_number.charAt(i);
            }
            else {
                answer += '*';
            }
        }
        return answer;
    }
}