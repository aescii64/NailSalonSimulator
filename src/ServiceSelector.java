import java.util.Random;
public class ServiceSelector {

    private static final Random random = new Random();

    public static Service randomService() {
        Service[] services = Service.values();
        return services[random.nextInt(services.length)];
    }
}
