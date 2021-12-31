import java.util.Arrays;

public class ArrayE3 {
    public static int[] runningSum(int[] nums) {
        for (int i = 0, s = 0, l = nums.length; i < l; ++i) {
            nums[i] += s;
            s = nums[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(""+ Arrays.toString(runningSum(nums)));
    }
}
