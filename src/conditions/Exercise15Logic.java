package conditions;
//12 месяцев (каждый представлен типом String) , в зависимости от месяца вывести время года , лето, осень, весна, зима
//использовать if
//текущий месяц один. То есть для текущего месяца надо вывести время года , к которому он относится
public class Exercise15Logic {
    public static void main(String[] args) {
        String currentMonth = "Январь";
          if ("Март".equals(currentMonth) || "Апрель".equals(currentMonth) || "Май".equals(currentMonth)) {
              System.out.println("Весна");
              return;
          }
          if ("Июнь".equals(currentMonth) || "Июль".equals(currentMonth) || "Август".equals(currentMonth)) {
            System.out.println("Лето");
            return;
          }
          if ("Сентябрь".equals(currentMonth) || "Октябрь".equals(currentMonth) || "Ноябрь".equals(currentMonth)) {
            System.out.println("Осень");
            return;
          }
          if ("Декабрь".equals(currentMonth) || "Январь".equals(currentMonth) || "Февраль".equals(currentMonth)) {
            System.out.println("Зима");
            return;
        }
    }
}
