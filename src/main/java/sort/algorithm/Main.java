package sort.algorithm;


public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        selectionSort(arr);

        System.out.print("O array ordenado está aqui: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                int temp = arr[indiceMenor];
                arr[indiceMenor] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
