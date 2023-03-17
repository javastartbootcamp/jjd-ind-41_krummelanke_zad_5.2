package pl.javastart.task;

import logic.Room;
import logic.ShowRoomInfo;

public class Main {
    public static void main(String[] args) {
        Room greenRoom = new Room("Zielony", 45, 26.7, true, 16);
        Room darkRoom = new Room("Czarny", 35, 21.7, true, 21);
        Room yellowRoom = new Room("Żółty", 16, 29, false);

        ShowRoomInfo info = new ShowRoomInfo();

        info.showRoomInfo(greenRoom);
        greenRoom.setMinTemperature(30);
        info.testRoom(greenRoom);

        info.showRoomInfo(darkRoom);
        darkRoom.setMinTemperature(21);
        info.testRoom(darkRoom);

        info.showRoomInfo(yellowRoom);
        yellowRoom.setMinTemperature(21);
        info.testRoom(yellowRoom);
    }
}
