package ejm.chapter03.item10;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class PhoneNumber {

    protected int zipCode;
    protected int areaCode;
    protected int mainNumber;

    public PhoneNumber(int zipCode, int areaCode, int mainNumber) {
        checkRange(zipCode, 999, "Zip Code");
        checkRange(areaCode, 99, "Area Code");
        checkRange(mainNumber, 9999999, "Main Number");
        this.zipCode = zipCode;
        this.areaCode = areaCode;
        this.mainNumber = mainNumber;
    }

    private static void checkRange(int val, int max, String name) {
        if (val < 0 || val > max) 
            throw new IllegalArgumentException(name + ":" + val);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) 
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.zipCode == zipCode && pn.areaCode == areaCode
                && pn.mainNumber == mainNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipCode, areaCode, mainNumber);
    }

    /**
     * Returns the string representation of this phone number. The string 
     * consists of twelve characters of the form (XXX) YY-ZZZZZZZ. 
     *
     * If any of the fields is too small to small to fill up its field, the 
     * field is padded with leading zeros.
     */
    @Override
    public String toString() {
        return String.format("(%03d) %02d-%07d", zipCode, areaCode, mainNumber);
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(977, 01, 4400111), "A Company");
        System.out.println(m);
    }
}
