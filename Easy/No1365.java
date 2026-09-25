import java.util.Arrays;

public class No1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        int [] nums = {1, 5, 6, 3, 8};
        No1365 n = new No1365();
        int [] result =n.smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(result));

    }
}
