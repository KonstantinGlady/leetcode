package gb.algorithms.arrays;

public class MyArrRefactoring {

    private int[] arr;
    private int size;

    public MyArrRefactoring(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    public void insert(int elem) {
      /*  this.arr[this.size] = elem;
        this.size++;*/

        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] > elem) {
                break;
            }
        }
        for (int j = this.size; j > i; j--) {
            this.arr[j] = this.arr[j - 1];
        }
        this.arr[i] = elem;
        this.size++;
    }

    public void delete(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == value) {
                break;
            }
        }
        for (int j = i; j < size - 1; j++) {
            this.arr[j] = this.arr[j + 1];
        }
        this.size--;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(this.arr[i] + " ");
        }
    }

    public boolean find(int value) {
        for (int i = 0; i < this.size; i++) {
            if (this.arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean binaryFind(int value) {
        int low = 0;
        int high = this.size - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (value == this.arr[mid]) {
                return true;
            } else {
                if (value < this.arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MyArrRefactoring myArr = new MyArrRefactoring(10);
        myArr.insert(2);
        myArr.insert(4);
        myArr.insert(7);
        myArr.insert(9);
        myArr.insert(14);
        myArr.insert(27);
        myArr.display();
        System.out.println("\n удаляем: ");
        if (myArr.binaryFind(4)) {
            myArr.delete(4);
        }
        myArr.display();
        System.out.println("\n добавляем: ");
        myArr.insert(11);
        myArr.insert(3);
        myArr.display();
    }
}
