package consoleapp;

public class RetributionCharges {
    private final int value; // ZMIENILEM FINAL NA STATIC
    RetributionCharges(int value){
        if (value < 0 || value > 5){
            throw new IllegalArgumentException("Retribution charges can only be created with values 0-5 but provided: " + value);
        }
        this.value = value;
    }
    public RetributionCharges add(RetributionCharges retributionCharges) {
        return new RetributionCharges(Math.min(value + retributionCharges.value, 5));
    }

    @Override
    public String toString() {
        return "RetributionCharges{" +
                "value=" + value +
                '}';
    }

}
