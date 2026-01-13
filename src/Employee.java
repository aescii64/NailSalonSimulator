import java.util.Set;

public class Employee {

    private final String name;
    private final Set<ServiceCategory> acceptedCategories;
    private double totalEarnings;

    public Employee(String name, Set<ServiceCategory> acceptedCategory) {
        this.name = name;
        this.acceptedCategories = acceptedCategory;

    }

    public String getName() {
        return name;
    }

    public Double getTotalEarnings() {
        return totalEarnings;
    }

    public Set<ServiceCategory> getAcceptedCategories() {
        return acceptedCategories;
    }

    public boolean canPerform(Service service) {
        return acceptedCategories.contains(service.getCategory());
    }

    public void addEarnings(double price){
        totalEarnings += price;
    }
    @Override
    public String toString() {
        return name;
    }
}
