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

    public void setMinTemperature(double minTemperature) {
        if (isAirConInstalled()) {
            this.minTemperature = minTemperature;
        }
    }

    public boolean decreaseTemperature() {

        if (isAirConInstalled()) {
            if (temperature > minTemperature + 1) {
                temperature -= 1;
                return true;
            } else if (temperature <= minTemperature + 1 && temperature >= minTemperature) {
                temperature = minTemperature;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
