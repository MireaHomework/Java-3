package pw3.task7;

public class Task7 {
    /*
    3. Разработать класс Отчет о сотрудниках
    1) Создать класс Employee, у которого есть переменные класса -
    fullname, salary.
    2) Создать массив, содержащий несколько объектов этого типа.
    3) Создать класс Report со статическим методом generateReport,
    в котором выводится информация о зарплате всех сотрудников.
    4) Используйте форматирование строк. Пусть salary будет
    выровнено по правому краю, десятичное значение имеет 2 знака после
    запятой и можете добавить что-нибудь свое.
     */
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Employee employee = new Employee("Семёнов О. В.", 989.989);
        Employee employee1 = new Employee("Иванов В. А.", 7856.7856);
        Employee employee2 = new Employee("Кривов М. Я.", 1234.1234);

        employees[0] = employee;
        employees[1] = employee1;
        employees[2] = employee2;

        System.out.print(Report.generateReport(employees));
    }
}
