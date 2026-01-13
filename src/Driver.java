import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        Queue<Employee> employeeQ = new LinkedList<>();
        Queue<Customer> customerQ = new LinkedList<>();
        List<ServiceSelector> serviceRequest = new ArrayList<>();
        List<ServiceCategory> acceptedService = new ArrayList<>();
        List<Employee> allEmployees = new ArrayList<>();
        double salonTotalEarnings = 0.0;


        WorkDay workDay = new WorkDay(employeeQ, customerQ, serviceRequest, acceptedService, allEmployees, salonTotalEarnings);


        Employee e1 = new Employee("Paul", Set.of(ServiceCategory.MANICURE));
        Employee e2 = new Employee("Kate", Set.of(ServiceCategory.MANICURE));
        Employee e3 = new Employee("Tina", Set.of(ServiceCategory.PEDICURE));
        Employee e4 = new Employee("Julie",Set.of(ServiceCategory.PEDICURE));

        Customer c1 = new Customer("Maria", ServiceSelector.randomService());
        Customer c2 = new Customer("James", ServiceSelector.randomService());
        Customer c3 = new Customer("Adrian", ServiceSelector.randomService());
        Customer c4 = new Customer("Lisa", ServiceSelector.randomService());

        workDay.addEmployee(e1);
        workDay.addEmployee(e2);
        workDay.addEmployee(e3);
        workDay.addEmployee(e4);


        workDay.addCustomer(c1);
        workDay.addCustomer(c2);
        workDay.addCustomer(c3);
        workDay.addCustomer(c4);


        // run simulation
        workDay.workDaySim();

    }
}
