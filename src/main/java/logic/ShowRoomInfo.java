package logic;

public class ShowRoomInfo {

    public void showRoomInfo(Room room) {
        System.out.println(">> Powierzchnia pokoju o nazwie " + room.getRoomName() + " wynosi: " + room.getArea() + " m2.");
        System.out.println(">> Temperatura pokoju o nazwie " + room.getRoomName() + " wynosi: " + room.getTemperature() + " stopni Celcjusza.");

        if (room.isAirConInstalled()) {
            System.out.println(">> Pokój o nazwie " + room.getRoomName() + " ma klimatyzację.");
        } else {
            System.out.println(">> Pokój o nazwie " + room.getRoomName() + " nie ma klimatyzacji.");
        }
    }

    public void showUpdatedInfo(Room room) {
        System.out.println("Temperatura w pokoju o nazwie " + room.getRoomName() + " po obniżeniu wynosi: " + room.getTemperature() + " stopni Celcjusza.");
        System.out.println("");
    }

    public void noAirConMessage() {
        System.out.println("Nie można obniżyć temperatury w pokoju bez klimatyzacji.");
    }

    public void errorMessage(Room room) {
        if (room.isAirConInstalled()) {
            System.out.println("W pokoju o nazwie " + room.getRoomName()
                    + " nie można obniżyć temperatury, ponieważ jest ona niższa lub równa temperaturze minimalnej klimatyzatora.");
            System.out.println("");
        } else {
            noAirConMessage();
        }
    }

    public void tempLimitInfo(Room room) {
        if (room.isAirConInstalled()) {
            System.out.println("Aktualna temperatura minimalna klimatyzatora wynosi: " + room.getMinTemperature() + " stopni Celcjusza.");
        } else {
            System.out.println("Nie można ustawić temperatury minimalnej, bo w pokoju nie ma klimatyzatora.");
        }
    }

    public void testRoom(Room room) {
        tempLimitInfo(room);
        if (room.decreaseTemperature()) {
            showUpdatedInfo(room);
        } else {
            errorMessage(room);
        }
    }
}