package arrays.introduction;

public class SolutionRemoveElement {
    public static void main(String[] args) {

      /*  Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]*/

        int[] nums = {4, 5};
        int val = 5;

        int k = removeElement(nums, val);
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {

            if (nums[i] == val) {
                for (int j = len - 1; j >= 0; j--) {

                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        len--;
                        break;
                    } else {
                        len--;
                        if (j <= i) {
                            break;
                        }
                    }
                }
            }
        }
        return len;
    }
}
