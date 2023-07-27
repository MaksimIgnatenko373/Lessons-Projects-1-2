package arrays;

import java.util.Scanner;

/*
1. Создать массив размеров 10
2. Заполнить каждый элемент массива случайным значением типа int от 0 до 9

 */
public class ArraPractice7Random {
    public static void main(String[] args) {
        // создаём массив размером 10
        int n = 10;
        int[] firstArray = new int[n];
        // заполняем созданный массив случаёными элементами значениями в диапозоне от 0 до 9
       for (int i = 0; i < firstArray.length; i++ ) {
           //Todo что не так с задачей?
            firstArray[i] = (int) (Math.random()* 10);
           System.out.println(firstArray[i]);
       }
    }
}
