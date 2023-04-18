package arrays;

public class ArrayLesson {
    public static void main(String[] args) {

        //primitive
        int a = 6;

        //array as first Object
        int[] firstArray = new int[5];

        for (int i = 0; i < 5; i++) {
            firstArray[i] = i;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(firstArray[i]);
        }

        String[] stringArray = new String[3];
        stringArray[0] = "Alex";
        stringArray[1] = "Bob";
        stringArray[2] = "Alice";

        double[] doubleArraye = new double[2];

        long[] longArray = new long[2];
        longArray[0] = 1L;

        char[] charArray = new char[2];
        charArray[0] = 'a';
        charArray[1] = 'b';
        


        //Tasks:

        //1 создать заполнить массив от 99 до 0

        //2 создать массив String размером 3 и заполнить любыми 3 значениями

        //3 заполнить массиов только нечетными числами от 0 до 100

        //создать 2 массива. 1ый заполнить от 0 до 100. Второй заполнить значениями из первого в обратном порядке.

    }
}
