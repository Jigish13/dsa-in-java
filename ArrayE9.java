import java.util.Arrays;

public class ArrayE9 {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        System.out.println(""+findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int c = 0;
        for (int i = 0, n = nums.length; i < n; i++) {
            int digits = 0;
            int element = nums[i];
            while (element > 0) {
                element /= 10;
                digits += 1;
            }
            if ((digits & 1) == 0) c += 1;
        }
        return c;
    }
}
