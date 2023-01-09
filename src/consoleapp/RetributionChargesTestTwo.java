package consoleapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RetributionChargesTestTwo {

    RetributionCharges first;
    RetributionCharges second;

    @BeforeEach
    void setUp() {
        first = new RetributionCharges(0);
        second = new RetributionCharges(0);
    }

    @Test
    public void AddingTwoChargesToTwoChargesShouldEqualFour() {
        first.setValue(2);
        second.setValue(2);
        int result = (first.add(second)).getValue();
        assertEquals(4, result);
    }

    @Test
    public void AddingTwoChargesToFourChargesShouldEqualFive() {
        first.setValue(4);
        second.setValue(2);
        int result = (first.add(second)).getValue();
        assertEquals(5, result);
    }

    @Test
    public void SubstractingFiveFromFiveShouldEqualZero() {
        first.setValue(5);
        second.setValue(5);
        int result = (first.substract(second)).getValue();
        assertEquals(0, result);
    }

    @Test
    public void SubstractingZeroFromFiveShouldEqualFive() {
        first.setValue(5);
        second.setValue(0);
        int result = (first.substract(second)).getValue();
        assertEquals(5, result);
    }

    @Test
    public void SubstractingThreeFromZeroShouldThrowException() {
        first.setValue(0);
        second.setValue(3);
        assertThrows(IllegalArgumentException.class, ()-> {
            (first.substract(second)).getValue();
            throw new IllegalArgumentException();
        });
    }

}