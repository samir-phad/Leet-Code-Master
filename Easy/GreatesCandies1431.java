import java.util.ArrayList;
import java.util.List;

public class GreatesCandies1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int a = candies[0];
        for(int i = 1 ; i < candies.length; i++){
            if(candies[i] > a){
                a = candies[i]; 
            }
        }
        for(int i = 0 ; i < candies.length; i++){
            result.add((candies[i] + extraCandies) >= a);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 3;
        GreatesCandies1431 gc = new GreatesCandies1431();
        
        List<Boolean> ans = gc.kidsWithCandies(candies, extraCandies);
        System.out.println(ans);
    }
}
