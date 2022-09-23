class Solution {
    public String solution(String s) {
        String answer = "";
        int counter = -1;
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if((s.charAt(i)) == ' ') {
                counter = -1;
                System.out.println(counter);
                answer += s.charAt(i);
            }
            else {
                counter += 1;
            }
            
            if(counter != -1) {
                if((counter % 2) == 0) {
                    answer += Character.toUpperCase(s.charAt(i));
                }
                else {
                    answer += Character.toLowerCase(s.charAt(i));
                }
            }

        }
        return answer;
    }
}