public class Customer {

    private final String name;
    private final Service requestedService;

    public Customer(String name, Service requestedService) {
        this.name = name;
        this.requestedService = requestedService;
    }

    public String getName() {
        return name;
    }

    public Service getRequestedService() {
        return requestedService;
    }

    @Override
    public String toString() {
        return name;
    }
}
