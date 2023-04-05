package cycles.whilecycle;
//Todo используя While выветси все четные числа (которые делятся на 2(использовать оператор %)) как в предыдущих задачах от 0 до 10;
//Подсказка - внутри блока while - использовать if
public class WhileTaskSoutTraining {
    public static void main(String[] args) {
        int count = 0;
        while (count <=10 && count >= 0) {
            count++;
        if ((count % 2) == 0 )
            System.out.println(count);
        }
    }
}
