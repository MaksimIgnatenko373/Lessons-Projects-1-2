package arrays;
//Задача 1. Создать заполнить массив от 99 до 0
public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] firstArray = new int[100];
        for (int i = 99; i >= 0; i--) {
            firstArray[i] = i;
            System.out.println(firstArray[i]);
        }
    }
}
