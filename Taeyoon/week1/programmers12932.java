class Solution {
    public int[] solution(long n) {
        String temp = Long.toString(n);
        // 인자로 받은 n을 toString 메소드를 통해 String 자료형으로 타입을 바꿔줌(temp)
        int[] answer = new int[temp.length()];
        // temp의 길이 만큼 answer 배열 길이를 지정

        for (int i = 0; i < temp.length(); i++) {
            answer[i] = temp.charAt(temp.length() - i-1)-48;
        }
        // for문을 돌려서 temp의 뒷부분부터 answer 배열에 넣어줌
        // 여기서 char값을 자료형이 int인 answer[i]에 할당하면
        // int 자료형으로 형변환이 되는데, 여기서 만약 그대로 출력하면
        // 12345를 넣었을시 [5, 4, 3, 2, 1]이 아니라
        // [53, 52, 51, 50, 49]가 나온다.
        // 왜냐하면 int 자료형이 answer[i]에 char 변수값 5를 할당하면
        // 실제로 '53'인 '5'으 ASCII 값을 검색하기 때문이다.
        // 따라서 입력한 answer에 48을 빼서 넣어준다.
        return answer;

    }
}