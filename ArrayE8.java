import java.util.Arrays;

public class ArrayE8 {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2 ,2, 3};
        System.out.println("" + Arrays.toString(smallerNumsThanCurrent(nums)));
    }

    private static int[] smallerNumsThanCurrent(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (j != i && nums[j] < nums[i]) res[i]++;
            }
        }
        return res;
    }
}
