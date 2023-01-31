//2ms
class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n-1);
        
        StringBuilder sb = new StringBuilder();
        char ch = '!';
        int num = 0;
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)!=ch){
                if(num>0){
                    sb.append(num);
                    sb.append(ch);
                }        
                num = 0;
                ch = s.charAt(i);
            }
            num++;
            i++;
        }
        sb.append(num);
        sb.append(ch);
        return sb.toString();
    }
}