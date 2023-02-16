 class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        int z[] = zFunction(str.toCharArray());
        
        for (int i=0; i<z.length; i++) {
            if (i+z[i]==n && z[i]*2>=str.length()) {
                return true;
            }
        }
        return false;
    }
    
    private int [] zFunction(char c[]) {
        int n = c.length;
        int z[] = new int[n];
        
        int left = 0;
        int mostRight = 0;
        
        for (int i=1; i<n; i++) {
            if (i<=mostRight) {
                z[i] = Math.min(mostRight-i+1, z[i-left]);
            } 
            while (i+z[i]<n && c[i+z[i]] == c[z[i]]) {
                z[i]++;
            }
            if (i+z[i]-1>mostRight) {
                mostRight = i+z[i]-1;
                left = i;
            }
        }
        return z;
    }
}