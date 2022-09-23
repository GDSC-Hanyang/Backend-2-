class Solution {
    public String solution(String s) {
        int length = s.length();
        char[] charArr = s.toCharArray();
        int n = 0;
        for(int i = 0; i < length; i++) {
            if(charArr[i] == ' ') {
                n = 0;
            }
            else {
                if(n % 2 == 0) {
                    charArr[i] = Character.toUpperCase(charArr[i]);
                }
                else {
                    charArr[i] = Character.toLowerCase(charArr[i]);
                }
            n++;
            }
            
        }
        String answer = new String(charArr);
        return answer;
    }
}