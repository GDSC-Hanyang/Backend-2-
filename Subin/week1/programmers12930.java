import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] separated = s.split("\\s+");
        List<String> words = new ArrayList<>();
        // String[] words = new String[];
        for(int i = 0; i < separated.length; i++) {
            for(int j = 0; j < (separated[i]).length(); j++) {
                if((j % 2) == 0) {
                    answer += Character.toString(separated[i].charAt(j)).toUpperCase();
                }
                else {
                    answer += Character.toString(separated[i].charAt(j)).toLowerCase();
                }
            }
            words.add(answer);
            // if(i == separated.length - 1)
            //     return answer;
            // else {
            //     answer += " ";
            // }
        }
        
        for(int x = 0; x < separated.length; x++) {
            s = s.replace(separated[x], words.get(x));
        }
        answer = s;
        
        return answer;
    }
}