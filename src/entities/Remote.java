package entities;

public class Remote {

    private int serialNumber;
    private short boardSerialNumber;

    public Remote() {
    }

    public Remote(int serialNumber, short boardSerialNumber) {
        this.serialNumber = serialNumber;
        this.boardSerialNumber = boardSerialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public short getBoardSerialNumber() {
        return boardSerialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setBoardSerialNumber(short boardSerialNumber) {
        this.boardSerialNumber = boardSerialNumber;
    }
}
