import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Iterator;

public class WorkDay {

    private static Queue<Employee> employeeQ;
    private Queue<Customer> customerQ;
    private List<ServiceSelector> serviceRequest;

    public WorkDay(Queue<Employee> employeeQ, Queue<Customer> customerQ, List<ServiceSelector> serviceRequest) {

        this.employeeQ = employeeQ;
        this.customerQ = customerQ;
        this.serviceRequest = serviceRequest;
    }

    // add employees to the turn rotation
    public void addEmployee(Employee employee) {
        employeeQ.add(employee);

    }

    // add customers to create customer line
    public void addCustomer(Customer customer) {
        customerQ.add(customer);

    }


    // test workday simulation
    private void clockIn(){
        System.out.println("---- Employees are arriving!! ----\n");
        for ( Employee e : employeeQ) {
            System.out.println(e.getName() + " has arrived");
            System.out.println("\n");
        }
    }

    private void customerRequests() {
        System.out.println("---- Customers are checking in!! ----\n");
        for (Customer c : customerQ) {
            System.out.println(c.getName() + " just checked in");
            System.out.println(c.getName() + " would like a " + c.getRequestedService());
            System.out.println("\n");

        }

    }

    private  void assignEmployees() {
        //Customer currentCustomer = customerQ.element(); wrong
        // is there still work to do?
        while (!employeeQ.isEmpty() && !customerQ.isEmpty()) {
            //Customer currentCustomer = customerQ.element(); wrong
            // who handles the work
            for (Employee employee : employeeQ) {
                Customer currentCustomer = customerQ.element();
                // work has been assigned
                if (employee.canPerform((currentCustomer.getRequestedService()))) {
                    System.out.println(employee.getName() + " can perform " + currentCustomer.getRequestedService() + " for " + currentCustomer);
                    // work is done remove them from the lines
                    employeeQ.remove(employee);
                    customerQ.remove(currentCustomer);
                }

            }

        }
    }


    public  void assignTechs() {

        clockIn();
        customerRequests();
        assignEmployees();

    }


}
