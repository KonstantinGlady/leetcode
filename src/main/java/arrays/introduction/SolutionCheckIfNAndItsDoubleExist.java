package arrays.introduction;

public class SolutionCheckIfNAndItsDoubleExist {
    public static void main(String[] args) {

/*        Input: arr = [10,2,5,3]
        Output: true
        Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.*/

        // int[] arr = {10, 2, 5, 3};
        // int[] arr = {7,1,14,11};
         int[] arr = {-2, 0, 10, -19, 4, 6, -8};
       // int[] arr = {-16, -13, 8};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j] * 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
