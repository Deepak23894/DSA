
public class Employee implements Comparable<Employee> {
    public String name;
    public int age;
    public int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
       // if (age == e.age)
            return e.salary - salary;
       // return age - e.age;
    }
    public String toString()
    {
    return name+ " "+age+" "+salary;
    }
}