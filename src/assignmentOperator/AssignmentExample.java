package assignmentOperator;
public class AssignmentExample {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;

        //Оператор присваивания "добавления" . Смысл a = a + b
        a += b;

        //Смысл a = a + 1
        a += 1;

        //Смысл b = b - c
        b -= c;

        //Смысл b = b - 1
        b -= 1;

        //Смысл c = c * b
        c *=b;

        //Смысл c = c / b
        c /=b;

        //общая логика повторяется для операторов
    }
}
