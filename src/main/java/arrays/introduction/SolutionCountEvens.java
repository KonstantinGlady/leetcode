package arrays.introduction;

public class SolutionCountEvens {

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        int num = 0;

        for (int i : nums) {
            num = Integer.toString(i).length();
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
