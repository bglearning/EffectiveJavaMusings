package ejm.chapter03.item09;

import java.util.Map;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        Map<BrokenPhoneNumber, String> brokenNumbers = new HashMap<>();
        Map<PhoneNumber, String> numbers = new HashMap<>();

        brokenNumbers.put(new BrokenPhoneNumber(977, 1, 4944444), "Heaven");
        numbers.put(new PhoneNumber(977, 1, 4944444), "Heaven");

        System.out.println(brokenNumbers.get(new BrokenPhoneNumber(977, 1, 4944444)));
        System.out.println(numbers.get(new PhoneNumber(977, 1, 4944444)));
    }
}
