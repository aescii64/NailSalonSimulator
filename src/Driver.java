import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        Queue<Employee> employeeQ = new LinkedList<>();
        ArrayList<Customer> customerLine = new ArrayList<>();

        WorkDay workDay = new WorkDay(employeeQ, customerLine);

        Employee e1 = new Employee("Paul", Set.of(ServiceCategory.MANICURE));
        Employee e2 = new Employee("Kate", Set.of(ServiceCategory.MANICURE));

        Customer c1 = new Customer("Maria", Service.BASIC_MANICURE);
        Customer c2 = new Customer("James", Service.BASIC_MANICURE);

        workDay.addEmployee(e1);
        workDay.addEmployee(e2);

        workDay.addCustomer(c1);
        workDay.addCustomer(c2);


        workDay.testSim();
    }
}
