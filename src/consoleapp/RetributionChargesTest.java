package consoleapp;

public class RetributionChargesTest {
    public static void main(String[] args) {
        System.out.println(new RetributionCharges(0));
        System.out.println(new RetributionCharges(1));
        System.out.println(new RetributionCharges(2));
        System.out.println(new RetributionCharges(3));
        System.out.println(new RetributionCharges(4));
        System.out.println(new RetributionCharges(5));
        shouldThrowException(()->new RetributionCharges(-1));
        shouldThrowException(()->new RetributionCharges(6));
        System.out.println(new RetributionCharges(0).add(new RetributionCharges(1)) + " = 1");
        System.out.println(new RetributionCharges(5).add(new RetributionCharges(2)) + " = 5");
    }

    private static void shouldThrowException(Runnable action) {
        try {
            action.run();
            System.out.println("No exception thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception was thrown" + e);
        }
    }
}
