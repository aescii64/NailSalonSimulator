import java.util.List;
import java.util.Queue;

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

    public Employee findCorrectEmployees() {
        // handles traversal
        for (Employee employee : employeeQ) {
            // find the first customer in line
            Customer currentCustomer = customerQ.element();
            if (employee.canPerform(currentCustomer.getRequestedService())) {
                System.out.println(employee.getName() + " will perform " + currentCustomer.getName() +"'s " + currentCustomer.getRequestedService());
                return employee;
            }

        }
        return null;
    }



    public void employeeRemoval(Employee employee) {
        employeeQ.remove(employee);
        System.out.println(employee + " completed the service and has left" );
    }

    public void customerRemoval(Customer customer){
        customerQ.remove(customer);
        System.out.println(customer + " has left");
    }

    public void workDaySim() {

        clockIn();
        customerRequests();

        while (!employeeQ.isEmpty() && !customerQ.isEmpty()) {
            Employee employeeToBeRemoved = findCorrectEmployees();
            Customer currentCustomer = customerQ.element();
            if (employeeToBeRemoved == null) {
                break;
            } else {
                employeeRemoval(employeeToBeRemoved);
                customerRemoval(currentCustomer);

            }
        }
        System.out.println("\n\nThere are no more customers left, the work day is done :)");
    }
}
