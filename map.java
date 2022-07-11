import java.util.Map;
import java.util.HashMap;

public class map
{
    public static void main(String[] args) {

        Map cars = new HashMap();
        cars.put("BMW", 2);
        cars.put("Audi", 5);
        cars.put("Honda", 3);
        cars.put("Mercedes", 6);
        cars.put("Suzuki", 1);
        cars.put("ferrari",2);
        int size = cars.size();

        System.out.println(cars.get("Suzuki"));
    }
}
