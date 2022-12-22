package sort;

public class InsertFunction {
    public static void main(String[] args) {
        int[] array = {1,2,5,12,6,43,2,5,7,4};
       InsertSort(array);
    }

    public static void InsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentInsert = array[i];
            int indexInsert = i;
            while (indexInsert > 0 && (currentInsert < array[indexInsert - 1])) {
                array[indexInsert] = array[indexInsert - 1];
                indexInsert--;
            }
            array[indexInsert] = currentInsert;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
