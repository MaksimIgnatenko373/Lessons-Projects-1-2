package arrays;
/*
1. Создать массив размером 100
2. Заполнить массив случайными элементами (в диапозоне от 0 до 999), используя Math.random()(смотри пример задачу номер 7)
3. Найти среднее значение
4. Вывести среднее значение в консоль;
 */
public class ArrayPractice11FindAvg {
    public static void main(String[] args) {
        // 1. Создаём массив размером (n)
        int n = 4;
        int[] firstArray = new int[n];
        // 2. Заполняем массив случайными элементами (диапозон берём от 0 до 999)
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random()* 999);
            System.out.println(firstArray[i]); // выводим результат в консоль (для нагляднго облегчения)
        }
        System.out.println();
        // 3. Находим максимальное значение (этот шаг решения задачи подразделён на 2 подпукнта)
        // 3.1 Сперва находим сумму элементов в массиве
        int sum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            sum+=firstArray[i];
        }
        System.out.println("Сумма элементов масисива = " + sum);
        // 3.2 Теперь можно находить среднюю арифметическую
        int avg = firstArray[0];
        for (int i = 0; i < firstArray.length; i++) {
            //Todo изменить алгоритм
          avg = sum/firstArray.length;
        }
        // 4. Выводим результат в консоль
        System.out.println("Среднее значение = " + avg);
    }
}
