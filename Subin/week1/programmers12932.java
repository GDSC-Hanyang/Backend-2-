import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> solution(long n) {
        List<Long> answer = new ArrayList<Long>();
        while(n > 0) {
            answer.add(n % 10);
            n /= 10;
        }
        return answer;
    }
}