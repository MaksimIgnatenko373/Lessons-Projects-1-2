package conditions;
public class Exercise4Logic {
    public static void main(String[] args) {
        int a = 23;
        int b = 45000;
        boolean result = (a >= 27) && (b > 40000);
        String sex = "man";
          if (a >= 27 && b > 40000) {
              System.out.println("Одобрен кредит");
          } else {
              System.out.println("Кредит не одобрен");
          }

          if ("man".equals(sex)){
              System.out.println("Уважаемый");
          }
          if ("woman".equals(sex)){
              System.out.println("Уважаемая");
          } else {
              System.out.println("Пол не указан");
          }
    }
}
