package entities;

public class BottomBracket {

    private int serialNumber;
    private String torqueSensorSerialNumber;

    public BottomBracket() {
    }

    public BottomBracket(int serialNumber, String torqueSensorSerialNumber) {
        this.serialNumber = serialNumber;
        this.torqueSensorSerialNumber = torqueSensorSerialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getTorqueSensorSerialNumber() {
        return torqueSensorSerialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setTorqueSensorSerialNumber(String torqueSensorSerialNumber) {
        this.torqueSensorSerialNumber = torqueSensorSerialNumber;
    }
}
