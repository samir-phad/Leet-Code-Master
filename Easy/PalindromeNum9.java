public class PalindromeNum9 {
    
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int original = x;

        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int x = 121;
        PalindromeNum9 p = new PalindromeNum9();
        boolean num = p.isPalindrome(x);
        if(num){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
