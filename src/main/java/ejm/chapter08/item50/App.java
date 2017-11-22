package ejm.chapter08.item50;

public class App {

    public static void main(String[] args) {
        String country = "Nepal";
        String city = "Kathmandu";
        String addressStr = country + "#" + city;

        Address address = new Address(country, city);

        System.out.println("City (from str, Have to parse): " + addressStr.split("#")[1]);
        System.out.println("City (from object, direct access): " + address.getCity());
    }
}

