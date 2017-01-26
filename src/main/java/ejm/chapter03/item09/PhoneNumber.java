package ejm.chapter03.item09;

import java.util.Objects;

// Overrides hashCode()
public class PhoneNumber extends BrokenPhoneNumber {

    public PhoneNumber(int zipCode, int areaCode, int mainNumber) {
        super(zipCode, areaCode, mainNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipCode, areaCode, mainNumber);
    }
}
