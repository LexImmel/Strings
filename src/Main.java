public class Main {
    public static void main(String[] args) {
        //Задача 1: Вывод полного имени в консоль в формате Ф.И.О.
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        //Задача 2: Перевод всего Ф.И.О. в заглавные буквы для отчёта используя предыдущую задачу
        System.out.println("Задача 2");
        System.out.println(fullName.toUpperCase());
        //Задача 3: Замена буквы Ё на букву Е во всём Ф.И.О.
        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";//Необходимо использовать метод, меняющий написание данных строки
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);
    }
}