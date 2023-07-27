package arrays;
// Задача. создать заполнить массив от 0 до 99
public class ArrayPractice0 {
    public static void main(String[] args) {
        int[] firstArray = new int[100];
        for (int i = 0; i < 100; i++) {
            firstArray[i] = i;
            System.out.println(firstArray[i]);
        }
    }
}
