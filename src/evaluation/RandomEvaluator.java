package evaluation;

import entities.EvationDriveSystem;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomEvaluator {


    public static int evaluate(EvationDriveSystem evationDriveSystem){

        // Mock evaluator is supposed to do something with the parameter

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random r = new Random();
        int low = 80;
        int high = 150;

        return r.nextInt(high-low) + low;
    }
}
