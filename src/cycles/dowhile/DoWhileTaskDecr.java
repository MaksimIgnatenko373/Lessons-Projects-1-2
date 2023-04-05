package cycles.dowhile;

public class DoWhileTaskDecr {
    //TODO по аналогии с примером в классе WhileExample используя count-- или count-=1 вывести числа от 10 до 0. соотевтсвенно в count должно хранится 10;

    public static void main(String[] args) {
        // пример 1
        int count = 10;
        do {
            System.out.println(count);
            count--;
        } while (count < 10 && count >= 0);

        // ПРИМЕР 2
        int count1 = 10;
        do {
            System.out.println(count1);
            count1-=1;
        } while (count1 < 10 && count1 >= 1);
    }
}




