package cycles.whilecycle;

import java.util.Scanner;

public class WhileTaskSout3Way2 {
    //найти среднее арифметическое из 5 введенных чисел- ввести с клавиатуры. !ТО есть зациклить ввод!
    //использовать while
    public static void main(String[] args) {
        int sum = 0;
        int count = 5;
        int number = 1;
        Scanner sc = new Scanner(System.in);
        do {
            number = sc.nextInt();
            sum = sum + number;
            count --;
        } while (count > 0);
        int middle = sum / 5;
        System.out.println(middle);
    }
}
