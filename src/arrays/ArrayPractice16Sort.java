package arrays;

public class ArrayPractice16Sort {
    public static void main(String[] args) {
// 1. Создаём массив с размером 3
        int n = 10; //Решение должно работать для массива любого размера, 3, 10, 100, 1000 и тд
        int[] firstArray = new int[n];
        // 2. Заполняем массив случайными элементами. Задаём диапазон от 0 до 999
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 999); // применяем Math.random()
            System.out.println(firstArray[i]);
        }
        // 3. Проводим сортировку (пузырьком)
        //идея сортировки пузырьком:
        // 3.1 Проходим по массиву.
        int temp;
        // 3.2 Cравниваем два соседних элемента, если первый элемент больше, чем второй, то меняем их местами.
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < firstArray.length - 1; i++) {
                if (firstArray[i] > firstArray[i + 1]) {
                isSort = false;
                temp = firstArray[i];
                firstArray[i] = firstArray[i + 1];
                firstArray[i + 1] = temp;
                //System.out.println("firstArray[i] = " + firstArray[i]);
                //System.out.println("firstArray[i+1] = " + firstArray[i + 1]);
              }
//                else {
//                    isSort = true;
////                    temp = firstArray[i];
////                    firstArray[i] = firstArray[i + 1];
////                    firstArray[i + 1] = temp;
////                    System.out.println("firstArray[i] = " + firstArray[i]);
////                    System.out.println("firstArray[i+1] = " + firstArray[i + 1]);
//                }
            }
        }
        // Это вывод в консоль после сортировки
        System.out.println("Массив после сортировки");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
    }
}



