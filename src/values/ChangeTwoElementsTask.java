package values;

import java.util.Arrays;

/**
 * дано массив из двух элементов. нужно поменять значения элементов массива местами используя переменную buf
 */
public class ChangeTwoElementsTask {
    public static void main(String[] args) {
        int n = 2;
        int[] array = new int[n];
        //аналогично как в прошлой задаче с int a = 5
        array[0] = 5;

        //аналогично как в прошлой задаче с int b = 10
        array[1] = 10;

        //аналогично как в прошлой задаче
        int temp;
        System.out.println("Array[0] = " + array[0]);
        System.out.println("Array[1] = " + array[1]);

        //1. Сохраняем значение той переменной в tmp,
        // в которую первой будем присваивать значений другой переменной (array[0])
        temp = array[0];
        //2. присваеиваем в переменную (array[0)) значение переменной (array[1])
        array[0] = array[1];
        //3. присваиваем в array[1] значение из tmp
        array[1] = temp;
        System.out.println("Array[0] = " + array[0]);
        System.out.println("Array[1] = " + array[1]);

//
//        //Todo не удалять! такой способ существует. Значение через вычисления не используя другую переменную.
//        array[0] = array[0] + array[1];
//        array[1] = array[0] - array[1];
//        array[0] = array[0] - array[1];
//        System.out.println("Array[0] = " + array[0]);
//        System.out.println("Array[1] = " + array[1]);

    }
}
