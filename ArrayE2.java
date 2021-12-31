import java.util.Arrays;

public class ArrayE2 {
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] res = new int[2 * len];
        for (int i = 0, j = 0, l = 2 * len; i < l; i++, j++) {
            if (j == len) j = 0;
            res[i] = nums[j];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(""+ Arrays.toString(getConcatenation(nums)));
    }
}
