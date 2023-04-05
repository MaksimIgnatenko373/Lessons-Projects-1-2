package cycles.whilecycle;

//Todo вывести значения от 0 до -100 используя While.
public class WhileTask {
    public static void main(String[] args) {
        int count = 0;

//Todo вывести значения от 0 до -100 используя While.
        //по примеру написать While c декрементом от 0 до -100
//        do {
//            count --;
//            System.out.println(count);
//        } while (count <= 0 && count >= -100);


//Todo вывести значения от 0 до -100 используя do While.
        //выражения внутри if и внутри while можно брать в скобки для повышения читаемости.
        while ((count <= 0) && (count >= -100)){
            count --;
            System.out.println(count);
        }
    }
}
