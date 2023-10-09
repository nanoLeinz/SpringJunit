package id.aplikasi.karyawan.view;

import id.aplikasi.karyawan.model.Employee;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTry {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        // Adding real employee data
        employeeList.add(new Employee(1, "John Doe", LocalDateTime.of(1990, 5, 15, 0, 0), "123 Main Street"));
        employeeList.add(new Employee(2, "Jane Smith", LocalDateTime.of(1985, 8, 23, 0, 0), "456 Oak Avenue"));
        employeeList.add(new Employee(3, "Sarah Johnson", LocalDateTime.of(1988, 3, 10, 0, 0), "789 Elm Avenue"));
        employeeList.add(new Employee(4, "Michael Brown", LocalDateTime.of(1995, 12, 8, 0, 0), "101 Pine Street"));
        employeeList.add(new Employee(5, "Jennifer Davis", LocalDateTime.of(1983, 7, 20, 0, 0), "202 Maple Lane"));
        employeeList.add(new Employee(6, "David Wilson", LocalDateTime.of(1979, 11, 4, 0, 0), "303 Cedar Drive"));
        employeeList.add(new Employee(7, "Lisa Taylor", LocalDateTime.of(1992, 2, 18, 0, 0), "404 Birch Road"));
        employeeList.add(new Employee(8, "James Smith", LocalDateTime.of(1982, 6, 14, 0, 0), "505 Willow Lane"));
        employeeList.add(new Employee(8, "James Anderson", LocalDateTime.of(1987, 6, 30, 0, 0), "505 Cedar Avenue"));
        employeeList.add(new Employee(9, "Emily Harris", LocalDateTime.of(1991, 9, 14, 0, 0), "606 Oak Street"));
        employeeList.add(new Employee(10, "Matthew Rodriguez", LocalDateTime.of(1982, 4, 3, 0, 0), "707 Pine Lane"));


        //Average Age
        Double average = employeeList.stream().collect(Collectors.averagingInt(s -> s.getAges()));
        System.out.println("Rata-rata umur : " + average);

        Map<Character, List<Employee>> employeesGroupedByFirstChar = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getName().charAt(0)));

        employeesGroupedByFirstChar.forEach((firstChar, employees) -> {
            System.out.println("Employees with names starting with " + firstChar + ":");
            employees.forEach(employee -> System.out.println(employee.getName()));
            System.out.println("~~~");
        });

    }
}
