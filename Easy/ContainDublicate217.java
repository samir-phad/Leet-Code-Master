import java.util.*;

public class ContainDublicate217{
    public static void main(String[] args) {
        int [] nums = {1, 3, 6, 9, 6, 23, 42, 3, 6};
        Set<Integer> arr = new HashSet<>();
            for (int ar : nums) {
                arr.add(ar);
            }
            if(nums.length != arr.size()){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        
    }
}