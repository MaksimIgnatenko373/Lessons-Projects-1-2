package conditions;

public class Exercise6Logic {
    public static void main(String[] args) {
        int a = 2;
        String status = "usually";
        if (a > 1 || "vip".equals(status) ) {
            System.out.println("Клиент найден");
        } else {
            System.out.println("Клиент не найден");
        }
    }
}
