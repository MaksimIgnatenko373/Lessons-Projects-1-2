package conditions;

public class Exercise10Logic {
    public static void main(String[] args) {
        // нужно в переменных диапозон указать! Диапозон: от 10 до 100
        int min = 10;
        int max = 100;
        int currentClientsCount = 99;
        if (min < 10) {
            System.out.println("Посетителей мало");
        } else {
            System.out.println("Посетителей достаточно");
        }
        if (max > 100) {
            System.out.println("Посетителей больше");
        } else {
            System.out.println("Посетителей достаточно");
        }
        if (currentClientsCount > min && currentClientsCount < max) {
            System.out.println("Сеанс запущен");
        } else {
            System.out.println("Сеанс не запущен");
        }
    }
}
