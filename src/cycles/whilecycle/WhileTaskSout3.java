package cycles.whilecycle;

import java.util.Scanner;

public class WhileTaskSout3 {
    //найти среднее арифметическое из 5 введенных чисел- ввести с клавиатуры. !ТО есть зациклить ввод!
    //использовать while
    public static void main(String[] args) {
        int middle = 1;
        int count = 1;
        int count1 = 1;
        int count2 = 1;
        int count3 = 1;
        int count4 = 1;
        Scanner sc = new Scanner(System.in);
        do {
            count = sc.nextInt();
            count1 = sc.nextInt();
            count2 = sc.nextInt();
            count3 = sc.nextInt();
            count4 = sc.nextInt();
            middle = (count + count1 + count2 + count3 + count4) % 5;
            System.out.println(middle);
        } while (middle <= 5);
    }
}
