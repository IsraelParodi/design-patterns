package Command.BookExample.Receivers;

public class TV {
    String position;

    public TV() {
    }

    public TV(String position) {
        this.position = position;
    }

    public void on() {
        System.out.println(position + " TV on");
    }

    public void off() {
        System.out.println(position + " TV off");
    }

}
