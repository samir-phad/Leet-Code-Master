public class MajorityElement169 {
    
    public int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                element = num;
            }

            if (num == element) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }

    public static void main(String[] args) {
        int[] nums ={2,2,1,1,1,2,2};

        MajorityElement169 em = new MajorityElement169();
        System.out.println(em.majorityElement(nums));
    }
}
