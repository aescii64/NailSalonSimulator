import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class WorkDay {

    private Queue<Employee> employeeQ;
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
    public void clockIn(){
        System.out.println("---- Employees are arriving!! ----\n");
        for ( Employee e : employeeQ) {
            System.out.println(e.getName() + " has arrived");
            System.out.println("\n");
        }
    }

    public void customerRequests() {
        System.out.println("---- Customers are checking in!! ----\n");
        for (Customer c : customerQ) {
            System.out.println(c.getName() + " just checked in");
            System.out.println(c.getName() + " would like a " + c.getRequestedService());
            System.out.println("\n");

        }
    }

    public  void assignTechs() {
        // assigning technicians to customers
        /* Not every nail tech can perform every service (acceptedCategories)
        *
        * this logic should:
        *  1: check what service the customer is requesting
        *  2: check that the service request and the employee accepted categories match
        *  3: while both Q's are not empty,
        *  4: peek at both Q's to see if the service request and category match.
        *  5: track the nail  technicians you've checked to do the service. keep checking until you find the right one
        *  6: assign the right tech to the customer
        *  7: print a statement that there's no one available for a customer if there is no tech assigned to that customer
        * */



    }


}
