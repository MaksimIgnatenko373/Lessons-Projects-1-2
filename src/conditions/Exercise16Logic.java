package conditions;
//Дано время в 24часовом формате. Выветси в формате 12часов AM/PM. Можно использовать > <
public class Exercise16Logic {
    public static void main(String[] args) {
        int a = 15;
        if (a > 0 && a <= 12) {
            System.out.println(a + " AM");
            return;
        }
        if (a > 12 && a < 24) {
            System.out.println(a + " PM");
            return;
        }
    }
}
