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
        int seconds = time % 60;
        int minutes = time / 60;
        String str = String.format("%d:%02d", minutes, seconds);
        System.out.print(str);
    }

    public abstract void rotation(int seconds);
}
