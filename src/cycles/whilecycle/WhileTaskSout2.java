package cycles.whilecycle;

import java.util.Scanner;

public class WhileTaskSout2 {
    //зациклить ввод с клавиатуры:
    //получать ввод с клавиатуры пока count меньше 5;
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        do {
            count++;
            System.out.println(count);
        } while (count < 5);
    }
}
