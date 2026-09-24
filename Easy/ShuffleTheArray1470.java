import java.util.Arrays;

public class ShuffleTheArray1470{

    public int[] shuffle(int[] nums, int n) {
        int [] result = new int[nums.length];
        int a = 0;
        for(int i = 0, j = i + n ; i < n ; i++, j = i + n){
                result[a] = nums[i];
                a++;
                result[a]=nums[j];
                a++;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,4,3,2,1};
        int n = nums.length/2;

        ShuffleTheArray1470 s = new ShuffleTheArray1470();
        int[] ans = s.shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }
}