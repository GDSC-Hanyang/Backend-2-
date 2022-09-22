class Solution {
    public String solution(String s) {
        String answer = "";
        int flag = 0;
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if (x==' '){
                flag = 0;
                answer += x;
                continue;
            } else if ('a'<=x && x<='z' && flag%2==0){
                x -= 32;
            } else if ('A'<=x && x<='Z' && flag%2==1){
                x += 32;
            }
            answer += x;
            flag++;
        }
        return answer;
    }
}