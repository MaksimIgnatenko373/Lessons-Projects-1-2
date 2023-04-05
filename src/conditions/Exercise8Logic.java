package conditions;

public class Exercise8Logic {
    public static void main(String[] args) {
        int a = 600000;
        String object = "black";
        boolean isCredit = true;
        if (a <= 600000 && "black".equals(object) && isCredit) {
            System.out.println("Машина найдена");
        } else {
            System.out.println("Машина не найдена");
        }
    }
}
