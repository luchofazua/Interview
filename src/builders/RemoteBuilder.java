package builders;

import entities.Remote;
import validation.LongSerialNumberValidator;
import validation.ShortSerialNumberValidator;
import validation.ValidationException;

public class RemoteBuilder {

    public static Remote build(String serialNumber, String boardSerialNumber) throws ValidationException {

        LongSerialNumberValidator longSerialNumberValidator = new LongSerialNumberValidator();
        ShortSerialNumberValidator shortSerialNumberValidator = new ShortSerialNumberValidator();

        if(longSerialNumberValidator.isValid(serialNumber)){
            throw new ValidationException("Remote Serial number '" +serialNumber+ "' not valid:\n\nPlease enter a positive number\n(Max value: "+Integer.MAX_VALUE+")");
        }

        if(shortSerialNumberValidator.isValid(boardSerialNumber)){
            throw new ValidationException("Remote HMI board serial number '" +boardSerialNumber+ "' not valid:\n\nPlease enter a positive number\n(Max value: "+Short.MAX_VALUE+")");
        }

        int serial = Integer.parseInt(serialNumber);
        short board = Short.parseShort(boardSerialNumber);

        return new Remote(serial,board);

    }
}
