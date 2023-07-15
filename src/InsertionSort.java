public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Сдвигаем все элементы больше key на одну позицию вперед
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Вставляем key в правильную позицию
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 3};
        insertionSort(array);

        // Выводим отсортированный массив
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
