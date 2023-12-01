import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSort {
    public static void main(String[] args) {
        Employee[] e =new Employee[4];
        e[0]= new Employee("Raju", 26, 50000);
        e[1]= new Employee("Venky", 36, 250000);
        e[2]= new Employee("yadav", 16, 550000);
        e[3]= new Employee("susil", 23, 17000);
        Arrays.sort(e);
        System.out.println("After sorting "+ Arrays.toString(e));
        List<Employee> r= Arrays.asList(e);
        Collections.sort(r, new Comparator<Employee>(){
            public int compare(Employee e1, Employee e2)
            {
                return e1.age - e2.age;
            }
        });
        System.out.println(r);
        Collections.sort(r, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary-o2.salary;
            }
        });
        System.out.println(r);

    }
}
