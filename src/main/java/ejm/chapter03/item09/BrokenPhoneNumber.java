package ejm.chapter03.item09;

// Doesn't Override hashCode()
public class BrokenPhoneNumber {

    protected short zipCode;
    protected short areaCode;
    protected short mainNumber;

    public BrokenPhoneNumber(int zipCode, int areaCode, int mainNumber) {
        checkRange(zipCode, 999, "Zip Code");
        checkRange(areaCode, 99, "Area Code");
        checkRange(mainNumber, 9999999, "Main Number");
        this.zipCode = (short) zipCode;
        this.areaCode = (short) areaCode;
        this.mainNumber = (short) mainNumber;
    }

    private static void checkRange(int val, int max, String name) {
        if (val < 0 || val > max) 
            throw new IllegalArgumentException(name + ":" + val);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) 
            return true;
        if (!(o instanceof BrokenPhoneNumber))
            return false;
        BrokenPhoneNumber bpn = (BrokenPhoneNumber) o;
        return bpn.zipCode == zipCode && bpn.areaCode == areaCode
                && bpn.mainNumber == mainNumber;
    }

}
