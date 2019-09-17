package builders;

import entities.DrivePack;
import validation.LongSerialNumberValidator;
import validation.ShortSerialNumberValidator;
import validation.ValidationException;
import validation.VersionValidator;

public class DrivePackBuilder {

    public static DrivePack build(String serialNumber, String softwareVersion, String motorSerialNumber) throws ValidationException {

        //Validate the inputs
        LongSerialNumberValidator longSerialNumberValidator = new LongSerialNumberValidator();
        ShortSerialNumberValidator shortSerialNumberValidator = new ShortSerialNumberValidator();
        VersionValidator versionValidator = new VersionValidator();

        if(longSerialNumberValidator.isValid(serialNumber)){
            throw new ValidationException("Drivepack Serial number '" +serialNumber+ "' not valid:\n\nPlease enter a positive number\n(Max value: "+Integer.MAX_VALUE+")");
        }
        if(versionValidator.isValid(softwareVersion)){
            throw new ValidationException("Drivepack Software version '" +softwareVersion+ "' not valid:\n\nPlease enter two positive numbers separated by a '.'\n(Ex: '10.03'  - Max value: "+Byte.MAX_VALUE+")");
        }
        if(shortSerialNumberValidator.isValid(motorSerialNumber)){
            throw new ValidationException("Drivepack Motor serial number '" +motorSerialNumber+ "' not valid:\n\nPlease enter a positive number\n(Max value: "+Short.MAX_VALUE+")");
        }

        //Build the object
        int serial = Integer.parseInt(serialNumber);

        /* Separate two values, shift left 4 positions the first one then sum the second
         * MSB=before comma  -  LSB=after comma
         * E.g. introducing 4.19 will translate to 0x1304
         */
        String[] versionValues = softwareVersion.split("\\.");
        short version = (short) ((Byte.parseByte(versionValues[0])*16)+Byte.parseByte(versionValues[1]));

        short motor = Short.parseShort(motorSerialNumber);

        return new DrivePack(serial,version,motor);

    }
}
