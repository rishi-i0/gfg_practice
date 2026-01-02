class Solution {
    public int countDigits(int n) {
        // code here
        int cnt = 0;
        while(n>0){
            cnt=cnt+1;
            n=n/10;
        }
        return cnt;
        
    }
}
