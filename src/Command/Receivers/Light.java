package Command.Receivers;

public class Light {
    String position;

    public Light() {
    }

    public Light(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(position + " Light on");
    }

    public void off() {
        System.out.println(position + " Light off");
    }
}
