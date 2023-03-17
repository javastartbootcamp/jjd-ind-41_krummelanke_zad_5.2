package logic;

public class Room {

    private String roomName;
    private double area;
    private double temperature;
    private boolean airConInstalled;
    private double minTemperature;

    public Room(String roomName, double area, double temperature, boolean airConInstalled) {
        this.roomName = roomName;
        this.area = area;
        this.temperature = temperature;
        this.airConInstalled = airConInstalled;
    }

    public Room(String roomName, double area, double temperature, boolean airConInstalled, double minTemperature) {

        this(roomName, area, temperature, airConInstalled);
        this.minTemperature = minTemperature;
    }

    public double getArea() {
        return area;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isAirConInstalled() {
        return airConInstalled;
    }

    public String getRoomName() {
        return roomName;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature, Room room) {
        if (isAirConInstalled()) {
            this.minTemperature = minTemperature;
        } else {
            ShowRoomInfo info = new ShowRoomInfo();
            info.noAirConMessage(room);
        }
    }

    public double decreaseTemperature(Room room) {
        ShowRoomInfo info = new ShowRoomInfo();
        if (isAirConInstalled()) {
            if (room.temperature < (room.minTemperature + 1)) {
                room.temperature = room.minTemperature;
                info.tempReachedLimit(room);
                return room.temperature;
            } else {
                if (room.temperature > room.minTemperature) {
                    room.temperature -= 1;
                    info.showUpdatedInfo(room);
                    return room.temperature;
                } else {
                    info.tempReachedLimit(room);
                    return room.temperature;
                }
            }
        } else {
            info.noAirConMessage(room);
            return room.temperature;
        }
    }
}
