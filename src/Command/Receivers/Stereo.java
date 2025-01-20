package Command.Receivers;

public class Stereo {
    String position;

    public Stereo() {
    }

    public Stereo(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(position + " Stereo on");
    }

    public void off() {
        System.out.println(position + " Stereo off");
    }

    public void setCD() {
        System.out.println(position + " CD set");
    }

    public void setVolume(int volume) {
        System.out.println(position + " volume set to " + volume);
    }

}
