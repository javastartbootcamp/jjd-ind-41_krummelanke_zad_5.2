package logic;

public class ShowRoomInfo {

    public void showRoomInfo(Room room) {
        System.out.println("Powierzchnia pokoju o nazwie " + room.getRoomName() + " wynosi: " + room.getArea() + " m2.");
        System.out.println("Temperatura pokoju o nazwie " + room.getRoomName() + " wynosi: " + room.getTemperature() + " stopni Celcjusza.");

        if (room.isAirConInstalled()) {
            System.out.println("Pokój o nazwie " + room.getRoomName() + " ma klimatyzację.");
        } else {
            System.out.println("Pokój o nazwie " + room.getRoomName() + " nie ma klimatyzacji.");
        }
    }

    public void showUpdatedInfo(Room room) {
        System.out.println("Aktualna temperatura w pokoju o nazwie " + room.getRoomName() + " wynosi: " + room.getTemperature() + " stopni Celcjusza.");

    }

    public void noAirConMessage(Room room) {
        System.out.println("W pokoju o nazwie " + room.getRoomName() + " brak klimatyzacji. Nie można obniżyć temperatury.");
    }

    public void tempReachedLimit(Room room) {
        System.out.println("Temperatura minimalna w pokoju o nazwie " + room.getRoomName()
                + " została ustawiona na poziomie " + room.getMinTemperature() + " stopni Celcjusza i nie można jej bardziej obniżyć.");
    }
}
