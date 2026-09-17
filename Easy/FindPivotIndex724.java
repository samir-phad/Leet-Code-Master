public class FindPivotIndex724{

        public int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        int result = 0;

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            result = sum - left - nums[i];
            if(result == left){
                return i;
            }
            left += nums[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        FindPivotIndex724 f = new FindPivotIndex724();
        int ans = f.pivotIndex(nums);
        System.out.println(ans);
    }
}