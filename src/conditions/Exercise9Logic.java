package conditions;

public class Exercise9Logic {
    public static void main(String[] args) {
        int a = 6;
        String skill1 = "java";
        String skill2 = "git";
        String skill3 = "ide";
        //TOdo вложенный If как он будет равен текущему
        if (a > 6 && "java".equals(skill1) && "git".equals(skill2) && "ide".equals(skill3)) {
            System.out.println("Кандидатура рассматривается");
        } else {
            System.out.println("Кандидатура не рассматривается");
        }
    }
}
