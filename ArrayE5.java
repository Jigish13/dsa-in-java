import java.util.Arrays;

public class ArrayE5 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 7, 7};
        int n = 2;
        System.out.println(""+ Arrays.toString(shuffle(nums, n)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] res = new int[l];
        for (int i = 0, c = 0, j = n; i < n; i++, j++, c += 2) {
//            Tried Inplace Shuffling but didn't work as the original val's will be lost
//            int tmp = nums[i];
//            nums[i] = nums[j];
//            nums[i+1] = tmp;
            res[c] = nums[i];
            res[c+1] = nums[j];
        }
        return res;
    }
}
