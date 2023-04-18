package arrays;
//Задача 4. Создать 2 массива. 1ый заполнить от 0 до 100. Второй заполнить значениями из первого в обратном порядке.
public class ArrayPractice4 {
    public static void main(String[] args) {
       int [] firstArray = new int [100];
        for (int i = 0; i < 100; i++) {
            firstArray[i] = i;
            System.out.println(firstArray[i]);
        }

     int[] secondArray = new int[100];
     for (int i = 99; i >= 0; i--) {
      secondArray[i] = i;
      System.out.println(secondArray[i]);
        }
    }
}
