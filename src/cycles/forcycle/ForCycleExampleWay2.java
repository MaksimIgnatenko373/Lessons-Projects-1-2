package cycles.forcycle;

//задача 1: вывести нечетные числа от 0 до 100
public class ForCycleExampleWay2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
}
