import java.util.Arrays;

public class ArrayE7 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(""+numIdenticalPairs(nums));
    }

    private static int numIdenticalPairs(int[] nums) {
        int c = 0;
        for (int i = 0, l = nums.length; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] == nums[j]) c++;
            }
        }
        return c;
    }
}
