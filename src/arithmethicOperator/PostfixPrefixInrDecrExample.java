package arithmethicOperator;
public class PostfixPrefixInrDecrExample {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        //Increment begin
        //Постфиксная форма аналогично a = a + 1
        a++;
        System.out.println(a);
        //Префиксная форма аналогично b = b + 1
        ++b;
        System.out.println(b);
        //разница между префиксом и посфиксной ?
        // Ответ на вопрос: разница заключается в определении значений переменных
        //TODO - самому
        //Increment end

        //Decrement begin
        int c = 0;
        int d = 0;
        //Постфиксная форма аналогично с=с-1
        c--;
        //Префиксная форма аналогично с=с-1
        --c;
        //Decrement end
    }
}
