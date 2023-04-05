package conditions;

import java.sql.SQLOutput;

public class Exercise7Logic {
    public static void main(String[] args) {
        int a = 19;
        String status = "Пользователь";
                if ((a > 18) || (a > 16 && a < 18)) {
                    System.out.println("Новый пользователь");
                } else {
                    System.out.println("Не новый пользователь");
                }
    }
}
