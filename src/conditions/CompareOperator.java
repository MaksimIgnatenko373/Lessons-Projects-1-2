package conditions;

public class CompareOperator {
    public static void main(String[] args) {

        //task 1 вывести в консоль значение каждой переменной
        boolean isBigger = 5 > 7;
        boolean isNotEqual = 5 != 7;
        boolean isLess = 5 < 7;
        boolean isEqual = 5 == 7;

        //пример вывода первой переменной
        System.out.println(isBigger);
        System.out.println(isNotEqual);
        System.out.println(isLess);
        System.out.println(isEqual);
        //Todo остальные 3 аналогично

        //task 2 написать выражения справа от "=" такие чтобы выражения вернули true
        //использовать оператор >
        boolean isBigger1 = 10 > 9;
        boolean isBigger2 = 5 > 5;
        System.out.println(isBigger1);
        System.out.println(isBigger2);

        //использовать оператор !=
        boolean isNotEqual1 = 4!=8;
        boolean isNotEqual2 = 3!=3;
        System.out.println("использование оператора != :");
        System.out.println(isNotEqual1);
        System.out.println(isNotEqual2);
        //использовать оператор <
        boolean isLess1 = 3 < 4;
        boolean isLess2 = 6 < 5;
        System.out.println(isLess1);
        System.out.println(isLess2);

        //использовать оператор ==
        boolean isEqual1 = 10 == 10;
        boolean isEqual2 = 4 == 9;
        System.out.println(isEqual1);
        System.out.println(isEqual2);

        //использовать оператор <=
        boolean lessOrEqual1 = 4 <= 4;
        boolean lessOrEqual2 = 3 <= 6;
        boolean lessOrEqual3 = 5 <= 2;
        System.out.println(lessOrEqual1);
        System.out.println(lessOrEqual2);
        System.out.println(lessOrEqual3);

        //использовать оператор >=
        boolean moreOrEqual1 = 5 >= 5;
        boolean moreOrEqual2 = 6 >= 4;
        boolean moreOrEqual3 = 1 >= 7;
        System.out.println(moreOrEqual1);
        System.out.println(moreOrEqual2);
        System.out.println(moreOrEqual3);





    }
}
