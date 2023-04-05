package cycles.forcycle;

public class ForTaskExample {
    public static void main(String[] args) {
        System.out.println("блок If");
        if (5 > 0){
            System.out.println("Этот код всегда выполнится");
        }

//        if (a > 0){
//            System.out.println("5 больше нуля");
//        }

        int a = 0;
        while (a > 0){
            System.out.println(a);
            a--;
        }
        int b = 0;
        do {
            System.out.println(b);
            b--;
        } while (b > 0);

    }
}
