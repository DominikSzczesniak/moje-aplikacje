package consoleapp;

import java.util.Objects;

public class RetributionCharges {
    private final int value;
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        RetributionCharges that = (RetributionCharges) o;
//        return value == that.value;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(value);
//    }

    public int getValue() {
        return value;
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
