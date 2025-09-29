public class StringPalindrome {
    public static void main(String[] args) {
        String str = "madamm";
        System.out.println(isPalindrome(str,0));
    }
    //function to check weather passed string is palindrome or not
    static boolean isPalindrome (String str , int i){

        int n = str.length();
        //if length half string has been traversed from left or right stops
        if(i > n/2) return true;

        //if current wrong return false
        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }

        //check for the next
        return isPalindrome(str, i+1);
    }
}
