package conditions;

public class Exercise102Logic {
    public static void main(String[] args) {
        // нужно в переменных диапозон указать! Диапозон: от 10 до 100
        int min = 10;
        int max = 100;
        int currentClientsCount = 110;
        //if (currentClientsCount > min && currentClientsCount < max) same?
        //Todo продебажить
        if (currentClientsCount < min) {
            System.out.println("Недостаточно посетителей");
            return;
        }
        if (currentClientsCount > max) {
            System.out.println("Посетителей больше");
            return;
        }
        System.out.println("Сеанс запущен");


    }
}
