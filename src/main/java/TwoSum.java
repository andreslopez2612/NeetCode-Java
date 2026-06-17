import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6};
        int target = 7;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
        //output: [0,1]
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen  = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (seen.containsKey(target - value)) {
                return new int[] { seen.get(target - value), i };
            }
            seen.put(value, i);
        }
        return new int[0];
    }
}
