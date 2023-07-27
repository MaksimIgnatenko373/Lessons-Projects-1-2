package arrays;
//Задача 3. Заполнить массивы только нечетными числами от 0 до 100
public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] firstArray = new int[100];
        for (int i = 0; i < 100; i++) {
            firstArray[i] = i;
            if ((i % 2) != 0) {
                System.out.println(firstArray[i]);
            }
        }
    }
}
