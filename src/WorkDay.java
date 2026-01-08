import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class WorkDay {

    private Queue<Employee> employeeQ;
    private Queue<Customer> customerLine;
    private List<ServiceSelector> serviceRequest;

    public WorkDay(Queue<Employee> employeeQ, Queue<Customer> customerLine, List<ServiceSelector> serviceRequest) {

        this.employeeQ = employeeQ;
        this.customerLine = customerLine;
        this.serviceRequest = serviceRequest;
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
    public void clockIn(){
        System.out.println("---- Employees are arriving!! ----\n");
        for ( Employee e : employeeQ) {
            System.out.println(e.getName() + " has arrived");
            System.out.println("\n");
        }
    }

    public void customerRequests() {
        System.out.println("---- Customers are checking in!! ----\n");
        for (Customer c : customerLine) {
            System.out.println(c.getName() + " just checked in");
            System.out.println(c.getName() + " would like a " + c.getRequestedService());
            System.out.println("\n");

        }
    }

    public void assignTechs() {
        // assigning technicians to customers
        while (!employeeQ.isEmpty() && !customerLine.isEmpty()) {
            Customer customer = customerLine.poll();
            Employee employee = employeeQ.poll();

            if (employee.canPerform(customer.getRequestedService())) {
                System.out.println(employee.getName() + " will take care of " + customer.getName());
                customerLine.remove(customer);
                employeeQ.remove(employee);
            } else {
                System.out.println("There are no available technicians for " + customer.getName() + "'s service");
                break;
            }
        }
    }


}
