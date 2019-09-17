package sample;

import builders.BottomBracketBuilder;
import builders.DrivePackBuilder;
import builders.RemoteBuilder;
import entities.EvationDriveSystem;
import evaluation.Tester;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import ui.AlertBox;
import validation.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField dpsn;
    @FXML
    private TextField dpsv;
    @FXML
    private TextField dpmsn;
    @FXML
    private TextField bbsn;
    @FXML
    private TextField bbtssn;
    @FXML
    private TextField rsn;
    @FXML
    private TextField rhbsn;


    public void createAndTestButtonClicked(){
        AlertBox alertBox = new AlertBox();


        EvationDriveSystem evationDriveSystem = new EvationDriveSystem();
        try {
            //Validate input, create parts and ensemble drive system
            evationDriveSystem.setDrivePack(DrivePackBuilder.build(dpsn.getText(),dpsv.getText(),dpmsn.getText()));
            evationDriveSystem.setBottomBracket(BottomBracketBuilder.build(bbsn.getText(),bbtssn.getText()));
            evationDriveSystem.setRemote(RemoteBuilder.build(rsn.getText(),rhbsn.getText()));
        }catch (ValidationException e){
            alertBox.display("Please revise...", e.getMessage());
            return;
        }

        alertBox.display("Testing, please wait...", "Testing, please wait...");

        //Wait until test finished and change content
        alertBox.change("Test result" , Tester.test(evationDriveSystem));
        clearValues();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private void clearValues(){
        this.dpsn.clear();
        this.dpsv.clear();
        this.dpmsn.clear();
        this.bbsn.clear();
        this.bbtssn.clear();
        this.rsn.clear();
        this.rhbsn.clear();
    }

}