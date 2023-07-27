package arrays;

/*
1. Создать массив размером 100;
2. Заполнить массив случайными элементами (в диапозоне от 0 до 999), используя Math.random()(смотри пример задачу номер 7);
3. Отсортировать массив реализовав сортировку пузырьком (загуглить что это, понять как это).
Сортировка массива - это что? Реализция сортировки - как это? Пузырьком - это что ещё?        
 */

public class ArrayPractice14Sort {
    public static void main(String[] args) {
// 1. Создаём массив с размером 100
        int n = 100;
        int[] firstArray = new int[n];
        // 2. Заполняем массив случайными элементами. Задаём диапазон от 0 до 999
        for (int i = 0; i < 100; i++) {
            firstArray[i] = (int) (Math.random() * 999); // применяем Math.random()
            System.out.println(firstArray[i]);
        }
        // 3. Проводим сортировку (пузырьком)
        //идея сортировки пузырьком:
         int temp;
        // 3.1 Проходим по массиву.
        for (int i = 0; i < 100; i++) {
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
        /*
        // 3.2 Cравниваем два соседних элемента, если первый элемент больше, чем второй, то меняем их местами.
            firstArray[0] = firstArray[0];
            firstArray[1] = firstArray[1];
            if (firstArray[0] > firstArray[1]) {

            }
        }
        // 3.3 Переходим к следующему элементу (по порядку)

        // 3.4 Повторяем до конца массива

    }
}
}
/
         */