// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        if(n==0)return false;
        int real=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }return sum==real;
    }
}