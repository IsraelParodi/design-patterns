package Command.BookExample.Tests;

import Command.BookExample.Commands.GarageDoorOpenCommand;
import Command.BookExample.Commands.LightOnCommand;
import Command.BookExample.Invokers.SimpleRemoteControl;
import Command.BookExample.Receivers.GarageDoor;
import Command.BookExample.Receivers.Light;

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
