
import java.util.Arrays;

public class productExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6};
        //Output: [48,24,12,8]
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int postFix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postFix;
            postFix *= nums[i];
        }
        return res;
    }
}
