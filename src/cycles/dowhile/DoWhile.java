package cycles.dowhile;

public class DoWhile {
    public static void main(String[] args) {
        int a = 0;
        //TOdo отличие от While в том, что гарантировано выполнится 1 раз и уже потом выполнит проверку
        do {
            System.out.println(a);
        } while ( a < 10);

        //TODO подумать где имеет смысл применение данного цикла?
    }
}
