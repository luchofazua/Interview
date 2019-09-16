package evaluation;

import entities.EvationDriveSystem;

public class Tester {

    static public String test(EvationDriveSystem evationDriveSystem){
        String result;

        int output = RandomEvaluator.evaluate(evationDriveSystem);

        result = output >85 && output<140 ?  "Testing passed" : "Testing failed";
        result += " with output: "+output+"W.";

        return result;
    }
}
