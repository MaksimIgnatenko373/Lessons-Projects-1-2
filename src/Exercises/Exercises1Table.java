package Exercises;
/* Задача. Необходимо вывести на экран таблицу умножения на 3:
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
3*10=30
*/
public class Exercises1Table {
    public static void main(String[] args) {
        for (int i = 3; i <= 3; i++) {
            for (int j = 1; j <= 10; j++){
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
    }
}
