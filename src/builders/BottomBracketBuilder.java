package builders;

import entities.BottomBracket;
import validation.*;

public class BottomBracketBuilder {

    public static BottomBracket build(String serialNumber, String torqueSensorSerialNumber) throws ValidationException {

        LongSerialNumberValidator longSerialNumberValidator = new LongSerialNumberValidator();
        DigitsASCIIValidator digitsASCIIValidator = new DigitsASCIIValidator();

        if(longSerialNumberValidator.isValid(serialNumber)){
            throw new ValidationException("Bottom Bracket Serial number '" +serialNumber+ "' not valid:\n\nPlease enter a positive number (Max value: "+Integer.MAX_VALUE+")");
        }
        if(digitsASCIIValidator.isValid(torqueSensorSerialNumber)){
            throw new ValidationException("Bottom Bracket Torque sensor serial number '" +torqueSensorSerialNumber+ "' not valid:\n\nPlease enter a maximum 12 alphanumeric characters");
        }

        int serial = Integer.parseInt(serialNumber);

        return new BottomBracket(serial,torqueSensorSerialNumber);

    }
}
