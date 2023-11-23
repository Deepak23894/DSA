package LinkedListDatastructure;

import java.util.Arrays;

class SolutionTwo {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    static boolean test2(int i) {
        String x = "";
        for (int a = String.valueOf(i).length()-1; a >= 0; a--) {
            x = x + String.valueOf(i).charAt(a);
        }
        if (Integer.parseInt(x)== i)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(test2(121));
    }
}
