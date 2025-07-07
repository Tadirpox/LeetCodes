class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i= s.length()-1; i>=0; i--){
            int x= ans;
            if(i !=0){
                ans +=  (s.substring(i-1, i+1).equals("IV")) ? 4 :
                        (s.substring(i-1, i+1).equals("IX")) ? 9 :
                        (s.substring(i-1, i+1).equals("XL")) ? 40 :
                        (s.substring(i-1, i+1).equals("XC")) ? 90 :
                        (s.substring(i-1, i+1).equals("CD")) ? 400 :
                        (s.substring(i-1, i+1).equals("CM")) ? 900 :                
                0;
                if(ans != x) i--;
                if(i == -1) break;
            }
             if(ans == x){
                    ans +=  (s.charAt(i) == ('I')) ? 1 :
                    (s.charAt(i) == ('V')) ? 5 :
                    (s.charAt(i) == ('X')) ? 10 :
                    (s.charAt(i) == ('L')) ? 50 :
                    (s.charAt(i) == ('C')) ? 100 :
                    (s.charAt(i) == ('D')) ? 500 :
                    (s.charAt(i) == ('M')) ? 1000:
                    0;
                }
            
        }
        return ans;
    }
}