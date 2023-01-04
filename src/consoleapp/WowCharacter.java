package consoleapp;

public abstract class WowCharacter {
    String nickname;
    String race;
    String class1;
    String spec;
    int duration = 0;


    public WowCharacter(String nickname, String race, String class1, String spec) {
        this.nickname = nickname;
        this.race = race;
        this.class1 = class1;
        this.spec = spec;
    }
    public void durationTime(){
        int time = duration;
        int second = time % 60;
        int minute = time / 60;
        System.out.print(minute + ":" + second);
    }

    public abstract void rotation(int seconds);
}
