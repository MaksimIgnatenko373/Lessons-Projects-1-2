package cycles.dowhile;

public class WhileTask3 {
    public static void main(String[] args) {
        int a2 = 2;
        int a3 = 2;
        do {
            a2 = a2 * a3;
            System.out.println(a2);
            //TODO поправить условие
        } while (a2 < 1024);
    }
}
