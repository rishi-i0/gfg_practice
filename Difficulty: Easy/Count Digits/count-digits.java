// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int original=n;
        int cnt=0;
        while(n>0){
            int digit=n%10;
            if(digit!=0 && original % digit==0){
                cnt ++;
            }n=n/10 ;
            
        }return cnt;
    }
}