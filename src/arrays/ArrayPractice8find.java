package arrays;

import java.util.Scanner;

/*
//Todo 1. Заполнить массив размером 10 случайными значениями .
2. Найти максимальное значение
3. Найти среднее значение
4. Найти минимальное значение
5. Найти суммму элементов
 дополнительно - в каждой задаче в выводе (sout) подписать четко Макс, мин, сумма и прочее.

 */
public class ArrayPractice8find {
    public static int getRandomDiceNumber() {
        return (int) (Math.random()* 10);
    }
    public static void main(String[] args) {
        // Этап 1. Заполнение массива слуайными элементами (размер 10)

        //Todo отдельный класс
        //Этап 2. Нахождение максимального значения

        //Тоdo отдельный класс
        // Этап 3. Нахождение среднего знаяения

        //Тоdo отдельный класс
        // Этап 4. Нахождение минимального значения

        //Тоdo отдельный класс
        // Этап 5. Нахождение суммы элементов


        int n = 100;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        int max = array[n-1];
        int min = array[n-1];
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
        System.out.println("Среднее зачение = " + avg);
    }
}
