package consoleapp;

public class Retribution extends WowCharacter {
    RetributionCharges retributionCharges;
    static int bladeOfJusticeCount = 0;
    private int lastTimeUsedBOJ;
    private int lastTimeUsedDS;

    public Retribution(String nickname, String race, String class1, String spec, RetributionCharges retributionCharges) {
        super(nickname, race, class1, spec);
        this.retributionCharges = retributionCharges;
    }


    public void crusaderStrike() {
        durationTime();
        System.out.println(" used Crusader Strike");
        retributionCharges = retributionCharges.add(new RetributionCharges(1));
        duration += 1;
    }

    public void bladeOfJusticeActions() {
        //if (bladeOfJusticeCount < 1 || duration - lastTimeUsedBOJ >= 8) {
            durationTime();
            System.out.println(" used Blade of Justice");
            retributionCharges = retributionCharges.add(new RetributionCharges(2));
            bladeOfJusticeCount++;
            lastTimeUsedBOJ = duration;
            duration += 1;
    }

    public void bladeOfJustice() {
        if (bladeOfJusticeCount < 1 || duration - lastTimeUsedBOJ >= 8)
            bladeOfJusticeActions();
    }

    public void templarVerdict() {
        durationTime();
        System.out.println(" used Templar's Verdict");
        retributionCharges = retributionCharges.substract(new RetributionCharges(2)); // to zrobic w  RetributionCharges?
        duration += 1;
    }

    public void divineStorm() {
        //if (retributionCharges.threeCostAbility()) {
        durationTime();
        System.out.println(" used Divine Storm");
        retributionCharges = retributionCharges.substract(new RetributionCharges(3));
        lastTimeUsedDS = duration;
        duration += 1;
        //}
    }

    @Override
    public void rotation(int duration) {
        while (this.duration <= duration) {
            bladeOfJustice();
            while (!retributionCharges.threeCostAbility() && (this.duration - lastTimeUsedDS >= 6 || lastTimeUsedDS == 0)) {
                bladeOfJustice();
                crusaderStrike();
                if (retributionCharges.threeCostAbility())
                    divineStorm();
            }
            if (retributionCharges.twoCostAbility())
                templarVerdict();
            crusaderStrike();
        }
    }
}


