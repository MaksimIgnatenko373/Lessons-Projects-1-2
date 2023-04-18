package conditions;

public class Exercise3LogicOperatorOrAnd {

    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        //Изменить значения a и b таким образом, чтобы
        //1.Выполнился первый блок
        //2.Выполнился второй блок
        if (a != b && a > b) {
            System.out.println("выполнился первый блок кода");
            // Код будет выполнен, если и первое, и второе условие
            // окажутся верными
        }
        if (a != b || a == b) {
            System.out.println("выполнился второй блок кода");
            // Код будет выполнен, если или первое, или второе условие
            // окажется верным
        }
    }
}
