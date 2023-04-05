package assignmentOperator;

public class AssignmentExample1 {
    public static void main(String[] args) {
        // 1-й пример (постфикс)
        int a = 7; // Получается 8
        int b = a++; // Получается 7
        System.out.println(a);
        System.out.println(b);
        // 2-й пример (префикс)
        int c = 5; // получается 6
        int d = ++c; // получается 6
        System.out.println(c);
        System.out.println(d);
        // 3-й пример (префикс)
        int e = 9;
        int f = --e;
        System.out.println(e); // получается 8
        System.out.println(f); // получается 8
        // 4-й пример (постфикс)
        int g = 10;
        int h = g--;
        System.out.println(g); // Получается 9
        System.out.println(h); // Получается 10
    }
}
