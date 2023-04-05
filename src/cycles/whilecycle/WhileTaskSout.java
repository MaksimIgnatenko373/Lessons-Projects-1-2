package cycles.whilecycle;

import java.util.Scanner;

public class WhileTaskSout {
    //найти среднее арифметическое из 5 введенных чисел - ввести с клавиатуры! т.е. зациклить ввод!
    //использовать while
    public static void main(String[] args) {
        //Todo написать программу, которая выведет кол-во звездовчек введеное кол-во раз.
        //То есть выполнить действие в цикле столько раз, сколько у нас лежит в count после ввода с клавиатуры
        /*
        Пример:
        ввод 3
        *
        *
        *
        ввод 5
        *
        *
        *
        *
        *
         */
        String symbol = "*";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        do {
            System.out.println(symbol);
            count--;
        } while (count != 0);
    }
}

