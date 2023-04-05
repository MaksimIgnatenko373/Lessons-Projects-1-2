package conditions;
//Есть 2 группы пользователей и 4 вида странц для просмотра. Администаторы пространств. имеет доступ только к определенному прсотрантсву. СуперАдминистратор - имеет доступ везде. Обычные пользователь только к бесплатным страницам. Платный пользователь к платному и бесплатным страницам.
//Страница можем быть платной/бесплатной. Обязательно принадлежит какому-то пространству. Пространство - это просто тема. Например спорт, технологии, наука.
//Также страница может иметь настройки. В Настройки может попасть только администратор прострнатсва(то есть тот, у кторого совпадает тема) или супер Администратор
// Правильного решения нет =) просто творчество из проверок if
public class Exercise17Logic {
    public static void main(String[] args) {
         String pagetopic = "Политика" ;//, "Экономика" , "Спорт";
         String privilege = "платная";//, "бесплатная";
         String user  = "платный";//, "СуперАдмин.", "Обычный", "Платный";

         String pagetopicCurrent = "Политика" ;//, "Экономика" , "Спорт";
         String privilegeCurrent = "платная";//, "бесплатная";
         String userCurrent  = "Тем. Администратор";//, "СуперАдмин.", "Обычный", "Платный";

        if (user.equals(userCurrent)){
            if (pagetopic.equals(pagetopicCurrent)){
                if (privilege.equals(pagetopicCurrent)){
                    System.out.println("Отобразить страницу");
                } return;
            }
        }
        if ("Политика".equals(pagetopic)) {
            System.out.println("Странница бесплатная");
            return;
        }
        if ("Экономика".equals(pagetopic)) {
            System.out.println("Страница платная");
            return;
        }
        if ("Спорт".equals(pagetopic)) {
            System.out.println("Страница двойного формата");
            return;
        }
        if ("Тематический администратор".equals(user)) {
            System.out.println("Доступ к странице экономика");
            return;
        }
        if ("СуперАдминистратор".equals(user)) {
            System.out.println("Безграничный доступ");
            return;
        }
        if ("Обычный пользователь".equals(user) && "Платный пользователь".equals(user)) {
            System.out.println("Доступ к страницам политика и спорт");
            return;
        }
        if ("Платный пользователь".equals(user)) {
            System.out.println("Доступ к страницам экономика и спорт");
            return;
        }
        if ("Тематический администратор".equals(user) || "СуперАдминистратор".equals(user)) {
            System.out.println("Возможна настройка страницы");
            return;
        }
    }
}
