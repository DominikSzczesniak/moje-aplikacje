package consoleapp;

public abstract class WowCharacter {
    String nickname;
    String race;
    String class1;
    String spec;

    public WowCharacter(String nickname, String race, String class1, String spec) {
        this.nickname = nickname;
        this.race = race;
        this.class1 = class1;
        this.spec = spec;
    }
    public abstract void rotation();
}
