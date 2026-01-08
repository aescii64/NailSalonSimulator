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
        employeeQ.add(employee);

    }

    // add customers to create customer line
    public void addCustomer(Customer customer) {
        customerLine.add(customer);

    }

    // test workday simulation
    public void testSim(){
        for ( Employee e : employeeQ) {
            System.out.println(e.getName() + " has arrived");
            System.out.println("\n");
        }

        for (Customer c : customerLine) {
            System.out.println(c.getName() + " just checked in");
            System.out.println("\n");
        }

    }


}
