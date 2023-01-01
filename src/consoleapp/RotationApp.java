package consoleapp;

import java.time.Instant;

public class RotationApp {
    public static void main(String[] args) {
        Frost mage = new Frost("Simas", "Troll", "Mage", "Frost");

        Instant end = Instant.now().plusSeconds(60);
        while (Instant.now().compareTo(end) < 0) {
            mage.rotation();
        }

//        System.out.println(Thread.currentThread().getId() + "-------------------------------");
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getId() + "-------------------------------");
//            }
//        }).run();

        System.out.println(" " + Frost.getFrostboltCount());
        System.out.println("Brain freeze count: " + Frost.getBrainFreezeCount());
        System.out.println(" " + Frost.getFlurryCount());
        System.out.println(" " + Frost.getIceLanceCount());

        System.out.println("-----------------------------------------------------------");

        Retribution paladin = new Retribution("Simasp", "Blood elf", "Paladin", "Retribution", new RetributionCharges(0));
        paladin.crusaderStrike();
        paladin.crusaderStrike();
        paladin.crusaderStrike();
        System.out.println(paladin.retributionCharges);
    }
}
