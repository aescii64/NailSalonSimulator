public enum Service {

    BASIC_MANICURE("Basic Manicure", 20.00),
    GEL_MANICURE("Gel Manicure", 40.00),
    DELUXE_MANICURE("Deluxe Manicure", 55.00),
    BASIC_PEDICURE("Basic Pedicure", 35.00),
    SPA_PEDICURE("Spa Pedicure", 45.00),
    DELUXE_PEDICURE("Deluxe Pedicure", 50.00);

    private final String name;
    private final double price;

    Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

