package conditions;
// Определи
import java.util.Scanner;
public class Exercise20Logic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Определи тип пользователя");
        String user = scanner.nextLine();
        switch (user) {
            case "Главный администратор":
                System.out.println("Доступ разрешён");
                break;
            case "Системный администратор":
                System.out.println("Доступ ограничен");
                break;
            default:
                System.out.println("Доступ запрещён");
        }
    }
}