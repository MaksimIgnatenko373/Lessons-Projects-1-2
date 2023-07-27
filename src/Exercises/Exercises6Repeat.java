package Exercises;

public class Exercises6Repeat {
    public static void main(String[] args) {
        int n = 10;
        int[] firstArray = new int[n];
        for (int i = 0; i < n; i++) {
            firstArray[i] = (int) (Math.random() * 999);
            System.out.println(firstArray[i]);
        }
        int temp;
        for (int i = 0; i < n; i++) {
            if (firstArray[0] > firstArray[i + 1]) {
                temp = firstArray[0];
                firstArray[0] = firstArray[i + 1];
                firstArray[i + 1] = temp;
                System.out.println("firstArray[0] = " + firstArray[0]);
                System.out.println("firstArray[1] = " + firstArray[i + 1]);
            } else {
                return;
            }
        }
    }
}
