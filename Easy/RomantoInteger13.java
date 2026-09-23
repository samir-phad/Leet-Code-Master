import java.util.HashMap;

public class RomantoInteger13 {
 
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            if (i + 1 < s.length()) {

                int next = map.get(s.charAt(i + 1));

                if (current < next) {
                    count = count - current;
                } else {
                    count = count + current;
                }

            } else {
                count = count + current;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "LVIII";
        RomantoInteger13 r = new RomantoInteger13();
        System.out.println(r.romanToInt(s));
    }

}
