package pw3.task7;

import java.util.Formatter;

public class Report {
    public static String generateReport(Employee[] employees) {
        Formatter fmt = new Formatter();
        for (Employee employee : employees) {
            fmt.format("Имя: %s \t\t\t Зарплата: %.2f\n", employee.getFullname(), employee.getSalary());
        }
        return "Отчёт\n" + fmt.out();
    }
}
