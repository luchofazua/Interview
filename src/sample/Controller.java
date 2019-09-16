package sample;

import entities.BottomBracket;
import entities.DrivePack;
import entities.EvationDriveSystem;
import entities.Remote;
import evaluation.RandomEvaluator;
import evaluation.Tester;

public class Controller {


    public void createAndTestButtonClicked(){
        //Test every input and move on
        System.out.println("Validating all values...");
        EvationDriveSystem evationDriveSystem = new EvationDriveSystem(new BottomBracket(454,"GHJA5323"), new DrivePack(512,32.53,312761), new Remote(654645,456456));
        System.out.println("Testing...");
        System.out.println(Tester.test(evationDriveSystem));
    }
}
