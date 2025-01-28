class ArrayOperations<T> {
    T arr[];
    int size;

    ArrayOperations(int capacity) {
        arr = (T[]) new Object[capacity];
        size = 0;
    }

    int insert(int index, T value) {
        if (size == arr.length) {
            System.out.println("No Space to add new Element in Array");
            return 0;
        }
        if (index > size) {
            System.out.println("Index is Greater than Size so can't insert ");
            return 0;
        }

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        size++;
        return size;
    }

    int remove(int index) {
        if (index > size) {
            System.out.println("Can't Remove");
            return 0;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
        return size;
    }

    boolean search(T value) {
        for (T e : arr) {
            if (e instanceof Integer && value instanceof Integer) {
                if (((Integer) e).intValue() == ((Integer) value).intValue()) {
                    System.out.println("Found...");
                    return true;
                }
            }

        }
        System.out.println("Not Found....");
        return false;
    }

    void print() {
        System.out.println("***********************");
        for (T e : arr) {
            System.out.println(e);
        }
    }
}

class ArrayOperationDemo {
    public static void main(String[] args) {
        ArrayOperations<Integer> opr = new ArrayOperations(5);
        opr.insert(1, 100);
        opr.insert(0, 1000);
        opr.insert(1, 2000);
        opr.insert(0, 9000);
        opr.insert(1, 8888);
        opr.insert(2, 18888);
        opr.insert(1, 811);
        // int arr[] ;
        // String t [];

        // opr.search(12000);
        // opr.print();
        // opr.remove(10);
        // opr.print();
        // opr.remove(0);
        // opr.print();
        // opr.remove(1);
        // opr.print();

    }
}
