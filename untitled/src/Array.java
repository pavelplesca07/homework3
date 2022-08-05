public class Array {
    static void printNumbers() {
        int[] array = new int[50];
        int k = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                array[k] = i;
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        printNumbers();
    }
}

