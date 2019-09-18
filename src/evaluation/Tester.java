package evaluation;

import entities.EvationDriveSystem;

public class Tester {

    static public String test(EvationDriveSystem evationDriveSystem){

        int output = RandomEvaluator.evaluate(evationDriveSystem);

        String result = output > 85 && output < 140 ? "Testing passed" : "Testing failed";
        result += " with output: "+output+"W.";

        return result;
    }
}
