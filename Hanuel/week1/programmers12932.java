class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        String[] arr = s.split("");
        int[] ans = new int[s.length()];
        int i = 0;
        for(int j=s.length()-1;j>=0;j--){
            ans[i] += Integer.parseInt(arr[j]);
            i++;
        }
        return ans;
    }
}