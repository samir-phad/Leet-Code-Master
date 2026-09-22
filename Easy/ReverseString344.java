public class ReverseString344 {

    public void reverseString(char[] s) {
    for (int i = 0, j = s.length - 1; i < j; i++, j--) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    System.out.println(s);
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        ReverseString344 r = new ReverseString344();
        r.reverseString(s);
    }
}
