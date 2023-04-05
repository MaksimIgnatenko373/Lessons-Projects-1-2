package cycles.dowhile;

import java.util.Scanner;

public class DoWhileTaskPassword {
    public static void main(String[] args) {
        // Запросить ввод с клавиатуры до тех пор, пока "Яблоко"не равно вводимый пароль
        String password = "Яблоко";
        Scanner scanner = new Scanner(System.in);
        do {
            password = scanner.nextLine();
            System.out.println("Ввод разрешён");
        } while (!"Яблоко".equals(password));
    }
}
