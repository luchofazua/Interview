package entities;

public class Remote {

    private Integer serialNumber;
    private Integer boardSerialNumber;

    public Remote(Integer serialNumber, Integer boardSerialNumber) {
        this.serialNumber = serialNumber;
        this.boardSerialNumber = boardSerialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public Integer getBoardSerialNumber() {
        return boardSerialNumber;
    }
}
