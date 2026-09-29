public class ReverseInteger7 {

    public int reverse(int x) {

        int reversed = 0;

        while (x != 0) {

            int digit = x % 10;

            if (reversed > Integer.MAX_VALUE / 10 || 
                reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reversed = reversed * 10 + digit;

            x = x / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int x = 123;
        ReverseInteger7 r = new ReverseInteger7();
        System.out.println(r.reverse(x));
    }
}
