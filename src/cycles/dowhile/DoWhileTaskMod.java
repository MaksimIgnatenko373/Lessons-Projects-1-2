package cycles.dowhile;

import java.util.Scanner;

public class DoWhileTaskMod {
    //Todo используя While выветси все четные числа (которые делятся на 2(использовать оператор %)) как в предыдущих задачах от 0 до 10;
    //Подсказка - внутри блока while - использовать if
    public static void main(String[] args) {
        //счетчик while такой же кк в других задачах
        Scanner scanner = new Scanner(System.in);
        int count = 10;
        count--;
        do {
            //просто вывод будет срабатывать по условию if
            count = scanner.nextInt();
            System.out.println("Четное число " + count % 2);
        } while (count <=10 && count >=0);
           // if (count % 2 && count = 2)
            {
                System.out.println("Четное число " + count % 2);
                return;
            }
    }
}

