public class Hw_5_10_Employee {
   private String name;
   private double salary;

    public Hw_5_10_Employee() {
        name = "Ali";
        salary = 500000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double salary_percentage(){
        this.salary=salary+salary*0.1;
        return this.salary;
    }
}
