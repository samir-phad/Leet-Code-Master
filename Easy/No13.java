import java.util.HashMap;

public class No13{
    public static void main(String[] args) {
        String num = "MCM";

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int count = 0;

        for (int i = 0; i < num.length(); i++) {

            int current = map.get(num.charAt(i));

            if (i + 1 < num.length()) {

                int next = map.get(num.charAt(i + 1));

                if (current < next) {
                    count = count - current;
                } else {
                    count = count + current;
                }

            } else {
                count = count + current;
            }
        }

        System.out.println(count);
    }
}