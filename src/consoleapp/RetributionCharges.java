package consoleapp;

public class RetributionCharges {
    private int value;
    RetributionCharges(int value){
        if (value < 0 || value > 5){
            throw new IllegalArgumentException("Retribution charges can only be created with values 0-5 but provided: " + value);
        }
        this.value = value;
    }
    public RetributionCharges add(RetributionCharges retributionCharges) {
        return new RetributionCharges(Math.min(value + retributionCharges.value, 5));
    }

    public RetributionCharges substract(RetributionCharges retributionCharges) {
        return new RetributionCharges(value - retributionCharges.value);
    }

    @Override
    public String toString() {
        return "RetributionCharges{" +
                "value=" + value +
                '}';
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean twoCostAbility(){
        int checking = new RetributionCharges(value).getValue();
        if (checking >= 2)
            return true;
        return false;
    }

    public boolean threeCostAbility(){
        int checking = new RetributionCharges(value).getValue();
        if (checking >= 3)
            return true;
        return false;
    }
}
