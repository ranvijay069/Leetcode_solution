int fibo(int n){
    if(n<=1){
        return n;
    }
    int ans = fibo(n-1)+fibo(n-2);
    return ans;
}
class Solution {
public:
    int fib(int n) {
        return fibo(n);
    }
};