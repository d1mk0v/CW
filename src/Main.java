//        Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.
//
//        С помощью вашей программы бухгалтерия и отдел кадров смогут узнавать следующую информацию:
//
//        1. Получить список всех сотрудников.
//        2. Посчитать сумму затрат на зарплаты.
//        3. Найти сотрудника с минимальной заплатой.
//        4. Найти сотрудника с максимальной зарплатой.
//        5. Подсчитать среднее значение зарплат.
//
//        - **Базовая сложность**
//        1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//        2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//        3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//        4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//        5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//        6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
//        7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//        8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//              - Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//              - Посчитать сумму затрат на зарплаты в месяц.
//              - Найти сотрудника с минимальной зарплатой.
//              - Найти сотрудника с максимальной зарплатой.
//              - Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//              - Получить Ф. И. О. всех сотрудников (вывести в консоль).

public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа");

        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Employee employee1 = new Employee(person1, 1, 125340);
        Person person2 = new Person("Петров", "Сергей", "Иванович");
        Employee employee2 = new Employee(person2, 2, 65250);
        Person person3 = new Person("Осипов", "Макар", "Русланович");
        Employee employee3 = new Employee(person3, 3, 76850);
        Person person4 = new Person("Кошелев", "Исаак", "Евгеньевич");
        Employee employee4 = new Employee(person4, 4, 56600);
        Person person5 = new Person("Данилова", "Татьяна", "Александровна");
        Employee employee5 = new Employee(person5, 5, 96450);

        Employee[] employees = new Employee[10];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;

        allEmployees(employees);
        totalSalary(employees);
        minSalary(employees);
        maxSalary(employees);
        averageSalary(employees);
        fullNameOfEmployees(employees);
        
    }
    public static void allEmployees (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }
    public static void totalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в месяц составила " + totalSalary);
    }
    public static void minSalary(Employee[] employees) {
        double minSalary = 1_000_000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата " + minSalary);
    }
    public static void maxSalary(Employee[] employees) {
        double maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата " + maxSalary);
    }
    public static void averageSalary(Employee[] employees) {
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
            }
        }
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count++;
            }
        }
        double averageSalary = totalSalary / count;
        System.out.println("Средняя зарплата за месяц составила " + averageSalary);
    }

    public static void fullNameOfEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getPerson());
            }
        }
    }
}
