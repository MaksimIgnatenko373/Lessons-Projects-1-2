package arrays.two;

public class ArrayTwoTask2Training {
    public static void main(String[] args) {
        int[][] firstArray = new int[2][1];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                firstArray[i][j] = (int) (Math.random()*999 );
                System.out.println(firstArray[i][j]);
            }
        }
    }
}
