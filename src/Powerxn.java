public class Powerxn {
}

// WITHOUT RECURSION
class Solution {
    public double myPow(double x, int n) {
        return findPow(x, n);
    }

    //function to find power without using recursion
    double findPow(double x, long power){
        double ans = 1.0;
        //when power is negative simply , convert x into 1/x , power into +ve
        if(power < 0){
            power = -power; //converted into +ve
            x = 1 / x;
        }

        while(power > 0){
            //if power is odd
            if(power % 2 == 1){
                power--;
                ans = ans * x;
            }else{
                power = power / 2;
                x = x * x;
            }
        }

        return ans;
    }
}



// // USING RECURSION

// class Solution {
//     public double myPow(double x, int n) {
//         return findPower(x, n);
//     }

//     //function to find power
//     double findPower(double x, long n){
//           long power = n;

//         //handle negative case(convert power into +ve and x into 1/x as 2^-5 == (1/2)^5)
//         if(power < 0){
//             power = -power;
//             x = 1/x;
//         }
//         //if power is 0 simpley return 1
//         if(power == 0) return 1.0;

//         //if power is odd, then find the power of (power-1) and multiply with x
//         if(power % 2 != 0){
//             return x * findPower(x, power-1);
//         }

//         //if power is even, then find the power by dividing power by 2 and multiplying x with itself
//         return findPower(x*x, power/2);
//     }
// }
