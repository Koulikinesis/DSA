class Solution {
    public String longestPrefix(String s) {
        int pi[] = function(s);
        int len = pi[pi.length - 1];
        String ans = "";
        for(int i = 0; i < len; i++) {
            ans += s.charAt(i);
        }
        return ans;
    }
    
    public int[] function(String s) {
        int pi[] = new int[s.length()];
        pi[0] = 0;
        int n = s.length();
        for(int i = 1; i < n; i++) {
            int j = pi[i - 1];
            while(j > 0 && s.charAt(i) != s.charAt(j)) {
                j = pi[j - 1];
            }
            if(s.charAt(i) != s.charAt(j) && j == 0) {
                pi[i] = 0;
            }
            else {
                pi[i] = j + 1;
            }
        }
        return pi;
    }
}