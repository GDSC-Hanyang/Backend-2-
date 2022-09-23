class Solution {
    public String solution(String phone_number) {
        //StringBuffer sb = new StringBuffer();
        String answer = "";
        int len = phone_number.length();

        for(int i=0;i<len-4;i++){
            answer += '*';
            //sb.append('*');
        }
        for(int j=len-4;j<len;j++){
            answer += phone_number.charAt(j);
            //sb.append(phone_number.charAt(j));
        }
        return answer;
        //return sb.toString();
    }
}