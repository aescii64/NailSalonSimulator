import java.util.Set;

public class Employee {

    private final String name;
    private final Set<ServiceCategory> acceptedCategories;

    public Employee(String name, Set<ServiceCategory> acceptedCategory) {
        this.name = name;
        this.acceptedCategories = acceptedCategory;
    }

    public String getName() {
        return name;
    }

    public Set<ServiceCategory> getAcceptedCategories() {
        return acceptedCategories;
    }

    public boolean canPerform(Service service) {
        return acceptedCategories.contains(service.getCategory());
    }

    @Override
    public String toString() {
        return name;
    }
}
