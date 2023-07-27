package arrays;

/*
1. Создать массив размером 100;
2. Заполнить массив случайными элементами (в диапозоне от 0 до 999), используя Math.random()(смотри пример задачу номер 7);
3. Найти максимальное значение;
4. Вывести максисмальное значение в консоль;
 */
public class ArrayPractice11FindMax {
    public static void main(String[] args) {
        // 1. Создаём массив размером (n)
        int n = 3;
        int[] firstArray = new int[n];
        // 2. Заполняем массив случайными элементами (диапозон берём от 0 до 999).
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 999); // Используем Math.random()
            System.out.println(firstArray[i]); // выводим результат в консоль (для нагляднго облегчения)
        }
        // 3. Находим максимальное значение;
        int max = firstArray[n - 1];
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] > max) {
                max = firstArray[i];
            }
        }
        // 4. Выводим результат в консоль
        System.out.println("Максимальное значение = " + max);
    }
}
