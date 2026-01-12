import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Iterator;

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
        * Employees enter EmployeeQ  e1 - e2 - e3 - e4
        * Customers enter customerQ  c1 - c2 - c3 - c4
        *
        * for c1's request we have to check who is first in the employeeQ
        * if e1 canPerform c1's request remove both e1 and c1 from their Q's
        * else - offer e1 back to his Q , poll the next e , repeat until you find the right e for the service request
        * */

        // as long as there are customers waiting and employees available
        while (!employeeQ.isEmpty() && !customerQ.isEmpty()) {

            // check if an employee can perform a service
            for (Employee employee : employeeQ) {
                if (employee.canPerform(customerQ.element().getRequestedService())) {
                    System.out.println(employee + " can perform " + customerQ.element().getRequestedService() + " for " + customerQ.element().getName());
                }
            }

        }




    }


}
