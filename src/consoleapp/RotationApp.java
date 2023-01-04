package consoleapp;

import java.time.Instant;

public class RotationApp {
    public static void main(String[] args) {
        Frost mage = new Frost("Simas", "Troll", "Mage", "Frost");

        mage.rotation(300);
        mage.frostRotationSummary();

        System.out.println("-----------------------------------------------------------");

        Retribution paladin = new Retribution("Simasp", "Blood elf", "Paladin", "Retribution", new RetributionCharges(0));
//        paladin.crusaderStrike();
//        paladin.templarVerdict();
//        paladin.crusaderStrike();
//        paladin.bladeOfJustice();
//        paladin.bladeOfJustice();
//        paladin.templarVerdict();
//        System.out.println(paladin.retributionCharges);
//        paladin.crusaderStrike();
//        paladin.templarVerdict();
//        System.out.println("Duration : " + paladin.duration);
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.divineStorm();
//        paladin.crusaderStrike();
//        System.out.println(paladin.retributionCharges);
//        paladin.divineStorm();
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.bladeOfJustice();
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.crusaderStrike();
//        paladin.bladeOfJustice();
//        paladin.bladeOfJustice();
//        System.out.println(paladin.retributionCharges);
        System.out.println("-----------------------------------------------------------");

        paladin.rotation(300);
    }
}
