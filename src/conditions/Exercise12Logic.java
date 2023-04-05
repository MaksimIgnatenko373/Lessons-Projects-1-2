package conditions;
public class Exercise12Logic {
    public static void main(String[] args) {
        String user = "Разработчик";
        if ("Администратор".equals(user)) {
            System.out.println("Доступ для просмотра разрешён");
        } else {
            System.out.println("В доступе для просмотра отказано");
        }
    }
}
