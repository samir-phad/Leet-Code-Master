public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {

        int a = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != val){
               nums[a] = nums[i];
                a++;
            }
        }
        return a;
        
    }

    public static void main(String[] args) {
        int [] nums = {3, 2, 2, 3};
        int val = 3; 
        RemoveElement27 r = new RemoveElement27();
        int result = r.removeElement(nums, val);
        System.out.println(result);
    }
}
