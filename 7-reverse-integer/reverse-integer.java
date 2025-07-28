class Solution {
    public int reverse(int x) {
        int y= 0;
        int x1=0;
        while(x!=0){
            x1= x%10;
            if(y > Integer.MAX_VALUE/10 || (y == Integer.MAX_VALUE/10 && x1 >7)) return 0;
            if(y < Integer.MIN_VALUE/10 || (y == Integer.MAX_VALUE/10 && x1 <-8)) return 0;
            y= y*10+x1;
            x/=10;
        }
        return y;
    }
}