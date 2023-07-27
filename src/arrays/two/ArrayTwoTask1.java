package arrays.two;

import java.util.Arrays;

public class ArrayTwoTask1 {
    public static void main(String[] args) {
          //Todo нарисовать блок-схему каждого задания отдельно

        // Массив размером 2 на 2 ([2][2]) - также называется двумерным
        // [0][0] [0][1]
        // [1][0] [1][1]

        /*
        Массив размером 3 на 3
        [0][0] [0][1] [0][2]
        [1][0] [1][1] [1][2]
        [2][0] [2][1] [2][2]

        */


        int array[][] = new int[2][2];
        array[0][0] = 0;
        array[0][1] = 1;
        // [0][0] [0][1]
        array[1][0] = 2;
        array[1][1] = 3;
        // [1][0] [1][1]

        //region Блок задач

        //Todo вывести заполненый вручную массив в ЦИКЛЕ (спользовать вложенный for)
        System.out.println("Создание,заполнение и вывод двумерного массива вручную в цикле");
        int firstArray[][] = new int[2][2];
        firstArray[0][0] = 12;
        firstArray[0][1] = 17;
        firstArray[1][0] = 23;
        firstArray[1][1] = 32;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(firstArray[i][j]);
            }
        }

        System.out.println("Создание,заполнение и вывод двумерного массива с использованием Random");
        //TODO аналогично выводу Заполнить Двумерный массив в цикле используя Random(также как при заполнении одномерного). Использовать вложенный цикл for
        int[][] secondArray = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                secondArray[i][j] = (int) (Math.random()*999 );
                System.out.println(secondArray[i][j]);
            }
        }

        //Todo нарисовать блок схему программы

        System.out.println("Создание,заполнение и вывод массива размером 3х3");
        // 2-й вариант построения двумернго массива размером 3х3
        int[][] fifthArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fifthArray[i][j] = (int) (Math.random()*999 );
                System.out.println(fifthArray[i][j]);
            }
            System.out.println();
        }
        //endregion
    }
}
