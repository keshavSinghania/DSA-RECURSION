import java.util.Scanner;

public class PrintPatternUsingLoopAndRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row count for pattern");
        int n = sc.nextInt();

        printPatternRecursion(n);
    }

    //function to print this pattern using loop
//    public static void printPatternLoop( int n){
//        for(int i=0; i<=n; i++){
//            for(int j=i; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //function to print this pattern using recursion
    public static void printPatternRecursion(int n){
        //base comes over here
        if(n ==0){
            return;
        }

        for(int i=0; i<n; i++){
            System.out.print("*");
        };
        System.out.println();
        printPatternRecursion(n-1);
    }
}
