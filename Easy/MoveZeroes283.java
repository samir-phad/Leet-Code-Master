import java.util.Arrays;

public class MoveZeroes283 {

    public static void main(String[] args) {
        
		int [] arr = {15, 0, 81, 0, 4, 1, 0, 44, 1, 0};
		int [] result = new int[arr.length];
		
		int a = 0;
		
		for (int i = 0; i < result.length; i++) {
			if(arr[i] != 0) {
				result[a]=arr[i];
				a++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				result[a] = arr[i];
				a++;
			}
		}
		System.out.println(Arrays.toString(result));
    
    }
    
}
