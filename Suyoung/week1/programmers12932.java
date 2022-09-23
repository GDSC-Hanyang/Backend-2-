class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        
        int[] answer = new int[sb.length()];
        String[] s = sb.toString().split("");
        
        for(int i = 0; i < sb.length(); ++i){
            answer[i] = Integer.parseInt(s[i]);
        }
        return answer;
    }
}
