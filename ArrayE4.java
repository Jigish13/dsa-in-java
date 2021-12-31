import java.util.Arrays;

public class ArrayE4 {
    public static int maxWealth(int[][] acc) {
        byte max = 0;
        for (byte i = 0; i < acc.length; i++) {
            byte s = 0;
            for (byte j = 0; j < acc[i].length; j++) {
                acc[i][j] += s;
                s = (byte)acc[i][j];
            }
            if (s > max) max = s;
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] acc = {{1,2,3}, {4,2,1}};
        System.out.println(""+maxWealth(acc));
    }
}
