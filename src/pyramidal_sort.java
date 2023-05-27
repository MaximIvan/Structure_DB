// Реализовать алгоритм пирамидальной сортировки (сортировка кучей).

public class pyramidal_sort {
    public static void main (String[] args) {
        int[] array = new int[]{3, 5, 9, 2, 5, 8, 7, 1, 6, 10};

        sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

public static void sort(int[] array) {
    for (int i = array.length / 2 - 1; i >= 0; i--)
        compile(array, array.length, i);

    for (int i = array.length - 1; i >= 0; i--) {
        int temp = array[0];
        array[0] = array[i];
        array[i] = temp;

        compile(array, i, 0);
    }
}

private static void compile(int[] array, int heapSize, int rootIndex) {
    int largest = rootIndex;
    int leftChild = 2 * rootIndex + 1;
    int rightChild = 2 * rootIndex + 2;

    if (leftChild < heapSize && array[leftChild] > array[largest])
        largest = leftChild;

    if (rightChild < heapSize && array[rightChild] > array[largest])
        largest = rightChild;

    if (largest != rootIndex) {
        int temp = array[rootIndex];
        array[rootIndex] = array[largest];
        array[largest] = temp;

        compile(array, heapSize, largest);
        }
    }
}