package conditions;

public class Exercise101Logic {
    public static void main(String[] args) {
        // нужно в переменных диапозон указать! Диапозон: от 10 до 100
        int min = 10;
        int max = 100;
        int currentClientsCount = 110;
        //if (currentClientsCount > min && currentClientsCount < max) same? Ответ: то же самое
        if (currentClientsCount > min) {
            if (currentClientsCount < max) {// это называется вложенный if
                System.out.println("Сеанс запущен");
            } else
                System.out.println("Посетителей больше");
            //к какому if будет относится else? Ответ: else будет относиться ко вложенному оператору if ((currentClientsCount < max))!
        } else {
            System.out.println("Посителей меньше");
        }
        //можно ли заменить || на вложенный if? Ответ: при || результат будет только "Сеанс запущен" (по сути получаем "бесконечность")
    }



}
