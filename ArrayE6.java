import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayE6 {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        System.out.println(""+kidsWithCandies(candies, extraCandies));
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l = candies.length;
        List<Boolean> res = new ArrayList<>(l);
        int maxCandies = Integer.MIN_VALUE;
        for(int candy:candies) {
            if (candy > maxCandies) maxCandies = candy;
        }
        for (int candy : candies) {
            res.add((candy + extraCandies) >= maxCandies ? true : false);
        }
        return res;
    }
}
