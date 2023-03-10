package consoleapp;

import java.util.Random;

public class Frost extends WowCharacter{
    public Frost(String nickname, String race, String class1, String spec) {
        super(nickname, race, class1, spec);
    }

    static int frostboltCount = 0;
    static int brainFreezeCount = 0;
    static int iceLanceCount = 0;
    static int flurryCount = 0;

//    private int duration = 0;
//
//    private void durationTime(){
//        int time = getDuration();
//        int second = time % 60;
//        int minute = time / 60;
//        System.out.print(minute + ":" + second);
//    }
//
//    public int getDuration() {
//        return duration;
//    }

    Random rnd = new Random();
    public void castFrostbolt(){
        duration += 2;
        durationTime();
        System.out.println("  Frostbolt");
        frostboltCount++;
        //sleep(2);
    }
    public void castIceLance(){
        duration += 1;
        durationTime();
        System.out.println("  Ice lance");
        iceLanceCount++;
        //sleep(1);
    }

    public void castFlurry(){
        duration += 1;
        durationTime();
        System.out.println("  Flurry");
        flurryCount++;
        //sleep(1);
    }

    private void sleep(int numberOfSeconds){
        try {
            Thread.sleep(numberOfSeconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void rotation(int duration){
        while (this.duration <= duration) {
            castFrostbolt();
            int procChanceBF = rnd.nextInt(101);
            int procChanceFOF = rnd.nextInt(101);
            if (procChanceBF >= 70 && procChanceFOF >= 85) {
                System.out.println("**BRAIN FREEZE AND FINGERS OF FROST**");
                castIceLance();
                castFlurry();
                castIceLance();
                castIceLance();
                brainFreezeCount++;
            } else if (procChanceBF >= 70) {
                System.out.println("**BRAIN FREEZE**");
                castFlurry();
                castIceLance();
                castIceLance();
                brainFreezeCount++;
            } else if (procChanceFOF >= 85) {
                System.out.println("**FINGERS OF FROST**");
                castIceLance();
            }
        }
        System.out.println("Duration of combat: " + this.duration);
    }


    public static int getFrostboltCount() {
        System.out.print("Frostbolt count:");
        return frostboltCount;
    }

    public static int getBrainFreezeCount() {
        return brainFreezeCount;
    }

    public static int getIceLanceCount() {
        System.out.print("Ice lance count:");
        return iceLanceCount;
    }

    public static int getFlurryCount() {
        System.out.print("Flurry count:");
        return flurryCount;
    }

    public void frostRotationSummary(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Summary:");
        System.out.println(" " + Frost.getFrostboltCount());
        System.out.println("Brain freeze count: " + Frost.getBrainFreezeCount());
        System.out.println(" " + Frost.getFlurryCount());
        System.out.println(" " + Frost.getIceLanceCount());
    }

//    public boolean brainFreezeProc(){
//        int proc = rnd.nextInt();
//        if (proc >= 70){
//            brainFreezeCount++;
//            System.out.println("BRAIN FREEZE!!");
//            return true;
//        }
//        return false;
//    }
//    public boolean iceLanceProc(){
//        int procLance = rnd.nextInt(101);
//        if (procLance >= 85) {
//            System.out.println("FINGERS OF FROST!!");
//            return true;
//        }
//        return false;
//    }

//    public void rotaion() {
//        castFrostbolt();
//        brainFreezeProc();
//        iceLanceProc();
//        if (brainFreezeProc() && iceLanceProc()) {
//                castIceLance();
//                castFlurry();
//                castIceLance();
//                castIceLance();
//            } else if (brainFreezeProc() == true && iceLanceProc() == false) {
//                castFlurry();
//                castIceLance();
//                castIceLance();
//            } else if (iceLanceProc() == true && brainFreezeProc() == false) {
//                castIceLance();
//            }
//    }

}
