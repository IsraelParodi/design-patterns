package Command.BookExample.Receivers;

public class Hottub {
    String position;

    public Hottub() {
    }

    public Hottub(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(position + " hot tub on");
    }

    public void off() {
        System.out.println(position + " hot tub off");
    }

}
