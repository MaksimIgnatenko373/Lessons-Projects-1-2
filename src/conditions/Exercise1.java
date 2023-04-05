package conditions;

import java.util.Scanner;
public class Exercise1 {
     public static void main (String [] args)  {

         System.out.println ("Введите число");
         //1. Создать объект Scanner. Alt + enter, чтобы импортировать
         Scanner in = new Scanner(System.in);
         //2. вызвать метод чтения числа
         int number = in.nextInt();

         if(number % 2 == 0)
             System.out.println(number + " это четное число");
         else
             System.out.println(number + " это нечетное число");
     }
}
