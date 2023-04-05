package conditions;
import java.util.Scanner;
public class Exercise19Logic {
    public static void main(String[] args) {
        System.out.println("Определи время года по текущему месяцу");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        int a = 5;
        switch (season) {
            case "Декабрь" :
            case "Январь" :
            case "Февраль" :
                System.out.println("Зима");
                break;

            case "Март" :
            case "Апрель" :
            case "Май" :
                System.out.println("Весна");
                break;

            case "Июнь" :
            case "Июль" :
            case "Август" :
                System.out.println("Лето");
                break;

            case "Сентябрь" :
            case "Октябрь" :
            case "Ноябрь" :
                System.out.println("Осень");
                break;
        }

        switch (season) {
            case "Декабрь", "Январь", "Февраль" -> System.out.println("Зима");
            case "Март", "Апрель", "Май" -> System.out.println("Весна");
            case "Июнь", "Июль", "Август" -> System.out.println("Лето");
            case "Сентябрь", "Октябрь", "Ноябрь" -> System.out.println("Осень");
        }
    }
}
