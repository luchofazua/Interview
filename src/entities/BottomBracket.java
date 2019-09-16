package entities;

public class BottomBracket {

    private Integer serialNumber;
    private String torqueSensorSerialNumber;

    public BottomBracket(Integer serialNumber, String torqueSensorSerialNumber) {
        this.serialNumber = serialNumber;
        this.torqueSensorSerialNumber = torqueSensorSerialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getTorqueSensorSerialNumber() {
        return torqueSensorSerialNumber;
    }
}
