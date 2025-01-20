package Command.Tests;

import Command.Commands.GarageDoorOpenCommand;
import Command.Commands.LightOnCommand;
import Command.Invokers.SimpleRemoteControl;
import Command.Receivers.GarageDoor;
import Command.Receivers.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
