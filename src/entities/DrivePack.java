package entities;

public class DrivePack {

    private int serialNumber;
    private short softwareVersion;
    private short motorSerialNumber;

    public DrivePack() {
    }

    public DrivePack(int serialNumber, short softwareVersion, short motorSerialNumber) {
        this.serialNumber = serialNumber;
        this.softwareVersion = softwareVersion;
        this.motorSerialNumber = motorSerialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public short getSoftwareVersion() {
        return softwareVersion;
    }

    public short getMotorSerialNumber() {
        return motorSerialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setSoftwareVersion(short softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public void setMotorSerialNumber(short motorSerialNumber) {
        this.motorSerialNumber = motorSerialNumber;
    }
}
