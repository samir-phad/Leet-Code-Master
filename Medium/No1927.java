public class No1927 {

    public static void main(String[] args) {

        String num = "?3295???";

        int left = 0;
        int right = 0;

        int leftQuestion = 0;
        int rightQuestion = 0;

        int half = num.length() / 2;

        for (int i = 0; i < num.length(); i++) {

            if (num.charAt(i) == '?') {

                if (i < half) {
                    leftQuestion++;
                } else {
                    rightQuestion++;
                }

            } else {

                if (i < half) {
                    left += num.charAt(i) - '0';
                } else {
                    right += num.charAt(i) - '0';
                }
            }
        }

        int sumDiff = left - right;
        int questionDiff = leftQuestion - rightQuestion;

        boolean result;

        if (questionDiff == 0) {

            result = sumDiff != 0;

        } else {

            result = 2 * sumDiff != 9 * questionDiff;
        }

        System.out.println(result);
    }
}