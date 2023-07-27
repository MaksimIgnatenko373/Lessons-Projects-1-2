package arrays;

/*
1. Создать массив размером 100
2. Заполнить массив случайными элементами (в диапозоне от 0 до 999), используя Math.random()(смотри пример задачу номер 7)
3. Найти произведение всех элементов массива;
4. Вывести произведение всех элементов массива в консоль;
//Todo расписать как в других - найти произведение всех элементов массива
 */
public class ArrayPractice12FindMultiple {
    public static void main(String[] args) {
        // 1. Создаём массив размером (n)
        int n = 3;
        int[] firstArray = new int[n];
        // 2. Заполняем массив случайными элементами (диапозон берём от 0 до 999).
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random()* 999); // Используем Math.random()
            System.out.println(firstArray[i]);
        }
        // 3. Находим произведение всех элементов массива
        int a = 1;
        for (int i = 0; i < firstArray.length; i++) {
           a *= firstArray[i]; // c *=b; (или можно прописать таким образом "a = a * firstArray[i]")
        }
        //4. Выводим результат в консоль
        System.out.println("Произведение элементов массива = " + a);
    }
}
