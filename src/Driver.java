import java.util.Set;

public class Driver {

    public static void main(String[] args) {
        Employee Lvl1 = new Employee("Henry", Set.of(ServiceCategory.PEDICURE));
        Employee Lvl2 = new Employee("Jessica", Set.of(ServiceCategory.MANICURE));

        Service s1 = Service.GEL_MANICURE;
        Service s2 = Service.BASIC_PEDICURE;

        if (Lvl1.canPerform(Service.BASIC_PEDICURE)) {
            System.out.println(Lvl1 + " will perform " + Service.BASIC_PEDICURE);
        } else {
            System.out.println(Lvl1 + " doesn't perform that service, choose another technician");
        }
        if (Lvl2.canPerform(Service.BASIC_PEDICURE)) {
            System.out.println(Lvl2 + " will perform " + Service.BASIC_PEDICURE);
        } else {
            System.out.println(Lvl2 + " doesn't perform that service, choose another technician");
        }
    }

}
