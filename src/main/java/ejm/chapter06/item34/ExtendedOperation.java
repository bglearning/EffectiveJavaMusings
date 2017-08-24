package ejm.chapter06.item34;

public enum ExtendedOperation implements Operation {

    EXP("^") {
        public double apply(double a, double b) { return Math.pow(a, b); }
    },

    REMAINDER("%") {
        public double apply(double a, double b) { return a % b; }
    };

    private final String symbol; 

    private ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

}
