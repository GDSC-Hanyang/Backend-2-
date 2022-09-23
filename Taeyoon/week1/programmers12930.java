class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        //String answer = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                sb.append(' ');
                //answer += ' ';
                index = 0;
                continue;
            }
            else if (index % 2 == 0) {
                sb.append(Character.toString(s.charAt(i)).toUpperCase());
                //answer += Character.toString(s.charAt(i)).toUpperCase();
            }
            else{
                sb.append(Character.toString(s.charAt(i)).toLowerCase());
                //answer += Character.toString(s.charAt(i)).toLowerCase();
            }
            index++;
        }

        //return answer;
        return sb.toString();
    }
}