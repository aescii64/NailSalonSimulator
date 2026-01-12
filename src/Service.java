public enum Service {

    BASIC_MANICURE("Basic Manicure", 20.00, ServiceCategory.MANICURE),
    GEL_MANICURE("Gel Manicure", 40.00, ServiceCategory.MANICURE),
    DELUXE_MANICURE("Deluxe Manicure", 55.00, ServiceCategory.MANICURE),
    BASIC_PEDICURE("Basic Pedicure", 35.00, ServiceCategory.PEDICURE),
    SPA_PEDICURE("Spa Pedicure", 45.00, ServiceCategory.PEDICURE),
    DELUXE_PEDICURE("Deluxe Pedicure", 50.00, ServiceCategory.PEDICURE);


    private final String name;
    private final double price;
    private final ServiceCategory category;



    Service(String name, double price, ServiceCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ServiceCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name;
    }


}

