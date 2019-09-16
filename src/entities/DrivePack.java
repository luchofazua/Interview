package entities;

public class DrivePack {

    private Integer serialNumber;
    private Double softwareVersion;
    private Integer motorSerialNumber;

    public DrivePack(Integer serialNumber, Double softwareVersion, Integer motorSerialNumber) {
        this.serialNumber = serialNumber;
        this.softwareVersion = softwareVersion;
        this.motorSerialNumber = motorSerialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public Double getSoftwareVersion() {
        return softwareVersion;
    }

    public Integer getMotorSerialNumber() {
        return motorSerialNumber;
    }
}
