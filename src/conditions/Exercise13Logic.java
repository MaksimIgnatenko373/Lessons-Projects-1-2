package conditions;

public class Exercise13Logic {
    public static void main(String[] args) {
        int currentClientsCount = 70;
        if (currentClientsCount > 10 && currentClientsCount < 100) {
            System.out.println("Сеанс запущен");
        } else {
            System.out.println("Сеанс не запущен");
        }
    }
}
