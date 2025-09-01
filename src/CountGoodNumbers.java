//public class CountGoodNumbers {
//}
//class Solution {
//    public int countGoodNumbers(long n) {
//        long even = (n/2);
//        long odd = (n+1)/2;
//        long MOD  = 1000000007;
//
//        long power4 = findPower(4,even,MOD);
//        long power5 = findPower(5,odd,MOD);
//
//        return (int) ((power4 * power5) % MOD);
//    }
//    //optimize function to find the power x to the n
//    long findPower(long x, long power , long MOD){//x^power
//        //base condition
//        if(power == 0){
//            return 1;
//        }
//        //if the power is odd then simply substract -1 ans multiply with number
//        if(power % 2 == 1){
//            return (x % MOD) * findPower(x,power - 1,MOD) % MOD;
//        }else{//if even then multiply number by itself and half the power
//            return findPower((x*x)%MOD , power/2,MOD) % MOD;
//        }
//    }
//}
//
//
//
//// class Solution {
////     public int countGoodNumbers(long n) {
////         long ans = 5;
////         long MOD = 1_000_000_007;
//
////         //runs loop n+1 times
////         for(int i=1; i<n; i++){
////             if(i % 2 == 0) {
////                 ans = (ans * 5) % MOD;
////             }else{
////                 ans = (ans * 4) % MOD;
////             }
////         }
////         return (int)ans;
////     }
//// }
//
//
//// class Solution {
////     public int countGoodNumbers(long n) {
////         long minPoss = findMinPossDigit(n);
////         long maxPoss = findMaxPossDigit(n);
////         int count = 0;
//
////         for(long i=minPoss; i<=maxPoss; i++){
////             if(isGoodNumber(i)) count++;
////         }
////         return count;
////     }
//
////     //function to find good number
////     boolean isGoodNumber(long num, int digitCount){
////         for(int i=0; i<=digitCount; i++){
//
////         }
////     }
//
////     //function to check even or not
////     boolean isEven(long num){
////         if(num % 2 == 0) return true;
////         return false;
////     }
//
////     //function to check prime
////     boolean isPrime(long num){
////         if(num <= 1) return false;
////         if(num == 2) return true;
//
////         for(int i=3; i*i<=num; i++){
////             if(num % i == 0) return false;
////         }
////         return true;
////     }
////     //function to find min and max number of particular digits
////     long findMinPossDigit(long n){
////         if(n==1) return 0;
////         long ans = 1;
////         for(int i=1; i<n ; i++){
////             ans *= 10;
////         }
////         return ans;
////     }
//
////     long findMaxPossDigit(long n){
////         long ans = 1;
////         for(int i=1; i<=n ; i++){
////             ans *= 10;
////         }
////         return ans - 1;
////     }
//// }