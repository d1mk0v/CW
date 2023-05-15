public class Employee {
    private Person person;
    private int department;
    private double salary;
    private int id;
    private static int counter = 0;

    public Employee(Person person, int department, double salary) {
        this.person = person;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public Person getPerson() {
        return this.person;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}