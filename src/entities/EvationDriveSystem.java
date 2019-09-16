package entities;

public class EvationDriveSystem {
    private BottomBracket bottomBracket;
    private DrivePack drivePack;
    private Remote remote;


    public EvationDriveSystem(BottomBracket bottomBracket, DrivePack drivePack, Remote remote) {
        this.bottomBracket = bottomBracket;
        this.drivePack = drivePack;
        this.remote = remote;
    }

    public BottomBracket getBottomBracket() {
        return bottomBracket;
    }

    public DrivePack getDrivePack() {
        return drivePack;
    }

    public Remote getRemote() {
        return remote;
    }
}
