

public class Main {


    private final static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Сидор Петрович", 3, 58000);
        employees[1] = new Employee("Сидоров Сидор Сидорович", 2, 56000);
        employees[2] = new Employee("Матвеев Матвей Матвеевич", 2, 59000);
        employees[3] = new Employee("Сергеев Сергей Сергеевич", 4, 57000);
        employees[4] = new Employee("Викторов Виктор Викторович", 5, 65000);
        employees[5] = new Employee("Аелксеев Сергей Алексеевич", 2, 75000);
        employees[6] = new Employee("Аелксеев Алексей Cергеевич", 3, 75000);
        employees[7] = new Employee("Матвеев Алексей Алексеевич", 5, 78000);
        employees[8] = new Employee("Аелксеев Александр Алексеевич", 3, 85000);
        employees[9] = new Employee("Алухин Алексей Михайлович", 5, 77000);
        print();
        System.out.println("Сумма ЗП сотрудников " + calculateSumOfSalaries());
        System.out.println("Сотрудник с мин ЗП " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с макс ЗП  " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП сотруднико " + calculateAverageOfSalaries());
        printFullName();
    }

    private static void print() {
        for (Employee employees : employees) {
            System.out.println(employees);

        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employees : employees) {
            sum = sum + employees.getSalary();
        }
        return sum;

    }

    private static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries() / employees.length;


    }


    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;

    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }

        return employeeWithMaxSalary;
    }

    private static void printFullName() {
        for (Employee employees : employees) {
            System.out.println(employees.getFullName());
        }

    }

}







