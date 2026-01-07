import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class WorkDay {

    private Queue<Employee> employeeQ;
    private List<Customer> customerLine;

    public WorkDay(Queue<Employee> employeeQ, ArrayList<Customer> customerLine) {

        this.employeeQ = employeeQ;
        this.customerLine = customerLine;
    }

    // add employees to the turn rotation
    public void addEmployee(Employee employee) {
        employeeQ.offer(employee);
        System.out.println(employee.getName() + " has arrived!");
    }

    // add customers to create customer line
    public void addCustomer(Customer customer) {
        customerLine.add(customer);
        System.out.println(customer.getName() + " just checked in!");
    }

    // pair customers wth
}
