package Command.Receivers;

public class GarageDoor {
    public GarageDoor() {
    }

    public GarageDoor(String position) {
        System.out.println("GarageDoor " + position);
    }
    public void up() {
        System.out.println("Garage up");
    }

    public void down() {
        System.out.println("Garage down");
    }

    public void stop() {
        System.out.println("Garage stop");
    }

    public void ligthOn() {
        System.out.println("Garage ligth on");
    }

    public void ligthOff() {
        System.out.println("Garage ligth off");
    }
}
