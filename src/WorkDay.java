import java.util.List;
import java.util.Queue;

public class WorkDay {

    private static Queue<Employee> employeeQ;
    private Queue<Customer> customerQ;
    private List<ServiceSelector> serviceRequest;
    private List<ServiceCategory> acceptedService;
    private List<Employee> allEmployees;
    private double salonTotalEarnings;

    public WorkDay(Queue<Employee> employeeQ, Queue<Customer> customerQ, List<ServiceSelector> serviceRequest, List<ServiceCategory> acceptedService, List<Employee> allEmployees, double salonTotalEarnings) {

        this.employeeQ = employeeQ;
        this.customerQ = customerQ;
        this.serviceRequest = serviceRequest;
        this.acceptedService = acceptedService;
        this.allEmployees = allEmployees;
        this.salonTotalEarnings = salonTotalEarnings;

    }

    // add employees to the turn rotation
    public void addEmployee(Employee employee) {
        employeeQ.add(employee);
        allEmployees.add(employee);

    }

    // add customers to create customer line
    public void addCustomer(Customer customer) {
        customerQ.add(customer);

    }


    // test workday simulation
    private void clockIn(){
        System.out.println("---- Employees are arriving!! ----\n");
        for ( Employee e : employeeQ) {
            System.out.println(e.getName() + " has arrived, they can perform " + e.getAcceptedCategories());
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
        for (Employee employee : employeeQ) {
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
        boolean serviceMismatch = false;

        clockIn();
        customerRequests();

        while (!employeeQ.isEmpty() && !customerQ.isEmpty()) {
            Employee employeeToBeRemoved = findCorrectEmployees();
            Customer currentCustomer = customerQ.element();

            if (employeeToBeRemoved == null) {
                serviceMismatch = true; // employee can't perform that service
                break;
            }

            double price = currentCustomer.getRequestedService().getPrice();
            employeeToBeRemoved.addEarnings(price);
            salonTotalEarnings += price;

                employeeRemoval(employeeToBeRemoved);
                customerRemoval(currentCustomer);



        }
        System.out.println("\n---- The day is done!! ----\n");
        // check if anyone was left behind
        if(serviceMismatch){
            System.out.println("Some customers could not be served with the available employees :(");
        }
        else {
            System.out.println("Perfect Day :)");
        }
        System.out.println("\n---- Today's Earnings ----\n");
        for (Employee e: allEmployees){
            System.out.println(e.getName() + ": $" + e.getTotalEarnings() + "\n");
        }
        System.out.println("Salon Total Earnings: $" + salonTotalEarnings);

    }


}
