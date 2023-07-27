package arrays;
/*
2 задачи:

   1. Удалить хвост (массив после определенного номера)
   2. Удалить ДО хвоста
*/

import java.util.Scanner;

public class ArrayPractice18CutEndArray {
    public static void main(String[] args) {

        // Задаём массив

        int n = 10;
        int[] firstArray = new int[n];
        for (int i = 0; i < n; i++) {
            firstArray[i] = (int) (Math.random()* 999);
            System.out.println(firstArray[i]);
        }
        // начало удаления хвоста массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер ячейки после которой хотите удалить элементы");

        int number = sc.nextInt();
        int[] secondArray = new int[number];
        for (int i = 0; i < number; i++) {
            secondArray[i] = firstArray[i];
        }
        for (int i = 0; i < number; i++) {
            System.out.println(secondArray[i]);
        }
    }
}
