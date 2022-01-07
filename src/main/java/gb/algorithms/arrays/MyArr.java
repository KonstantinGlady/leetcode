package gb.algorithms.arrays;

import java.util.Arrays;

public class MyArr {

    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public int getElement(int index) {
        return arr[index];
    }

    public void setElement(int index, int elem) {
        arr[index] = elem;
    }

    public int[] deleteElement(int elem) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == elem) {
                break;
            }
        }
        for (int j = i; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }
        size--;
        return arr;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {
        MyArr myarr = new MyArr(10);
        myarr.setElement(3, 42);
        myarr.setElement(4, 22);
        System.out.println(Arrays.toString(myarr.arr));
        int n = myarr.getElement(3);
        System.out.println(n);
        int[] arr2 = myarr.deleteElement(22);
        System.out.println(Arrays.toString(arr2));
    }
}
