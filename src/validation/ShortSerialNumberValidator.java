package validation;

public class ShortSerialNumberValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        try {
            short value = Short.parseShort(input);
            if ( value > 0 ) return false;
        }catch (NumberFormatException e){
            return true;
        }
        return true;
    }
}
