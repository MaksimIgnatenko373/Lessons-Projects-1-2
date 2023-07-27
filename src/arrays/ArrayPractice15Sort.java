package arrays;

import java.util.Arrays;

public class ArrayPractice15Sort {
    /*
    Виды сортировок:
    1. Простейшая сортировка (см. пример про порядок возрастания путём смены местами)
    "swap" - перемена мест
    2. "Пузырьком"
    2 .Сортировка подсчётом
    3. Поразрядная сортировка
    4. Быстрая сортировка
     */
    public static void main(String[] args) {

    }
        private void swap ( int[] array, int ind1, int ind2){
            int tmp = array[ind1];
            array[ind1] = array[ind2];
            array[ind2] = tmp;
            int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(Arrays.toString(firstArray));
            boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
                for (int i = 1; i < array.length; i++) {
                    if (firstArray[i] < firstArray[i - 1]) {
                        swap(firstArray, i, i-1);
                        needIteration = true;
                    }
                }
            } System.out.println(Arrays.toString(firstArray));
        }
}
